package com.chowdhuryelab.roadbuddy.Models;

import android.app.Activity;
import android.app.AlertDialog;
import android.view.LayoutInflater;

import com.chowdhuryelab.roadbuddy.R;


public class WelcomeDialog {

    Activity activity ;
    AlertDialog dialog ;

    public WelcomeDialog(Activity myActivity){
        activity = myActivity;
    }

   public  void startDialog(){
        AlertDialog.Builder builder  = new AlertDialog.Builder(activity);
        LayoutInflater inflater = activity.getLayoutInflater();
        builder.setView(inflater.inflate(R.layout.custom_dialog_dashboard, null));
        builder.setCancelable(false);

        dialog = builder.create();
        dialog.show();
    }

  public  void stopDialog(){
        dialog.dismiss();
    }
}
