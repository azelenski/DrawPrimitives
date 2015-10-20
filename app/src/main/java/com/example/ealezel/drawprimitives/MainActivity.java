package com.example.ealezel.drawprimitives;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void GoToRectangleScreen(View view)
    {
        Intent goRectangleIntent = new Intent(this, RectangleActivity.class);
        startActivity(goRectangleIntent);
    }
    public void GoToCircleScreen(View view)
    {
        Intent goCircleIntent = new Intent(this, Size.class);

        startActivity(goCircleIntent);
    }
    public void GoToLineScreen(View view)
    {
        Intent goLineIntent = new Intent(this, LineActivity.class);

        startActivity(goLineIntent);
    }
    public void GoToPictureScreen(View view)
    {
        Intent goPictureIntent = new Intent(this, PictureActivity.class);

        startActivity(goPictureIntent);
    }
}
