package com.jochengehtab.projektprsentationlandwirtschaft;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;

public class Umruestung extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_umruestung);

        TextView textView = findViewById(R.id.click);
        SpannableString spannableString = new SpannableString("Synthetischer Kraftstoff");
        Intent intent = new Intent(this, SynthetischerKraftstoff.class);
        ClickableSpan clickableSpan = new ClickableSpan() {
            @Override
            public void onClick(@NonNull View widget) {
                startActivity(intent);
            }
        };

        spannableString.setSpan(clickableSpan, 0, 24, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        textView.setText(spannableString);
        textView.setMovementMethod(LinkMovementMethod.getInstance());

        Json json = new Json(getApplicationContext());
        int textSize = json.get("config.json");

        TextView um1 = findViewById(R.id.um1);
        TextView um2 = findViewById(R.id.um2);
        TextView um3 = findViewById(R.id.um3);

        um1.setTextSize(textSize + 4);
        um2.setTextSize(textSize);
        um3.setTextSize(textSize + 4);

        textView.setTextSize(textSize);
    }
}