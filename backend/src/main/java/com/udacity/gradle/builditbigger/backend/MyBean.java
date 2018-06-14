/*
 * This project is part of Android Developer Nanodegree Scholarship Program by
 * Udacity and Google
 * Created by Samuela Anastasi
 */
package com.udacity.gradle.builditbigger.backend;

/** The object model for the data we are sending through endpoints */
public class MyBean {

    private String myData;

    public String getData() {
        return myData;
    }

    public void setData(String data) {
        myData = data;
    }
}