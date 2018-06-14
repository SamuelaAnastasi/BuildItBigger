/*
 * This project is part of Android Developer Nanodegree Scholarship Program by
 * Udacity and Google
 * Created by Samuela Anastasi
 */
package com.example.android.androidjokeslib;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeDisplayActivity extends AppCompatActivity {

    public static String KEY_EXTRA_JOKE = "currentJoke";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke_display);

        TextView jokeView = findViewById(R.id.tv_joke_content);
        Intent intent = getIntent();
        String joke = intent.getStringExtra(KEY_EXTRA_JOKE);

        if (joke != null) {
            jokeView.setText(joke);
        } else {
            jokeView.setText(getApplicationContext().getString(R.string.no_joke));
        }
    }
}
