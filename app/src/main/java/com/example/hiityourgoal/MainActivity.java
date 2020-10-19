package com.example.hiityourgoal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.hiityourgoal.ui.login.LoginActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    /*links to next screen*/
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button buttonTwo = findViewById(R.id.login);
        buttonTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), LoginActivity.class);
                view.getContext().startActivity(intent);
            }
        });


        final Button button = findViewById(R.id.guest);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), WorkOutSession.class);
                view.getContext().startActivity(intent);
                }
            });

    }
}