package com.example.ealezel.drawprimitives.draw;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;

import com.example.ealezel.drawprimitives.DrawCanvas;
import com.example.ealezel.drawprimitives.R;

/**
 * Created by ealezel on 20.10.2015.
 */
public class DrawPic extends DrawCanvas {
    public DrawPic(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas mCanvas) {
        super.onDraw(mCanvas);
        mPaint.setColor(Color.GREEN);
        Bitmap d= BitmapFactory.decodeResource(getResources(), R.drawable.vayne);
        mCanvas.drawBitmap(d,1,1, mPaint);
    }
}
