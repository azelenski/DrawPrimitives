package com.example.ealezel.drawprimitives;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

/**
 * Created by ealezel on 20.10.2015.
 */
public class DrawCanvas extends View {
    protected Paint mPaint = new Paint();
    public DrawCanvas(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas mCanVAS){
        super.onDraw(mCanVAS);
        mPaint.setStyle(Paint.Style.FILL);
        mPaint.setColor(Color.YELLOW);
        mCanVAS.drawPaint(mPaint);

    }
}