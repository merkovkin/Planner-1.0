package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Zaglavnoe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.zaglavnoe);
        Button button = (Button) findViewById(R.id.button2);
        Button button2 = (Button) findViewById(R.id.button);
        View.OnClickListener SecScreen = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Zaglavnoe.this, Vibor.class);
                startActivity(intent);
            }
        };
        View.OnClickListener SecScreen2 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Zaglavnoe.this, oPrilozhenii.class);
                startActivity(intent);
            }
        };

        button2.setOnClickListener(SecScreen2);
        button.setOnClickListener(SecScreen);

    }

}

