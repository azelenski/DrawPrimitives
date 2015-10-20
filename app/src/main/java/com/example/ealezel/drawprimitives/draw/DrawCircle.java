package com.example.ealezel.drawprimitives.draw;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.util.DisplayMetrics;
import android.util.Log;
import android.widget.Toast;
import com.example.ealezel.drawprimitives.DrawCanvas;

/**
 * Created by ealezel on 20.10.2015.
 */
public class DrawCircle extends DrawCanvas {

    public int c;
    public int rad;
    public DrawCircle(Context context) {
        super(context);
        this.c= Color.parseColor("RED");
    }
    public DrawCircle(Context context,String color, String height) {
        super(context);
        try {
            this.c=Color.parseColor(color.toLowerCase());
            this.rad=Integer.parseInt(height);

        }catch (Exception e){
            Toast toast = Toast.makeText(getContext(), "Errror with data", Toast.LENGTH_LONG);
            toast.show();
            Log.e("error", "ERROR");
        }
    }

    @Override
    protected void onDraw(Canvas mCanvas) {
        super.onDraw(mCanvas);
        mPaint.setColor(c);
        DisplayMetrics metrics = this.getResources().getDisplayMetrics();
        int w = metrics.widthPixels;
        int h = metrics.heightPixels;
        mCanvas.drawCircle(w/2, h/2, rad, mPaint);
    }

}