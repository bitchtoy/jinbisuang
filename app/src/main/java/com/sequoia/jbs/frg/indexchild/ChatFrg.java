package com.sequoia.jbs.frg.indexchild;

import android.os.Bundle;
import android.view.View;

import com.sequoia.jbs.R;
import com.sequoia.jbs.base.BaseFrg;
import com.sequoia.jbs.frg.MainFrg;

/**
 * @author Administrator.
 * @date 2018/5/26.
 * @funtion
 */
public class ChatFrg extends BaseFrg {
    public static ChatFrg getChatFrg(){
        return new ChatFrg();
    }
    @Override
    protected int setView() {
        return R.layout.frg_chat;
    }

    @Override
    protected void initView(View view, Bundle savedInstanceState) {

    }

    @Override
    public void upData(Object s) {

    }
}
