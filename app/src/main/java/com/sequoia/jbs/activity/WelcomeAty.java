package com.sequoia.jbs.activity;

import android.content.Intent;
import android.os.Bundle;

import com.blankj.utilcode.util.SPUtils;
import com.sequoia.jbs.base.BaseAty;
import com.sequoia.jbs.utils.UserCount;

/**
 * @author Administrator.
 * @date 2018/5/25.
 * @funtion
 */
public class WelcomeAty extends BaseAty {


    @Override
    public void initView(Bundle savedInstanceState) {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(3000);
                    Intent intent;
                    if (SPUtils.getInstance().getString(UserCount.ID).equals("") || SPUtils.getInstance().getString(UserCount.ID) == null) {
                        intent = new Intent(WelcomeAty.this, LoginAty.class);
                    } else {
                        intent = new Intent(WelcomeAty.this, MainAty.class);
                    }
                    startActivity(intent);
                    finish();

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

    }

    @Override
    public void upData(Object s) {

    }
}
