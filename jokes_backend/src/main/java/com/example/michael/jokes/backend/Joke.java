package com.example.michael.jokes.backend;

/**
 * @author Michael Vescovo.
 */

public class Joke {

    private String mJoke;

    public Joke(String joke) {
        mJoke = joke;
    }

    public String getJoke() {
        return mJoke;
    }

    public void setJoke(String joke) {
        mJoke = joke;
    }
}
