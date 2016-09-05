package com.mcgovern.jaime.bellaallergy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class PeanutSidesList extends AppCompatActivity {

    String[] peanutSides = {"Marzanini Vine Tomatoes", "Roast Mediterranean Veg", "Corn on the Cob", "Chunky Chips", "Basil Mash",
            "Tenderstem Broccoli in Chilli Butter", "Mixed Salad", "Rocket & Shaved Granello Cheese", "Onion Rings with Barbecue Sauce"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_peanut_sides_list);

        ListView listView = (ListView) findViewById(R.id.peanutSidesList);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_list_item_1, peanutSides);

        listView.setAdapter(adapter);
    }
}
