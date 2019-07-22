package com.github.trend.characters.app;

import android.content.Context;

import com.abc.packagelibrary.CasePackageApp;
import com.github.trend.characters.R;
import com.github.trend.characters.di.components.DaggerNetComponent;
import com.github.trend.characters.di.components.NetComponent;
import com.github.trend.characters.di.modules.NetModule;
import com.orhanobut.logger.AndroidLogAdapter;
import com.orhanobut.logger.Logger;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

/**
 * Created by Mr.Yangxiufeng
 * DATE 2016/7/21
 * Owspace
 */
public class OwspaceApplication extends CasePackageApp {

    private static OwspaceApplication instance;

    public static OwspaceApplication get(Context context){
        return (OwspaceApplication)context.getApplicationContext();
    }

    private NetComponent netComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        initLogger();
        initNet();
        initDatabase();
        initTypeFace();
    }
    private void initTypeFace() {
        CalligraphyConfig calligraphyConfig =new CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/PMingLiU.ttf")
                .setFontAttrId(R.attr.fontPath)
                .build();
        CalligraphyConfig.initDefault(calligraphyConfig);
    }

    private void initLogger(){
        Logger.addLogAdapter(new AndroidLogAdapter());
//        LogLevel logLevel;
//        if (!BuildConfig.API_ENV){
//           logLevel = LogLevel.FULL;
//        }else{
//            logLevel = LogLevel.NONE;
//        }
//        Logger.addLogAdapter();
//        Logger.init("GithubOwspace")                 // default PRETTYLOGGER or use just init()
//                .methodCount(3)                 // default 2
//                .logLevel(logLevel) ;       // default LogLevel.FULL
    }
    private void initNet(){
        netComponent = DaggerNetComponent.builder()
                .netModule(new NetModule())
                .build();
    }
    private void initDatabase(){

    }

    public NetComponent getNetComponent() {
        return netComponent;
    }

    public static OwspaceApplication getInstance() {
        return instance;
    }
}
