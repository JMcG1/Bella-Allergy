package com.mcgovern.jaime.bellaallergy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class PeanutStarterList extends AppCompatActivity {

    String[] peanutStarters = {"Mixed Italian Olives", "Mini Ciabatta Bites", "Pane Bella","Mozzarella Pizza Bread",
    "Caramelised Onion Pizza Bread", "Chilli Pizza Bread", "Zuppa del Giorno", "Bruschetta", "Pizza Spirale", "Funghi Arrosto",
    "Polpette", "Gamberi", "Calamari", "Arancini Peperonata", "Chicken Wings Italiano", "Tempura Prawns", "Insalata Caprese",
    "Insalata Rosso"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_peanut_starter_list);

        ListView listView = (ListView) findViewById(R.id.peanutStarterList);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_list_item_1, peanutStarters);

        listView.setAdapter(adapter);
    }
}
