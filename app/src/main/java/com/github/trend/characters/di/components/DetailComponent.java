package com.github.trend.characters.di.components;

import com.github.trend.characters.di.modules.DetailModule;
import com.github.trend.characters.di.scopes.UserScope;
import com.github.trend.characters.view.activity.AudioDetailActivity;
import com.github.trend.characters.view.activity.DetailActivity;
import com.github.trend.characters.view.activity.VideoDetailActivity;

import dagger.Component;

/**
 * Created by Mr.Yangxiufeng
 * DATE 2016/10/22
 * owspace
 */
@UserScope
@Component(modules = DetailModule.class,dependencies = NetComponent.class)
public interface DetailComponent {
    void inject(DetailActivity activity);
    void inject(VideoDetailActivity activity);
    void inject(AudioDetailActivity activity);
}
