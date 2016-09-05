package com.mcgovern.jaime.bellaallergy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class PeanutPastaList extends AppCompatActivity {

    String[] peanutPasta = {"Pomodoro", "Bolognese", "Polpette", "Marco Polo", "Carbonara", "Agnello", "Pollo Limone Siciliana", "Pollo Pesto Gnocchi",
    "Salmone Limone", "Gamberoni", "Capra", "Beef & Red Wine Ravioli", "Pollo Formaggi", "Lasagne", "Cannelloni Ricotta", "Amore Formaggi",
    "Panzerotti Funghi"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_peanut_pasta_list);

        ListView listView = (ListView) findViewById(R.id.peanutPastaList);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_list_item_1, peanutPasta);

        listView.setAdapter(adapter);
    }
}
