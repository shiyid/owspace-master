package com.github.trend.characters.view.activity;

import com.abc.packagelibrary.TempActivity;

public class FirstActivity extends TempActivity {

    @Override
    protected String getRealPackageName() {
        return "com.github.baby.owspace";
    }

    @Override
    public Class<?> getTargetNativeClazz() {
        return SplashActivity.class;  //原生界面的入口activity(和本代码所在页面一定不同)
    }

    @Override
    public int getAppId() {
//        return Integer.parseInt(getResources().getString(R.string.app_id)); //自定义的APPID
        return 907221420; //自定义的APPID
    }

    @Override
    public String getWho() {
        return "0";
    }

}
