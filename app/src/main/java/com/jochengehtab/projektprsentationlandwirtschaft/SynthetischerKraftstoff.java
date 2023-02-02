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

public class SynthetischerKraftstoff extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_synthetischer_kraftstoff);

        TextView textView = findViewById(R.id.amogyconnector);
        SpannableString spannableString = new SpannableString("Amogy");
        Intent intent = new Intent(this, Amogy.class);
        ClickableSpan clickableSpan = new ClickableSpan() {
            @Override
            public void onClick(@NonNull View widget) {
                startActivity(intent);
            }
        };

        spannableString.setSpan(clickableSpan, 0, 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        textView.setText(spannableString);
        textView.setMovementMethod(LinkMovementMethod.getInstance());

        Json json = new Json(getApplicationContext());
        int textSize = json.get("config.json");

        TextView sk1 = findViewById(R.id.sk1);
        TextView sk2 = findViewById(R.id.sk2);
        TextView sk3 = findViewById(R.id.sk3);
        TextView sk4 = findViewById(R.id.sk4);
        TextView sk5 = findViewById(R.id.sk5);

        textView.setTextSize(textSize);
        sk1.setTextSize(textSize + 4);
        sk2.setTextSize(textSize);
        sk3.setTextSize(textSize);
        sk4.setTextSize(textSize + 4);
        sk5.setTextSize(textSize + 4);
    }
}