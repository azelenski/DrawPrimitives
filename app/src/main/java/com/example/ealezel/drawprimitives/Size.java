package com.example.ealezel.drawprimitives;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

public class Size extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_size);

        Spinner spinner = (Spinner) findViewById(R.id.colorSpinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.color_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
    }

    public void CircleClick(View view) {
        Intent i = new Intent(this, CircleActivity.class);
        Spinner spinner = (Spinner) findViewById(R.id.colorSpinner);
        EditText heix = (EditText) findViewById(R.id.editText);
//        spinner.setOnItemSelectedListener(this);

        i.putExtra("color",spinner.getSelectedItem().toString());
        i.putExtra("height", heix.getText().toString());
        Log.e("COLOR", spinner.getSelectedItem().toString());
        Log.e("HEIGHT",heix.getText().toString());
        startActivity(i);
    }
}
