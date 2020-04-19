package com.example.firstgame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    LinearLayout top, bottom;
    Button start_game;
    Animation topToDown, downToTop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        top = findViewById(R.id.top);
        bottom =findViewById(R.id.bottom);
        start_game = findViewById(R.id.start_game);

        topToDown = AnimationUtils.loadAnimation(this,R.anim.uptodown);
        downToTop= AnimationUtils.loadAnimation(this,R.anim.downtoup);
        top.setAnimation(topToDown);
        bottom.setAnimation(downToTop);

        start_game.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Second.class);
                startActivity(intent);
            }
        });
    }
}
