package com.sequoia.jbs.activity;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.jaeger.library.StatusBarUtil;
import com.sequoia.jbs.R;
import com.sequoia.jbs.base.BaseAty;
import com.sequoia.jbs.frg.CenterFrg;
import com.sequoia.jbs.frg.IndexFrg;
import com.sequoia.jbs.frg.MainFrg;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainAty extends BaseAty implements RadioGroup.OnCheckedChangeListener {

    @BindView(R.id.index_radio_btn)
    RadioButton index_radio_btn;
    @BindView(R.id.main_radio_btn)
    RadioButton main_radio_btn;
    @BindView(R.id.index_radio_group)
    RadioGroup index_radio_group;
    @BindView(R.id.index_frame)
    FrameLayout index_frame;
    @BindView(R.id.center_radio_btn)
    RadioButton center_radio_btn;
    private FragmentManager mManager = null;
    private CenterFrg centerFrg = null;
    private MainFrg mainFrg = null;
    private IndexFrg indexFrg = null;
    @Override
    public void initView(Bundle savedInstanceState) {
        setContentView(R.layout.aty_main);
        ButterKnife.bind(this);
        StatusBarUtil.setColor(this, getResources().getColor(R.color.state_bar));
        initLayout();

    }

    private void initLayout() {
        mManager = getSupportFragmentManager();
        //底部栏的实现
        index_radio_group.setOnCheckedChangeListener(this);
        index_radio_btn.setChecked(true);
    }


    @Override
    public void upData(Object s) {

    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        FragmentTransaction transaction = mManager.beginTransaction();
        hide(transaction);
        switch (checkedId) {
            case R.id.index_radio_btn:
                if (indexFrg == null) {
                    indexFrg = IndexFrg.getIndexFrg();
                    transaction.add(R.id.index_frame, indexFrg);
                } else {
                    transaction.show(indexFrg);
                }
                break;
            case  R.id.center_radio_btn:
                if (centerFrg == null) {
                    centerFrg = CenterFrg.getCenterFrg();
                    transaction.add(R.id.index_frame, centerFrg);
                } else {
                    transaction.show(centerFrg);
                }
                break;
            case R.id.main_radio_btn:
                if (mainFrg == null) {
                    mainFrg = MainFrg.getMainFrg();
                    transaction.add(R.id.index_frame, mainFrg);
                } else {
                    transaction.show(mainFrg);
                }
                break;
            default:
                break;
        }
        transaction.commit();

    }

    private void hide(FragmentTransaction transaction) {
        if (indexFrg != null) {
            transaction.hide(indexFrg);
        }
        if (centerFrg != null){
            transaction.hide(centerFrg);
        }
        if (mainFrg != null) {
            transaction.hide(mainFrg);
        }
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }
}
