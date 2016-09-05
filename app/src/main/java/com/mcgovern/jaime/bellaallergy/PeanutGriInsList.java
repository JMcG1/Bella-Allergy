package com.mcgovern.jaime.bellaallergy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class PeanutGriInsList extends AppCompatActivity {

    String[] peanutGriIns = {"Ribs Italiano", "Butterflied Chicken Breast", "10oz Ribeye", "8oz Sirloin", "Peppercorn Sauce", "Mushroom Sauce", "Marsala Wine Sauce",
    "Garlic Butter", "Burger Americano", "Petto di Pollo Burger", "Portobello Mushroom Burger", "Barbabietola Rossa", "Pollo Arcobaleno",
    "Pollo Arancia"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_peanut_gri_ins_list);

        ListView listView = (ListView) findViewById(R.id.peanutGriInsList);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_list_item_1, peanutGriIns);

        listView.setAdapter(adapter);
    }
}
