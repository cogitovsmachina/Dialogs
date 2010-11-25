package org.androidtitlan.dialogs;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Dialogs extends Activity {
	    @Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        //set up main content view
	        setContentView(R.layout.main);
	        //this button will show the dialog
	        setupViews();
	
	    }

		private void setupViews() {
	        Button customDialogButton = (Button) findViewById(R.id.custom_dialog_button);
	       // Button alertDialogButton = (Button) findViewById)
	        
	        customDialogButton.setOnClickListener(new OnClickListener() {
	            public void onClick(View v) {
	                //set up dialog
	                final Dialog dialog = new Dialog(Dialogs.this);
	                dialog.setContentView(R.layout.customdialog);
	                dialog.setTitle("This is a Custom dialog box");
	                dialog.setCancelable(true);
	                //there are a lot of settings, for dialog, check them all out!
	 
	                //set up text
	                TextView text = (TextView) dialog.findViewById(R.id.TextView01);
	                text.setText(R.string.lots_of_texts);
	 
	                //set up image view
	                ImageView img = (ImageView) dialog.findViewById(R.id.ImageView01);
	                img.setImageResource(R.drawable.icon);
	 
	                //set up button
	                Button button = (Button) dialog.findViewById(R.id.Button01);
	                button.setOnClickListener(new OnClickListener() {
	                public void onClick(View v) {
	                	dialog.cancel();
	                        
	                    }
	                });
	                //now that the dialog is set up, it's time to show it    
	                dialog.show();
	            }

				
	        });
		}
	 }