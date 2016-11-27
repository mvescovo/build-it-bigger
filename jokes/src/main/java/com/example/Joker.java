package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Joker {

    private static List<String> jokes;

    static {
        jokes = new ArrayList<>();
        jokes.add("The joke engine is experiencing jovial difficulties.");
        jokes.add("iProducts are cool!");
        jokes.add("Global warming is a hoax.");
        jokes.add("Any of the following are real: Father Christmas, the Easter bunny, God.");
        jokes.add("Idiotbook is not a virus.");
    }

    public String getJoke() {
        Random rand = new Random();
        int  n = rand.nextInt(5);
        return jokes.get(n);
    }
}
