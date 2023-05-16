package com.example.quizgameapp;

import androidx.annotation.IdRes;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {


    private String selectedTopicName = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final LinearLayout uts = findViewById(R.id.utsLayout);
        final LinearLayout purcomm = findViewById(R.id.purcommLayout);
        final LinearLayout hci = findViewById(R.id.hciLayout);
        final LinearLayout speechclass = findViewById(R.id.speechclassLayout);

        final Button startBtn = findViewById(R.id.startQuizBtn);



        uts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                selectedTopicName = "uts";

                uts.setBackgroundResource(R.drawable.round_back_white_stroke10);

                purcomm.setBackgroundResource(R.drawable.round_back_white10);
                hci.setBackgroundResource(R.drawable.round_back_white10);
                speechclass.setBackgroundResource(R.drawable.round_back_white10);
            }
        });

        purcomm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedTopicName = "purcomm";

                purcomm.setBackgroundResource(R.drawable.round_back_white_stroke10);

                uts.setBackgroundResource(R.drawable.round_back_white10);
                hci.setBackgroundResource(R.drawable.round_back_white10);
                speechclass.setBackgroundResource(R.drawable.round_back_white10);
            }
        });

        hci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                selectedTopicName = "hci";

                hci.setBackgroundResource(R.drawable.round_back_white_stroke10);

                purcomm.setBackgroundResource(R.drawable.round_back_white10);
                uts.setBackgroundResource(R.drawable.round_back_white10);
                speechclass.setBackgroundResource(R.drawable.round_back_white10);

            }
        });

        speechclass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                selectedTopicName = "speechclass";

                speechclass.setBackgroundResource(R.drawable.round_back_white_stroke10);

                hci.setBackgroundResource(R.drawable.round_back_white10);
                purcomm.setBackgroundResource(R.drawable.round_back_white10);
                uts.setBackgroundResource(R.drawable.round_back_white10);

            }
        });

        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(selectedTopicName.isEmpty()){
                    Toast.makeText(MainActivity.this,"Please select a Subject", Toast.LENGTH_SHORT).show();

                }
                else {

                    Intent intent = new Intent(MainActivity.this, QuizActivity.class);
                    intent.putExtra("selectedTopic", selectedTopicName);
                    startActivity(intent);
                }
            }
        });

    }
} //end of main
