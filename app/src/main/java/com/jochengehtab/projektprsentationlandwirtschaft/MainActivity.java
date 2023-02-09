package com.jochengehtab.projektprsentationlandwirtschaft;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

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
        Log.d("Jochengehtab", String.valueOf(amogy));
        amogy.setOnClickListener(v -> startActivity(new Intent(this, Amogy.class)));

        Button button = findViewById(R.id.src);
        button.setOnClickListener(v -> startActivity(new Intent(this, Src.class)));

        Button settings = findViewById(R.id.settings);
        settings.setOnClickListener(v -> startActivity(new Intent(this, Settings.class)));

        Json json = new Json(getApplicationContext());
        int textSize = json.get("config.json");

        TextView am1 = findViewById(R.id.am1);
        TextView am2 = findViewById(R.id.am2);
        TextView am3 = findViewById(R.id.am3);
        TextView am4 = findViewById(R.id.am4);
        TextView am5 = findViewById(R.id.am5);
        TextView am6 = findViewById(R.id.am6);
        TextView am7 = findViewById(R.id.am7);

        am1.setTextSize(textSize);
        am2.setTextSize(textSize);
        am3.setTextSize(textSize);
        am4.setTextSize(textSize);
        am5.setTextSize(textSize);
        am6.setTextSize(textSize);
        am7.setTextSize(textSize);
    }

    @Override
    protected void onStart() {
        super.onStart();

        Json json = new Json(getApplicationContext());
        int textSize = json.get("config.json");

        TextView am1 = findViewById(R.id.am1);
        TextView am2 = findViewById(R.id.am2);
        TextView am3 = findViewById(R.id.am3);
        TextView am4 = findViewById(R.id.am4);
        TextView am5 = findViewById(R.id.am5);
        TextView am6 = findViewById(R.id.am6);
        TextView am7 = findViewById(R.id.am7);

        am1.setTextSize(textSize);
        am2.setTextSize(textSize);
        am3.setTextSize(textSize);
        am4.setTextSize(textSize);
        am5.setTextSize(textSize);
        am6.setTextSize(textSize);
        am7.setTextSize(textSize);
    }
}