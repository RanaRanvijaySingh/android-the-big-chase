package the.mini.pro;

import the.mini.pro.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public class opt extends Activity implements OnClickListener
{

	ImageView disp;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.opt);
		
		
		disp=(ImageView) findViewById(R.id.IVdisp);
		
		ImageView  i1=(ImageView) findViewById(R.id.IVi1);
		ImageView  i2=(ImageView) findViewById(R.id.IVi2);
		ImageView  i3=(ImageView) findViewById(R.id.IVi3);
		ImageView  i4=(ImageView) findViewById(R.id.IVi4);
		ImageView  i5=(ImageView) findViewById(R.id.IVi5);
		ImageView  i6=(ImageView) findViewById(R.id.IVi6);
		
		
		i1.setOnClickListener(this);
		i2.setOnClickListener(this);
		i3.setOnClickListener(this);
		i4.setOnClickListener(this);
		i5.setOnClickListener(this);
		i6.setOnClickListener(this);
		
	}
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		
		switch(v.getId())
		{
		case R.id.IVi1:disp.setImageResource(R.drawable.i1);break;
		case R.id.IVi2:disp.setImageResource(R.drawable.i2);break;
		case R.id.IVi3:disp.setImageResource(R.drawable.i3);break;
		case R.id.IVi4:disp.setImageResource(R.drawable.i4);break;
		case R.id.IVi5:disp.setImageResource(R.drawable.i5);break;
		case R.id.IVi6:disp.setImageResource(R.drawable.i6);break;
		}
		
	}

		
}
