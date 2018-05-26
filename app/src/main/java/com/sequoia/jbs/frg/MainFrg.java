package com.sequoia.jbs.frg;

import android.os.Bundle;
import android.view.View;

import com.sequoia.jbs.R;
import com.sequoia.jbs.base.BaseFrg;

/**
 * @author Administrator.
 * @date 2018/5/25.
 * @funtion
 */
public class MainFrg extends BaseFrg {

    public static MainFrg getMainFrg(){
        return new MainFrg();
    }
    @Override
    protected int setView() {
        return R.layout.frg_main;
    }

    @Override
    protected void initView(View view, Bundle savedInstanceState) {

    }

    @Override
    public void upData(Object s) {

    }
}
