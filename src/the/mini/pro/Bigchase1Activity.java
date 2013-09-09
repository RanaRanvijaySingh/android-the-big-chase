package the.mini.pro;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

public class Bigchase1Activity extends Activity {
    /** Called when the activity is first created. */
	MediaPlayer m1;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        m1=MediaPlayer.create(this, R.raw.s30);
        m1.start();
        Thread th = new Thread ()
		{
			public void run()
			{
				try
					
				{
					
					sleep(5000);
					Intent i1=  new Intent("the.mini.pro.MENU");
					startActivity(i1);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					System.out.println("there is the exception");
					e.printStackTrace();
				}
				finally 
				{
					finish();
				}
		}
			
			
		};
		th.start();
    }
}