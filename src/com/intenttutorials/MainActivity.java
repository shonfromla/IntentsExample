package com.intenttutorials;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
 
public class MainActivity extends Activity {
	
	  private static final int REQUEST_CODE = 1;

	
	 
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Button button = (Button) findViewById(R.id.buttonOne);
		Button button2 = (Button) findViewById(R.id.buttonTwo);
		Button button3 = (Button) findViewById(R.id.buttonThree);
		Button button4 = (Button) findViewById(R.id.buttonFour);
		
		
        button.setOnClickListener(new View.OnClickListener() {
          
        	public void onClick(View v) {
        	    Intent intent = null;
        		intent = new Intent(Intent.ACTION_VIEW,
        		          Uri.parse("https://github.com/smccray/"));
        		
        		if (intent != null) {
        		      startActivity(intent);
        		    }
            }   		    
        });
        
  
        
        button2.setOnClickListener(new View.OnClickListener() {

        	
        	public void onClick(View v) {
        	    Intent intent = new Intent();
        	    intent.setType("image/*");
        	    intent.setAction(Intent.ACTION_GET_CONTENT);
        	    intent.addCategory(Intent.CATEGORY_OPENABLE);
        	    startActivityForResult(intent, REQUEST_CODE);
        	 
        	}
        	
        });

         
        	
        button3.setOnClickListener(new View.OnClickListener() {
            
        	public void onClick(View v) {
        	    Intent intent = null;
        	    intent = new Intent(Intent.ACTION_VIEW,
        	            Uri.parse("content://contacts/people/"));
        		
        		if (intent != null) {
        		      startActivity(intent);
        		    }
            }   		    
        });
        
        button4.setOnClickListener(new View.OnClickListener() {
            
        	public void onClick(View v) {
        	    Intent intent = null; 
        	    intent = new Intent(Intent.ACTION_VIEW,
        	            Uri.parse("geo:0,0?q=query"));
        	    
        	    if (intent != null) {
      		      startActivity(intent);
        	    }
        	    
        	}
             		    
        });
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	
   

}