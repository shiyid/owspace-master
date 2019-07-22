package com.github.trend.characters.di.components;

import com.github.trend.characters.di.modules.ArtModule;
import com.github.trend.characters.di.scopes.UserScope;
import com.github.trend.characters.view.activity.ArtActivity;

import dagger.Component;

/**
 * Created by Mr.Yangxiufeng
 * DATE 2016/10/22
 * owspace
 */
@UserScope
@Component(modules = ArtModule.class,dependencies = NetComponent.class)
public interface ArtComponent {
    void inject(ArtActivity artActivity);
}
