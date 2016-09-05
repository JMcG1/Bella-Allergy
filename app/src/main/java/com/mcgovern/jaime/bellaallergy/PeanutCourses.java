package com.mcgovern.jaime.bellaallergy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PeanutCourses extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_peanut_courses);

        Button advanceToPeanutStarterList = (Button) findViewById(R.id.buttPeaSt);
        advanceToPeanutStarterList.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent toPeanutStarterList = new Intent(PeanutCourses.this, PeanutStarterList.class);
                startActivity(toPeanutStarterList);
            }
        });
    }
}
