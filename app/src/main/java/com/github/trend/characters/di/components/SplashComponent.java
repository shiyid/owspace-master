package com.github.trend.characters.di.components;

import com.github.trend.characters.di.modules.SplashModule;
import com.github.trend.characters.di.scopes.UserScope;
import com.github.trend.characters.view.activity.SplashActivity;

import dagger.Component;

/**
 * Created by Mr.Yangxiufeng
 * DATE 2016/10/25
 * owspace
 */
@UserScope
@Component(modules = SplashModule.class,dependencies = NetComponent.class)
public interface SplashComponent {
    void inject(SplashActivity splashActivity);
}
