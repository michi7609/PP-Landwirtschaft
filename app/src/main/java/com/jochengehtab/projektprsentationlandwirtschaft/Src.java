package com.jochengehtab.projektprsentationlandwirtschaft;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class Src extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_src);

        TextView firstText = findViewById(R.id.firstsrc),
                secondText = findViewById(R.id.secondsrc),
                thirdText = findViewById(R.id.thirdsrc),
                fourthText = findViewById(R.id.fourthsrc),
                fifthText = findViewById(R.id.fifthsrc),
                sixthText = findViewById(R.id.sixthsrc),
                seventhText = findViewById(R.id.seventhsrc);

        firstText.setMovementMethod(LinkMovementMethod.getInstance());
        secondText.setMovementMethod(LinkMovementMethod.getInstance());
        thirdText.setMovementMethod(LinkMovementMethod.getInstance());
        fourthText.setMovementMethod(LinkMovementMethod.getInstance());
        fifthText.setMovementMethod(LinkMovementMethod.getInstance());
        sixthText.setMovementMethod(LinkMovementMethod.getInstance());
        seventhText.setMovementMethod(LinkMovementMethod.getInstance());

        Json json = new Json(getApplicationContext());
        int textSize = json.get("config.json");

        TextView src1 = findViewById(R.id.src1);
        TextView src2 = findViewById(R.id.src2);
        TextView src3 = findViewById(R.id.src3);
        TextView src4 = findViewById(R.id.src4);
        TextView src5 = findViewById(R.id.src5);
        TextView src6 = findViewById(R.id.src6);
        TextView src7 = findViewById(R.id.src7);
        src1.setTextSize(textSize);
        src2.setTextSize(textSize);
        src3.setTextSize(textSize);
        src4.setTextSize(textSize);
        src5.setTextSize(textSize);
        src6.setTextSize(textSize);
        src7.setTextSize(textSize);

        firstText.setTextSize(textSize - 2);
        secondText.setTextSize(textSize - 2);
        thirdText.setTextSize(textSize - 2);
        fourthText.setTextSize(textSize - 2);
        fifthText.setTextSize(textSize - 2);
        sixthText.setTextSize(textSize - 2);
        seventhText.setTextSize(textSize - 2);
    }
}