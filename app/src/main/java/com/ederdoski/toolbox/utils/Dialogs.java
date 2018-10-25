package com.ederdoski.toolbox.utils;

import android.app.Activity;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Eder on 22-10-2017.
 */

public class Dialogs {

    private static Activity act;

    public Dialogs(Activity _act){
        act = _act;
    }

   /* public static AlertDialog loading(){

        AlertDialog.Builder builder = new AlertDialog.Builder(act);

        LayoutInflater inflater = act.getLayoutInflater();

        View view = inflater.inflate(R.layout.node_loading, null);

        TextView txtTitle    = view.findViewById(R.id.txtTitle);
        ImageView imgLoading = view.findViewById(R.id.imgLoading);

        Functions.setFontBold(act, txtTitle);
        txtTitle.setText(R.string.txt_load);
        Functions.setGift(act, R.drawable.gif_loading_puplinx, imgLoading);

        builder.setView(view);
        return builder.create();
    }*/

    public static void show(AlertDialog dialog){
        dialog.show();
    }

    public static void hide(AlertDialog dialog){
        dialog.dismiss();
    }

}
