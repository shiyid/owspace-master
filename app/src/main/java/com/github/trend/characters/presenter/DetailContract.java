package com.github.trend.characters.presenter;

import com.github.trend.characters.model.entity.DetailEntity;

/**
 * Created by Mr.Yangxiufeng
 * DATE 2016/8/9
 * owspace
 */
public interface DetailContract {
    interface Presenter{
        void getDetail(String itemId);
    }
    interface View{
        void showLoading();
        void dismissLoading();
        void updateListUI(DetailEntity detailEntity);
        void showOnFailure();
    }
}
