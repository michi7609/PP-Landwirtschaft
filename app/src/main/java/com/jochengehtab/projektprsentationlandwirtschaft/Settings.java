package com.jochengehtab.projektprsentationlandwirtschaft;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class Settings extends AppCompatActivity {

    private int textSize;
    private String FILENAME = "config.json";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        Json json = new Json(getApplicationContext());
        TextView output = findViewById(R.id.textSize);

        textSize = json.get(FILENAME);

        output.setText("Deine aktuelle Textgröße ist: " + textSize);

        ImageButton plus = findViewById(R.id.plus), minus = findViewById(R.id.minus);

        plus.setOnClickListener(v -> {
            json.set(FILENAME, textSize + 1);
            textSize = json.get(FILENAME);
            output.setText("Deine aktuelle Textgröße ist: " + textSize);
        });

        minus.setOnClickListener(v -> {
            json.set(FILENAME, textSize - 1);
            textSize = json.get(FILENAME);
            output.setText("Deine aktuelle Textgröße ist: " + textSize);
        });
    }

    private void setNewTextSize(){
        TextView textView = findViewById(R.id.firstsrc);
    }
}