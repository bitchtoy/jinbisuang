package com.sequoia.jbs.presenter;

import android.util.Log;

import com.blankj.utilcode.util.SPUtils;
import com.google.gson.Gson;
import com.lzy.okgo.OkGo;
import com.lzy.okgo.callback.StringCallback;
import com.sequoia.jbs.base.BaseView;
import com.sequoia.jbs.bean.CenterBean;
import com.sequoia.jbs.model.CenterModel;
import com.sequoia.jbs.model.IndexModel;
import com.sequoia.jbs.utils.HttpUrls;
import com.sequoia.jbs.utils.UserCount;

/**
 * @author Administrator.
 * @date 2018/5/26.
 * @funtion
 */
public class IndexPresenter {
    private BaseView mBaseView;
    private IndexModel mIndexModel;
    public IndexPresenter(BaseView baseView){
        mBaseView = baseView;
        mIndexModel = new IndexModel();
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
    private void saveToModel(Object s){
        mIndexModel.setModel(s);
    }
    public void internetRequest(){
        getIndexCallBack();
    }
    private void getIndexCallBack() {
        showDialog();
        OkGo.<String>post(HttpUrls.INDEX_URL)
                .params("pid", SPUtils.getInstance().getString(UserCount.ID))
                .execute(new StringCallback() {
                    @Override
                    public void onSuccess(com.lzy.okgo.model.Response<String> response) {
                        Log.d("---->",response.body().toString());
                        hideDialog();
                        CenterBean bean = new Gson().fromJson(response.body().toString(),CenterBean.class);
                        upView(bean);
                        saveToModel(bean);
                    }
                    @Override
                    public void onError(com.lzy.okgo.model.Response<String> response) {
                        super.onError(response);
                    }
                });


    }
}
