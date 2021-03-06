package com.example.ealezel.drawprimitives;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.example.ealezel.drawprimitives.draw.DrawRectangle;

public class RectangleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rectangle);
        DrawRectangle drawRect = new DrawRectangle(this);
        setContentView(drawRect);
    }
}
