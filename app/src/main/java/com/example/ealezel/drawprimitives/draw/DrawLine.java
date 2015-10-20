package com.example.ealezel.drawprimitives.draw;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;

import com.example.ealezel.drawprimitives.DrawCanvas;

/**
 * Created by ealezel on 20.10.2015.
 */
public class DrawLine extends DrawCanvas {
    public DrawLine(Context context) {
        super(context);
    }
    @Override
    protected void onDraw(Canvas mCanvas) {
        super.onDraw(mCanvas);
        mPaint.setColor(Color.RED);
        mCanvas.drawLine(10, 10, 200, 250, mPaint);
    }

}