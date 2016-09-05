package com.mcgovern.jaime.bellaallergy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class PeanutDessertsList extends AppCompatActivity {

    String[] peanutDesserts = {"Limoncello Tart Shot", "Salted Caramel Chocolate Shot", "Tiramisu", };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_peanut_desserts_list);

        ListView listView = (ListView) findViewById(R.id.peanutDesList);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_list_item_1, peanutDesserts);

        listView.setAdapter(adapter);
    }
}
