package com.sequoia.jbs.frg.indexchild;

import android.os.Bundle;
import android.view.View;

import com.sequoia.jbs.R;
import com.sequoia.jbs.base.BaseFrg;

/**
 * @author Administrator.
 * @date 2018/5/26.
 * @funtion
 */
public class NewsFrg extends BaseFrg {
    public static NewsFrg getNewsFrg(){
        return new NewsFrg();
    }
    @Override
    protected int setView() {
         return R.layout.frg_news;
    }

    @Override
    protected void initView(View view, Bundle savedInstanceState) {

    }

    @Override
    public void upData(Object s) {

    }
}
