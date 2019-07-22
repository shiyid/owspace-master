package com.github.trend.characters.di.modules;

import com.github.trend.characters.presenter.ArticalContract;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Mr.Yangxiufeng
 * DATE 2016/10/22
 * owspace
 */
@Module
public class DailyModule {
    private ArticalContract.View mView;

    public DailyModule(ArticalContract.View mView) {
        this.mView = mView;
    }
    @Provides
    public ArticalContract.View provideView(){
        return mView;
    }
}
