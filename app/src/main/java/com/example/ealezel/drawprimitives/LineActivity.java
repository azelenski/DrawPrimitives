package com.example.ealezel.drawprimitives;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.example.ealezel.drawprimitives.draw.DrawLine;

public class LineActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_line);
        DrawLine drawLine = new DrawLine(this);
        setContentView(drawLine);
    }
}
