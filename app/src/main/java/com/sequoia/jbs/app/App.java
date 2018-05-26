package com.sequoia.jbs.app;

import android.app.Application;
import android.content.IntentFilter;
import android.os.Build;
import android.util.Log;

import com.blankj.utilcode.util.SPUtils;
import com.blankj.utilcode.util.Utils;
import com.sequoia.jbs.utils.netchangestate.InterNetStateBroadcastReceiver;

import java.util.Set;

import cn.jpush.android.api.JPushInterface;
import cn.jpush.android.api.TagAliasCallback;

/**
 * @author Administrator.
 * @date 2018/5/24.
 * @funtion
 */
public class App extends Application {
    private InterNetStateBroadcastReceiver mNetChangeState = new InterNetStateBroadcastReceiver();
    @Override
    public void onCreate() {
        super.onCreate();
        Utils.init(this);
        String s = "alias"+ Build.PRODUCT;
        JPushInterface.setDebugMode(true);
        JPushInterface.init(this);
        Log.d("----->alias",s);
        JPushInterface.setAlias(this, s, new TagAliasCallback() {
            @Override
            public void gotResult(int i, String s, Set<String> set) {

            }
        });
        IntentFilter filter = new IntentFilter();
        filter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        filter.addAction("android.net.wifi.WIFI_STATE_CHANGE");
        filter.addAction("android.net.conn.STATE_CHANGE");
        registerReceiver(mNetChangeState,filter);
    }
}
