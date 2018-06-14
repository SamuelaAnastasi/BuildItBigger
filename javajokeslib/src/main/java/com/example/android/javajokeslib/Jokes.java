/*
 * This project is part of Android Developer Nanodegree Scholarship Program by
 * Udacity and Google
 * Created by Samuela Anastasi
 */
package com.example.android.javajokeslib;

import java.util.Random;

public class Jokes {
    private static Random r = new Random();

    private static final String[] jokes = new String[] {
            "A programmer had a problem.\nHe decided to use Java.\nNow he has a ProblemFactory.",
            "If debugging is the process of removing software bugs, then programming must be the process of putting them in.",
            "Daddy, what are clouds made of?\nLinux servers mostly.",
            "Computers make very fast, very accurate mistakes",
            "Got this email from a friend:\nCanYouFixTheSpaceBarOnMyKeyboard?",
            "A programmer puts two glasses on his bedside table before going to sleep.\nA full one, in case he gets thirsty, and an empty one, in case he doesn't",
            "So what's your idea of a perfect date?\nYYYY-MM-DD. I find other formats a bit confusing.",
            "How does JavaScript call its mommy?\nec-MA.",
            "How programmers run:\npublic void run() { \nstep++; }",
            "Whats the object-oriented way to become wealthy?\nInheritance.",
            "I'm not anti-social; I'm just not user friendly"
    };

    private static int getJokesLength() {
        return jokes.length;
    }

    public static String getRandomJoke() {
        return jokes[r.nextInt(getJokesLength())];
    }
}
