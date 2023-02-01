package com.jochengehtab.projektprsentationlandwirtschaft;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ErneuerbareEnergien extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_erneuerbare_energien);

        Json json = new Json(getApplicationContext());
        int textSize = json.get("config.json");

        TextView ee1 = findViewById(R.id.ee1);
        TextView ee2 = findViewById(R.id.ee2);
        TextView ee3 = findViewById(R.id.ee3);
        TextView ee4 = findViewById(R.id.ee4);
        TextView ee5 = findViewById(R.id.ee5);
        TextView ee6 = findViewById(R.id.ee6);

        ee1.setTextSize(textSize + 4);
        ee2.setTextSize(textSize);
        ee3.setTextSize(textSize);
        ee4.setTextSize(textSize + 4);
        ee5.setTextSize(textSize);
        ee6.setTextSize(textSize);
    }
}