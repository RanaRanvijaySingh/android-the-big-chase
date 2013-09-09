package the.mini.pro;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.content.Intent;


import android.os.Bundle;

import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Menu extends Activity
{
    

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		ms.stop();
	}

	/** Called when the activity is first created. */
 
	MediaPlayer m1,m2,ms;
    public void onCreate(Bundle ranvijay) 
    {
    	
        super.onCreate(ranvijay);
     
       setContentView(R.layout.menu);
 
       
       m1= MediaPlayer.create(Menu.this, R.raw.bs4);
       m2= MediaPlayer.create(Menu.this, R.raw.bs3);
       ms= MediaPlayer.create(Menu.this,R.raw.s30);
       
      
              
       Button b1= (Button) findViewById(R.id.btnPlay);
       Button b2= (Button) findViewById(R.id.bi);
       Button b3= (Button) findViewById(R.id.bo);
       Button b4= (Button) findViewById(R.id.be);
       
       b1.setOnClickListener(new View.OnClickListener() {
		
		public void onClick(View v) {
			// TODO Auto-generated method stub
			
			m1.start();
		
			startActivity(new Intent("the.mini.pro.BPLAY"));
		}
	});
       
       
       b2.setOnClickListener(new View.OnClickListener() {
   		
   		public void onClick(View v) {
   			// TODO Auto-generated method stub
   			m2.start();
   			startActivity(new Intent("the.mini.pro.BINST"));
   		}
   	});
       
       b3.setOnClickListener(new View.OnClickListener() {
      		
      		public void onClick(View v) {
      			// TODO Auto-generated method stub
      			m1.start();
      			startActivity(new Intent("the.mini.pro.BOPT"));
      		}
      	});
       
       
       

       b4.setOnClickListener(new View.OnClickListener() {
      		
      		public void onClick(View v) {
      			
      			//TODO Auto-generated method stub
      			System.exit(1);
      		}
      	});
       
       
       
    }
    
    private void Handler() {
		// TODO Auto-generated method stub
    	

	}
    
}