package com.jochengehtab.projektprsentationlandwirtschaft;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Amogy extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amogy);

        Json json = new Json(getApplicationContext());
        int textSize = json.get("config.json");

        TextView aa1 = findViewById(R.id.aa1);
        TextView aa2 = findViewById(R.id.aa2);
        TextView aa3 = findViewById(R.id.aa3);
        TextView aa4 = findViewById(R.id.aa4);
        TextView aa5 = findViewById(R.id.aa5);
        TextView aa6 = findViewById(R.id.aa6);

        aa1.setTextSize(textSize + 4);
        aa2.setTextSize(textSize);
        aa3.setTextSize(textSize + 4);
        aa4.setTextSize(textSize);
        aa5.setTextSize(textSize + 4);
        aa6.setTextSize(textSize);
    }
}