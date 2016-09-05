package com.mcgovern.jaime.bellaallergy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class PeanutPizzaList extends AppCompatActivity {

    String[] peanutPizza = {"Margherita", "Cotto", "Carne Mista", "Pollo & Pancetta Barbecue", "Pollo Piccante", "Pepperoni Piccante", "Quattro Stagioni Legumi",
    "Queen Margherita (Roma)", "Luganica Rosmarino (Roma)", "Pollo Timo (Roma)", "Marco Polo (Roma)", "Salmone Tarragon (Roma)", "Primavera (Roma)",
            "Calzone Legume", "Calzone Diavola", "Calzone Pollo e Spinaci", "Pizza Vita Olive", "Pizza Vita Speck", "Pizza Vita Pollo",
            "Ripiena Crust (Add)", "Gluten Free Base"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_peanut_pizza_list);

        ListView listView = (ListView) findViewById(R.id.peanutPizzaList);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_list_item_1, peanutPizza);

        listView.setAdapter(adapter);
    }
}
