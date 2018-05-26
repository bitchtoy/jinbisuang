package com.sequoia.jbs.presenter;

import android.util.Log;
import android.widget.Adapter;

import com.google.gson.Gson;
import com.lzy.okgo.OkGo;
import com.lzy.okgo.callback.StringCallback;
import com.lzy.okgo.model.HttpParams;
import com.sequoia.jbs.base.BaseView;
import com.sequoia.jbs.bean.LoginBean;
import com.sequoia.jbs.model.LoginModel;
import com.sequoia.jbs.utils.HttpUrls;

import java.util.Map;



/**
 * @author Administrator.
 * @date 2018/5/24.
 * @funtion
 */
public class LoginPresenter {
    private BaseView mBaseView;
    private LoginModel mLoginModel;
    public LoginPresenter(BaseView baseView){
        mBaseView = baseView;
        mLoginModel = new LoginModel();
    }
    private void showDialog(){
        if (mBaseView != null){
            mBaseView.showDialog();
        }
    }
    private void hideDialog(){
        if (mBaseView != null){
            mBaseView.hideDialog();
        }
    }
    private void upView(Object s){
        mBaseView.upData(s);
    }
    private void saveToModel(String s){
        mLoginModel.setModel(s);
    }
    public void internetRequest(HttpParams a){
        getLoginCallBack(a);
    }
    private void getLoginCallBack(HttpParams a) {
        showDialog();
        OkGo.<String>post(HttpUrls.LOGIN_URL)
                .params(a)
                .execute(new StringCallback() {
            @Override
            public void onSuccess(com.lzy.okgo.model.Response<String> response) {
                Log.d("---->",response.body().toString());
                hideDialog();
                LoginBean bean = new Gson().fromJson(response.body().toString(),LoginBean.class);
                upView(bean);
                saveToModel(response.body());
            }

            @Override
            public void onError(com.lzy.okgo.model.Response<String> response) {
                super.onError(response);
            }
        });


    }



}
