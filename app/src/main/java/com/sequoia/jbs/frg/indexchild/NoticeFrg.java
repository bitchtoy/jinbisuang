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
public class NoticeFrg extends BaseFrg{
    public static NoticeFrg getNoticeFrg(){
        return new NoticeFrg();
    }
    @Override
    protected int setView() {
        return R.layout.frg_notice;
    }

    @Override
    protected void initView(View view, Bundle savedInstanceState) {

    }

    @Override
    public void upData(Object s) {

    }
}
