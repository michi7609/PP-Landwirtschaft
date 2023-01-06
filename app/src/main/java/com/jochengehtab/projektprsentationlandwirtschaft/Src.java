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
                seventhText = findViewById(R.id.seventhsrc),
                eightText = findViewById(R.id.eightsrc);


        firstText.setMovementMethod(LinkMovementMethod.getInstance());
        secondText.setMovementMethod(LinkMovementMethod.getInstance());
        thirdText.setMovementMethod(LinkMovementMethod.getInstance());
        fourthText.setMovementMethod(LinkMovementMethod.getInstance());
        fifthText.setMovementMethod(LinkMovementMethod.getInstance());
        sixthText.setMovementMethod(LinkMovementMethod.getInstance());
        seventhText.setMovementMethod(LinkMovementMethod.getInstance());
        eightText.setMovementMethod(LinkMovementMethod.getInstance());
    }
}