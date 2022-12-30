package com.jochengehtab.projektprsentationlandwirtschaft;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton elektrotraktor = findViewById(R.id.elektrotraktor),
                alternativemotoren = findViewById(R.id.alternativemotoren),
                emotor = findViewById(R.id.emotor),
                synthetischerkraftstoff = findViewById(R.id.synthetischerkraftstoff),
                erneuerbareenergien = findViewById(R.id.erneuerbareenergien),
                umruestung = findViewById(R.id.umruestung),
                landwirt = findViewById(R.id.landwirt),
                mensch = findViewById(R.id.mensch);

        alternativemotoren.setOnClickListener(v -> {});
        emotor.setOnClickListener(v -> {});
        synthetischerkraftstoff.setOnClickListener(v -> {});
        erneuerbareenergien.setOnClickListener(v -> {});
        umruestung.setOnClickListener(v -> {});
        landwirt.setOnClickListener(v -> {});
        mensch.setOnClickListener(v -> {});
        elektrotraktor.setOnClickListener(v -> {});

        Button button = findViewById(R.id.src);
        button.setOnClickListener(v -> startActivity(new Intent(this, Src.class)));
    }
}