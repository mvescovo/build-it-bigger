package com.example.display_joke;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayJokeActivity extends AppCompatActivity {

    public static final String EXTRA_JOKE = "JOKE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_joke);

        if (getIntent() != null && getIntent().getStringExtra(EXTRA_JOKE) != null) {
            displayJoke(getIntent().getStringExtra(EXTRA_JOKE));
        }
    }

    private void displayJoke(@NonNull String joke) {
        TextView textView = (TextView) findViewById(R.id.joke);
        if (textView != null) {
            textView.setText(joke);
        }
    }
}
