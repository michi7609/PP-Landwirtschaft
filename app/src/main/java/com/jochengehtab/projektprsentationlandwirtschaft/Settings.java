package com.jochengehtab.projektprsentationlandwirtschaft;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.TextView;

public class Settings extends AppCompatActivity {

    private int textSize;
    private final String FILENAME = "config.json";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        Json json = new Json(getApplicationContext());
        TextView output = findViewById(R.id.textSize);

        textSize = json.get(FILENAME);

        output.setText("Deine aktuelle Textgröße ist: " + textSize);

        ImageButton plus = findViewById(R.id.plus), minus = findViewById(R.id.minus);
        TextView sampleTextSize = findViewById(R.id.sampletextsize);
        sampleTextSize.setTextSize(textSize);

        plus.setOnClickListener(v -> {
            if (textSize >= 50) {
                return;
            }
            json.set(FILENAME, textSize + 1);
            textSize = json.get(FILENAME);
            output.setText("Deine aktuelle Textgröße ist: " + textSize);
            sampleTextSize.setTextSize(textSize);
        });

        minus.setOnClickListener(v -> {
            if (textSize <= 0) {
                return;
            }
            json.set(FILENAME, textSize - 1);
            textSize = json.get(FILENAME);
            output.setText("Deine aktuelle Textgröße ist: " + textSize);
            sampleTextSize.setTextSize(textSize);
        });
    }
}