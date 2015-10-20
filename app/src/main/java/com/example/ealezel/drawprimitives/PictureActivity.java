package com.example.ealezel.drawprimitives;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.example.ealezel.drawprimitives.draw.DrawPic;

public class PictureActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picture);
        DrawPic drawPic = new DrawPic(this);
        setContentView(drawPic);
    }
}
