package com.mcgovern.jaime.bellaallergy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button advanceToPeanutCourses = (Button) findViewById(R.id.buttPeanuts);
        advanceToPeanutCourses.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent toPeanutCourses = new Intent(MainActivity.this, PeanutCourses.class);
                startActivity(toPeanutCourses);
            }
        });

        Button advanceToDairyCourses = (Button) findViewById(R.id.buttDairy);
        advanceToDairyCourses.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent toDairyCourses = new Intent(MainActivity.this, DairyCourses.class);
                startActivity(toDairyCourses);
            }
        });

        Button advanceToEggCourses = (Button) findViewById(R.id.buttEggs);
        advanceToEggCourses.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent toEggCourses = new Intent(MainActivity.this, EggCourses.class);
                startActivity(toEggCourses);
            }
        });
        Button advanceToTreeNutCourses = (Button) findViewById(R.id.buttTreeNuts);
        advanceToTreeNutCourses.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent toTreeNutCourses = new Intent(MainActivity.this, TreeNutCourses.class);
                startActivity(toTreeNutCourses);
            }
        });
    }
}
