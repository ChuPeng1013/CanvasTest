package com.example.administrator.canvastest;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by ChuPeng on 2016/10/20.
 */
public class CanvasView extends View
{
    private Paint paint;

    public CanvasView(Context context)
    {
        super(context);
    }

    public CanvasView(Context context, AttributeSet attrs)
    {
        super(context, attrs);
    }

    public CanvasView(Context context, AttributeSet attrs, int defStyleAttr)
    {
        super(context, attrs, defStyleAttr);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public CanvasView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes)
    {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        paint = new Paint();
        paint.setColor(Color.WHITE);
        //将画布的背景设置为黑色
        canvas.drawColor(Color.BLACK);
        //在画布上绘制一个白色360*360的矩形
        Rect rect = new Rect(0, 0, 360, 360);
        canvas.drawRect(rect, paint);
        /**
         * translate()和scale()的例子
        //将绘图坐标系沿x轴和Y轴平移100px
        canvas.translate(100, 100);
        //在画布上绘制一个蓝色360*360的矩形
        paint.setColor(Color.BLUE);
        canvas.drawRect(rect, paint);
        //保存画布的状态
        canvas.save();
        //以原点为基准点将绘图坐标系缩放为原来的0.5倍
        canvas.scale(0.5f, 0.5f);
        //在画布上绘制一个红色360*360的矩形
        paint.setColor(Color.RED);
        canvas.drawRect(rect, paint);
        //画布状态回滚
        canvas.restore();
        //以自定义点为基准点将绘图坐标系缩放为原来的0.5倍
        canvas.scale(0.5f, 0.5f, 180, 180);
        //在画布上绘制一个黑色360*360的矩形，并用白色的点表示自定义基准点
        paint.setColor(Color.BLACK);
        canvas.drawRect(rect, paint);
        paint.setColor(Color.WHITE);*/

        /**
         * rotate()的例子
        //以原点为基准点将绘图坐标系旋转45度
        canvas.rotate(45);
        //在画布上绘制一个蓝色360*360的矩形
        paint.setColor(Color.BLUE);
        canvas.drawRect(rect, paint);*/

        /**
         * rotate()的例子
        //以自定义点为基准点将绘图坐标系旋转45度
        canvas.rotate(45, 200, 200);
        //在画布上绘制一个蓝色360*360的矩形
        paint.setColor(Color.BLUE);
        canvas.drawRect(rect, paint);*/

        //以原点为基准点对绘图坐标系进行倾斜变换
        canvas.skew(1, 0);
        //在画布上绘制一个蓝色360*360的矩形
        paint.setColor(Color.RED);
        paint.setStrokeWidth(10);
        canvas.drawLine(0, 0, 360, 0, paint);
        canvas.drawLine(0, 0, 0, 360, paint);
    }
}
