package com.jochengehtab.projektprsentationlandwirtschaft;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton alternativemotoren = findViewById(R.id.alternativemotoren),
                synthetischerkraftstoff = findViewById(R.id.synthetischerkraftstoff),
                erneuerbareenergien = findViewById(R.id.erneuerbareenergien),
                umruestung = findViewById(R.id.umruestung),
                landwirt = findViewById(R.id.landwirt),
                mensch = findViewById(R.id.mensch);
        ImageButton amogy = findViewById(R.id.a);

        alternativemotoren.setOnClickListener(v -> startActivity(new Intent(this, Alternative_Motoren.class)));
        synthetischerkraftstoff.setOnClickListener(v -> startActivity(new Intent(this, SynthetischerKraftstoff.class)));
        erneuerbareenergien.setOnClickListener(v -> startActivity(new Intent(this, ErneuerbareEnergien.class)));
        umruestung.setOnClickListener(v -> startActivity(new Intent(this, Umruestung.class)));
        landwirt.setOnClickListener(v -> startActivity(new Intent(this, Landwirt.class)));
        mensch.setOnClickListener(v -> startActivity(new Intent(this, Mensch.class)));
        Log.d("Joch", String.valueOf(amogy));
        amogy.setOnClickListener(v -> startActivity(new Intent(this, Amogy.class)));

        Button button = findViewById(R.id.src);
        button.setOnClickListener(v -> startActivity(new Intent(this, Src.class)));
    }
}