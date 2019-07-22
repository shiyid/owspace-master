package com.github.trend.characters.di.components;

import android.database.sqlite.SQLiteOpenHelper;

import com.github.trend.characters.di.modules.DbModule;
import com.squareup.sqlbrite.BriteDatabase;
import com.squareup.sqlbrite.SqlBrite;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Mr.Yangxiufeng
 * DATE 2016/11/7
 * owspace
 */
@Component(modules = DbModule.class)
@Singleton
public interface DBComponent {
    SQLiteOpenHelper getSQLiteOpenHelper();
    SqlBrite getSqlBrite();
    BriteDatabase getBriteDatabase();
}
