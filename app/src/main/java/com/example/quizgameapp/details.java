package com.example.quizgameapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class details extends AppCompatActivity {

    EditText name, subject, score;
    Button create, update, delete, view;
    DBHelper DB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);


        name = findViewById(R.id.name);
        subject = findViewById(R.id.subject);
        score = findViewById(R.id.score);

        create = findViewById(R.id.btnCreate);
        update = findViewById(R.id.btnUpdate);
        delete = findViewById(R.id.btnDelete);
        view = findViewById(R.id.btnView);
        DB = new DBHelper(this);

        create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nameTXT = name.getText().toString();
                String subjectTXT = subject.getText().toString();
                String scoreTXT = score.getText().toString();

                Boolean checkcreatedata = DB.createUserdata(nameTXT, subjectTXT, scoreTXT);
                if(checkcreatedata==true)
                    Toast.makeText(details.this, "New Entry Created", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(details.this, "New Entry Not Created", Toast.LENGTH_SHORT).show();
            }
        });

       update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nameTXT = name.getText().toString();
                String subjectTXT = subject.getText().toString();
                String scoreTXT = score.getText().toString();

                Boolean checkupdatedata = DB.updateUserdata(nameTXT, subjectTXT, scoreTXT);
                if(checkupdatedata==true)
                    Toast.makeText(details.this, "Entry Updated", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(details.this, "Entry Not Updated", Toast.LENGTH_SHORT).show();
            }
        });

        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nameTXT = name.getText().toString();

                Boolean checkdeletedata = DB.deletedata(nameTXT);
                if(checkdeletedata==true)
                    Toast.makeText(details.this, "Entry Deleted", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(details.this, "Entry Not Deleted", Toast.LENGTH_SHORT).show();
            }
        });

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Cursor res = DB.getdata();
                if(res.getCount()==0) {
                    Toast.makeText(details.this, "No Data Exists", Toast.LENGTH_SHORT).show();
                    return;
                }
                StringBuffer buffer = new StringBuffer();
                while (res.moveToNext()){
                    buffer.append("Name :"+res.getString(0)+"\n");
                    buffer.append("Subject :"+res.getString(1)+"\n");
                    buffer.append("Score :"+res.getString(2)+"\n\n");
                }

                AlertDialog.Builder builder = new AlertDialog.Builder(details.this);
                builder.setCancelable(true);
                builder.setTitle("User Entries");
                builder.setMessage(buffer.toString());
                builder.show();
            }
        });



        final AppCompatButton returnBtn = findViewById(R.id.returnBtn);

        returnBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(details.this, MainActivity.class));
                finish();
            }
        });

    }









    }
