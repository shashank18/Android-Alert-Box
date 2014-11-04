package com.shashank.alert;
/* Simple Code to understand the concept of Alerts
 * Import the project and run for best results
 * Author: Shashank S Mirji
 * email: shashankmirji@gmail.com*/
import com.app.alert.R;
import com.app.alert.R.id;
import com.app.alert.R.layout;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class AlertActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        Button b1=(Button) findViewById(R.id.button1);
        
        b1.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				
				AlertDialog.Builder build=new AlertDialog.Builder(AlertActivity.this);
				
				build.setMessage("Do you want to exit");
				build.setCancelable(false);
				
				build.setPositiveButton("yes", new DialogInterface.OnClickListener() {
					
					public void onClick(DialogInterface dialog, int which) {
						// TODO Auto-generated method stub
						
						AlertActivity.this.finish();
					}
				});
				
				
				build.setNegativeButton("no",new DialogInterface.OnClickListener() {
					
					public void onClick(DialogInterface dialog, int which) {
						// TODO Auto-generated method stub
						
						dialog.cancel();
					}
				});
				
				AlertDialog alert=build.create();
				alert.show();
				
			}
		});
    }
}