package com.jochengehtab.projektprsentationlandwirtschaft;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Alternative_Motoren extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alternative_motoren);

        Json json = new Json(getApplicationContext());
        int textSize = json.get("config.json");

        TextView aam1 = findViewById(R.id.aam1);
        TextView aam2 = findViewById(R.id.aam2);

        aam1.setTextSize(textSize + 4);
        aam2.setTextSize(textSize);
    }
}