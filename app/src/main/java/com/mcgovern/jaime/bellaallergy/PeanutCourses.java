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

        Button advanceToPeanutPizzaList = (Button) findViewById(R.id.buttPeaPiz);
        advanceToPeanutPizzaList.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent toPeanutPizzaList = new Intent(PeanutCourses.this, PeanutPizzaList.class);
                startActivity(toPeanutPizzaList);
            }
        });

        Button advanceToPeanutItalianClassicsList = (Button) findViewById(R.id.buttPeaItCla);
        advanceToPeanutItalianClassicsList.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent toPeanutItalianClassicsList = new Intent(PeanutCourses.this, PeanutItalianClassicsList.class);
                startActivity(toPeanutItalianClassicsList);
            }
        });

        Button advanceToPeanutSidesList = (Button) findViewById(R.id.buttPeaSide);
        advanceToPeanutSidesList.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent toPeanutSidesList = new Intent(PeanutCourses.this, PeanutSidesList.class);
                startActivity(toPeanutSidesList);
            }
        });

        Button advanceToPeanutPastaList = (Button) findViewById(R.id.buttPeaPas);
        advanceToPeanutPastaList.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent toPeanutPastaList = new Intent(PeanutCourses.this, PeanutPastaList.class);
                startActivity(toPeanutPastaList);
            }
        });

        Button advanceToPeanutGriInsList = (Button) findViewById(R.id.buttPeaGriIns);
        advanceToPeanutGriInsList.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent toPeanutGriInsList = new Intent(PeanutCourses.this, PeanutGriInsList.class);
                startActivity(toPeanutGriInsList);
            }
        });

        Button advanceToPeanutDessertList = (Button) findViewById(R.id.buttPeaDes);
        advanceToPeanutDessertList.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent toPeanutDessertList = new Intent(PeanutCourses.this, PeanutDessertsList.class);
                startActivity(toPeanutDessertList);
            }
        });
    }

}
