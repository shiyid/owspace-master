package com.github.trend.characters.di.components;

import com.github.trend.characters.di.modules.DailyModule;
import com.github.trend.characters.di.scopes.UserScope;
import com.github.trend.characters.view.activity.DailyActivity;

import dagger.Component;

/**
 * Created by Mr.Yangxiufeng
 * DATE 2016/10/22
 * owspace
 */
@UserScope
@Component(modules = DailyModule.class,dependencies = NetComponent.class)
public interface DailyComponent {
    void inject(DailyActivity activity);
}
