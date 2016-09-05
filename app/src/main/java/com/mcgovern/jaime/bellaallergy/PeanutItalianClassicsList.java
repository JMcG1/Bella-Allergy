package com.mcgovern.jaime.bellaallergy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class PeanutItalianClassicsList extends AppCompatActivity {

    String[] peanutItalianClassics = {"Pollo Funghi", "Pollo Cacciatore", "Agnello Rosmarino", "Spezzatino di Manzo", "Gamberoni Risotto"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_peanut_italian_classics_list);

        ListView listView = (ListView) findViewById(R.id.peanutItalianClassicsList);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_list_item_1, peanutItalianClassics);

        listView.setAdapter(adapter);
    }
}
