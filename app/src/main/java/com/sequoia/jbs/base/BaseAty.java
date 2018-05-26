package com.sequoia.jbs.base;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.WindowManager;
import android.widget.Toast;

import com.jaeger.library.StatusBarUtil;
import com.sequoia.jbs.utils.netchangestate.InterNetObservable;
import com.sequoia.jbs.utils.netchangestate.InterNetObserver;
import com.sequoia.jbs.utils.netchangestate.NetWorkData;

import java.util.Observable;

/**
 * @author Administrator.
 * @date 2018/5/24.
 * @funtion
 */
public abstract class BaseAty extends AppCompatActivity implements BaseView {
    private ProgressDialog progressDialog = null;
    private InterNetObserver observer = new InterNetObserver() {
        @Override
        public void update(Observable observable, Object o) {
            super.update(observable, o);
            NetWorkData data = (NetWorkData) o;
            upInternet();
            if (!data.isConnection()) {
                toast("网络不可用");
            }
        }
    };

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_NOTHING);
        initView(savedInstanceState);
    }

    public abstract void initView(Bundle savedInstanceState);
    @Override
    public void showDialog() {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                if (progressDialog != null && progressDialog.isShowing()) {
                    progressDialog.dismiss();
                }
                progressDialog = ProgressDialog.show(BaseAty.this, "", "请稍等...");
                progressDialog.setCanceledOnTouchOutside(true);
                progressDialog.setCancelable(true);
            }
        });
    }
    @Override
    public void hideDialog() {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                if (progressDialog == null || progressDialog.isShowing()) {
                    progressDialog.dismiss();
                }
            }
        });
    }
    @Override
    public void toast(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onResume() {
        super.onResume();
        InterNetObservable.getInterNetObservable().addObserver(observer);
    }
    @Override
    protected void onStop() {
        super.onStop();
        InterNetObservable.getInterNetObservable().deleteObserver(observer);
    }
    protected void upInternet(){

    }

}
