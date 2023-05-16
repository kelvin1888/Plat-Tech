package com.example.quizgameapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class QuizResults extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_results);


        final AppCompatButton detailsBtn = findViewById(R.id.detailsBtn);
        final TextView correctAnswer = findViewById(R.id.correctAnswers);


        final int getCorrectAnswers = getIntent().getIntExtra("correct", 0);


        correctAnswer.setText(String.valueOf(getCorrectAnswers));



        detailsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(QuizResults.this, details.class));
                finish();

            }
        });
    }

    @Override
    public void onBackPressed() {
        startActivity(new Intent(QuizResults.this, MainActivity.class));
        finish();
    }
}