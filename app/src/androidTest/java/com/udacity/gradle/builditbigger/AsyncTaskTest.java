/*
 * This project is part of Android Developer Nanodegree Scholarship Program by
 * Udacity and Google
 * Created by Samuela Anastasi
 */
package com.udacity.gradle.builditbigger;

import android.support.test.runner.AndroidJUnit4;
import android.util.Log;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

@RunWith(AndroidJUnit4.class)
public class AsyncTaskTest {

    @Test
    public void testAsyncResult() {
        try {
            MainActivityFragment mainActivityFragment = new MainActivityFragment();
            EndpointJokeAsyncTask endpointJokeAsyncTask = new EndpointJokeAsyncTask(mainActivityFragment);
            String joke = endpointJokeAsyncTask.doInBackground();
            assertNotNull(joke);
            assertTrue(joke.length() > 0);
        } catch (Exception e){
            Log.e("EndpointJokeAsyncTaskTest", "test doInBackground() failed");
        }
    }
}
