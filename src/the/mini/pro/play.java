package the.mini.pro;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.Toast;

public class play extends Activity implements OnTouchListener
{

	Ball v;
	Ball2 v2;
	Bitmap jerry;
	float x,y;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.play);
		v= new Ball(play.this);
		setContentView(v);
		v2= new Ball2(play.this);
		v2.setOnTouchListener(this);
		jerry=BitmapFactory.decodeResource(getResources(), R.drawable.jerry);
		x=y=0;
		setContentView(v2);
		
		
		
	}

	public boolean onCreateOptionsMenu(Menu menu){
		super.onCreateOptionsMenu(menu);
		
    	MenuInflater awe=getMenuInflater();
    	awe.inflate(R.menu.m_m,menu);
    	
    	
		return true;
    	
    }
    public boolean onOptionsItemSelected(MenuItem item){

		switch(item.getItemId())
		{
		case R.id.menuS:
			startActivity(new Intent("the.mini.pro.BOPT"));
			return true;
		case R.id.menuT:
			startActivity(new Intent("the.mini.pro.BINST"));
			return true;
			

		case R.id.menuM:
			startActivity(new Intent("the.mini.pro.MENU"));
			return true;
		
		case R.id.menuA:
			
			startActivity(new Intent("the.mini.pro.LOGAN"));
			
			
			//Toast abt=Toast.makeText(play.this, "this is ranviay app how r u ?", Toast.LENGTH_LONG);
			//abt.show();
		
			return true;
			
		}
    	return false;
    	
    }

    public class Ball2 extends play implements Runnable
    {
    	
		
		Thread t=null;
    	SurfaceHolder hold;
    	boolean isok=false;
    	
    	public Ball2(Context context)
    	{
    		super();
    		hold = getHolder();
    		
    	}

    	
    	public void setOnTouchListener(play play) {
			// TODO Auto-generated method stub
			
		}


		@Override
		protected void onPause() {
			// TODO Auto-generated method stub
			super.onPause();
			v2.pause();
			
		}
		
    	

		@Override
		protected void onResume() {
			// TODO Auto-generated method stub
			super.onResume();
			v2.resume();
		}
    	    	
		@Override
		public void run() {

			// TODO Auto-generated method stub
			while(isok==true)
			{
				if(!hold.getSurface().isValid())
				{
					continue;
				}
				Canvas c=hold.lockCanvas();
				c.drawARGB(255, 150, 150, 10);
				c.drawBitmap(jerry, x-(jerry.getWidth()/2), y-(jerry.getHeight()/2), null);
				hold.unlockCanvasAndPost(c);
			}
		}
    	
		public void pause()
		{
			isok=false;
			while(true)
			{
				try {
					t.join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
				
			}
			
			t=null;
		}
						
		public void resume()

		{
			isok= true;
			t= new Thread(this);
			t.start();
		}
    	
    }
    
    public boolean onTouch(View v2,MotionEvent me)
    {
    	try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	switch(me.getAction())
    	{
    	case MotionEvent.ACTION_DOWN:x=me.getX();
    	y= me.getY();

    		break;
    	case MotionEvent.ACTION_UP:x=me.getX();
    	y= me.getY();
    		break;
    	case MotionEvent.ACTION_MOVE:x=me.getX();
    	y= me.getY();
    		break;
    	}
    	
    	return true;
    }
}
    