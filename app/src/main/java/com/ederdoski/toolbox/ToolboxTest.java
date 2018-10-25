package com.ederdoski.toolbox;

import android.app.Application;
import android.content.Context;

import com.marcinorlowski.fonty.Fonty;
import com.orhanobut.logger.AndroidLogAdapter;
import com.orhanobut.logger.FormatStrategy;
import com.orhanobut.logger.Logger;
import com.orhanobut.logger.PrettyFormatStrategy;

public class ToolboxTest extends Application {

    private static Context context;

    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();

        //---- Loggers

        FormatStrategy formatStrategy = PrettyFormatStrategy.newBuilder()
                .showThreadInfo(false)
                .methodCount(0)
                .methodOffset(7)
                .build();

        Logger.addLogAdapter(new AndroidLogAdapter(formatStrategy));

        //----Fuentes

        Fonty.context(this)
                .regularTypeface("Nunito-Regular.ttf")
                .boldTypeface("Nunito-SemiBold.ttf")
                .done();
    }

    public static Context getAppContext() {
        return context;
    }
}
