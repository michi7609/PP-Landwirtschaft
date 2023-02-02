package com.jochengehtab.projektprsentationlandwirtschaft;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Mensch extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mensch);

        Json json = new Json(getApplicationContext());
        int textSize = json.get("config.json");

        TextView vm1 = findViewById(R.id.vm1);
        TextView vm2 = findViewById(R.id.vm2);
        TextView vm3 = findViewById(R.id.vm3);
        TextView vm4 = findViewById(R.id.vm4);

        vm1.setTextSize(textSize + 4);
        vm2.setTextSize(textSize);
        vm3.setTextSize(textSize + 4);
        vm4.setTextSize(textSize);
    }
}