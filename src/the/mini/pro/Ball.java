package the.mini.pro;

import the.mini.pro.R.color;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;

public class Ball extends View{

	
	Bitmap tom;
	int x,y;

	public Ball(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
		tom=BitmapFactory.decodeResource(getResources(), R.drawable.tom1);
		x=0;y=0;
	}
	
	@Override
	protected void onDraw(Canvas canvas)
	{
		// TODO Auto-generated method stub
		super.onDraw(canvas);
		Rect r1= new Rect();
		r1.set(0, 0, canvas.getWidth(), canvas.getHeight()/2);
		
		Paint green = new Paint();
		green.setColor(Color.DKGRAY);
		green.setStyle(Paint.Style.FILL);
		
		canvas.drawRect(r1, green);
		Paint p=  new Paint();
		if(x<canvas.getWidth())
		{
			x+=20;
			canvas.drawBitmap(tom, x, y, p);
			
		}
		else
		{
			x=0;
		
		}
		if(y<canvas.getHeight())
		{
			y+=20;
		
		}
		else
		{
			y=0;
		}
		
		
		invalidate();
	}
}
