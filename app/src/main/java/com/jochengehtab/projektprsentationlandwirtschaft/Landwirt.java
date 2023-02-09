package com.jochengehtab.projektprsentationlandwirtschaft;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Landwirt extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landwirt);

        Json json = new Json(getApplicationContext());
        int textSize = json.get("config.json");

        TextView la1 = findViewById(R.id.la1);
        TextView la2 = findViewById(R.id.la2);
        TextView la3 = findViewById(R.id.la3);
        TextView la4 = findViewById(R.id.la4);

        la1.setTextSize(textSize + 4);
        la2.setTextSize(textSize);
        la3.setTextSize(textSize + 4);
        la4.setTextSize(textSize);
    }
}