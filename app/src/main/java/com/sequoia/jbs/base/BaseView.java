package com.sequoia.jbs.base;

/**
 * Created by Administrator on 2018/5/3.
 */

public interface BaseView {
    //dialog 加载
    void showDialog();
    void hideDialog();
    //toast
    void toast(String msg);
    void upData(Object s);

}
