package com.ederdoski.toolbox.utils;

import android.content.Context;
import android.content.SharedPreferences;

import com.ederdoski.toolbox.ToolboxTest;

/**
 * Created by Eder Dominguez on 24/10/18.
 */

public class Preferences {

    private static final String TAG = "ederdoski.toolbox";

    //----------------------------- Set Preferences ---------------------------------------------

    public static void setHeaderAuthorization(String data){
        setValue(ToolboxTest.getAppContext(), TAG, data);
    }

    //----------------------------- Get Preferences ---------------------------------------------

    public static String getHeaderAuthorization(){
        return getStringValue(ToolboxTest.getAppContext(), TAG, Constants.NULL);
    }

    /*---------------------------------------------------------------------------*/

    private static void setValue(Context ctx, String key, String value){
        SharedPreferences prefs = getPreferences(ctx);
        prefs.edit().putString(key, value).apply();
    }

    private static void setValue(Context ctx, String key, int value){
        SharedPreferences prefs = getPreferences(ctx);
        prefs.edit().putInt(key, value).apply();
    }

    private static String getStringValue(Context ctx, String key, String value){
        SharedPreferences prefs = getPreferences(ctx);
        return prefs.getString(key, value);
    }
    private static int getIntValue(Context ctx, String key, int value){
        SharedPreferences prefs = getPreferences(ctx);
        return prefs.getInt(key, value);
    }

    private static SharedPreferences getPreferences(Context ctx){
        return ctx.getSharedPreferences(TAG, Context.MODE_PRIVATE);
    }

}
