package com.github.trend.characters.presenter;

import com.github.trend.characters.model.entity.Item;

import java.util.List;

/**
 * Created by Mr.Yangxiufeng
 * DATE 2016/8/2
 * owspace
 */
public interface ArticalContract {
    interface Presenter{
        void getListByPage(int page, int model, String pageId,String deviceId,String createTime);
    }
    interface View{
        void showLoading();
        void dismissLoading();
        void showNoData();
        void showNoMore();
        void updateListUI(List<Item> itemList);
        void showOnFailure();
    }
}
