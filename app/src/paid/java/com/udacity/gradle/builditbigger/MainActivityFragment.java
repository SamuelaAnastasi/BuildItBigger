/*
 * This project is part of Android Developer Nanodegree Scholarship Program by
 * Udacity and Google
 * Created by Samuela Anastasi
 */
package com.udacity.gradle.builditbigger;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;

import com.example.android.androidjokeslib.JokeDisplayActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * A simple {@link Fragment} subclass.
 */
public class MainActivityFragment extends Fragment  implements JokeActivityLauncher{
    @BindView(R.id.progressBar)
    public ProgressBar progressBar;


    public MainActivityFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_main, container, false);
//
        ButterKnife.bind(this, root);

        return root;
    }

    @Override
    public void launchJokeActivity(String joke) {
        progressBar.setVisibility(View.GONE);
        Intent intent = new Intent(getActivity(), JokeDisplayActivity.class);
        intent.putExtra(JokeDisplayActivity.KEY_EXTRA_JOKE, joke);
        startActivity(intent);

    }

    @OnClick(R.id.btn_tellJoke)
    public void startAsyncTask() {
        progressBar.setVisibility(View.VISIBLE);
        new EndpointJokeAsyncTask(MainActivityFragment.this).execute();
    }
}
