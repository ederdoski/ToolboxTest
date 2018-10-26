package com.ederdoski.toolbox.utils;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.ederdoski.toolbox.R;
import com.ederdoski.toolbox.interfaces.BasicCallback;

/**
 * Created by Eder on 22-10-2017.
 */

public class Dialogs {

    private static Activity act;

    public Dialogs(Activity _act){
        act = _act;
    }

    public static AlertDialog setDialogInfo(int title, int message, BasicCallback callback){

        AlertDialog.Builder builder = new AlertDialog.Builder(act);

        LayoutInflater inflater = act.getLayoutInflater();

        View view = inflater.inflate(R.layout.dialog_standard, null);

        TextView btnNeutral = view.findViewById(R.id.btnNeutral);
        TextView txtTitle   = view.findViewById(R.id.txtTitle);
        TextView txtMessage = view.findViewById(R.id.txtMessage);

        txtTitle.setText(title);
        txtMessage.setText(message);

        btnNeutral.setOnClickListener(view1 -> callback.onSuccess(""));

        builder.setView(view);
        return builder.create();
    }

    public static void show(AlertDialog dialog){
        dialog.show();
        setTransparence(dialog);
    }

    public static void hide(AlertDialog dialog){
        dialog.dismiss();
    }

    public static void setTransparence(AlertDialog dialog){
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
    }
}
