package com.example.firstgame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class Second extends AppCompatActivity {

    ImageView backBtn;
    EditText player1, player2;
    Button start;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        backBtn = findViewById(R.id.backButton);
        player1 = findViewById(R.id.player1);
        player2 = findViewById(R.id.player2);
        start = findViewById(R.id.start);


        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startButton();
            }
        });

        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
    public void startButton() {
        String p1 = player1.getText().toString();
        String p2 = player2.getText().toString();
        Intent intent = new Intent(Second.this, ThirdActivity.class);
        intent.putExtra("a",p1);
        intent.putExtra("b",p2);
        startActivity(intent);
    }
}
