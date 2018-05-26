package com.sequoia.jbs.frg;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.sequoia.jbs.R;
import com.sequoia.jbs.base.BaseFrg;
import com.sequoia.jbs.bean.CenterBean;
import com.sequoia.jbs.presenter.CenterPresenter;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

/**
 * @author Administrator.
 * @date 2018/5/25.
 * @funtion
 */
public class CenterFrg extends BaseFrg {

    @BindView(R.id.tool_title)
    TextView tool_title;
    @BindView(R.id.tool_right)
    ImageButton tool_right;
    @BindView(R.id.tool_bar)
    Toolbar tool_bar;
    Unbinder unBinder;
    @BindView(R.id.center_user_data)
    TextView index_user_data;
    @BindView(R.id.center_my_customer)
    TextView index_my_customer;
    @BindView(R.id.center_my_new_add_customer)
    TextView new_add_customer;
    @BindView(R.id.center_new_add_customer)
    LinearLayout index_new_add_customer;
    @BindView(R.id.center_new_add_order)
    LinearLayout index_new_add_order;
    @BindView(R.id.center_main_order)
    LinearLayout index_main_order;
    @BindView(R.id.center_gl)
    LinearLayout index_gl;
    @BindView(R.id.center_jh)
    LinearLayout index_jh;
    @BindView(R.id.center_th)
    LinearLayout index_th;
    @BindView(R.id.center_lx)
    LinearLayout index_lx;
    private CenterPresenter mPresenter = null;
    public static CenterFrg getCenterFrg() {
        return new CenterFrg();
    }

    @Override
    protected int setView() {
        return R.layout.frg_center;
    }

    @Override
    protected void initView(View view, Bundle savedInstanceState) {
        unBinder = ButterKnife.bind(this, view);
        initLayout();
        initData();

    }

    private void initData() {
        mPresenter = new CenterPresenter(this);
        mPresenter.internetRequest();
    }

    @SuppressLint("ResourceAsColor")
    private void initLayout() {
        tool_title.setText(R.string.index_btn);
        tool_right.setImageResource(R.drawable.bell);
        tool_bar.setBackground(getResources().getDrawable(R.drawable.index_head_bg_color));

    }

    @Override
    public void upData(Object s) {
        CenterBean bean = (CenterBean) s;
        CenterBean.DataBean dataBean = bean.getData();
        index_user_data.setText(dataBean.getGreeting());
        index_my_customer.setText(dataBean.getAlluser()+"");
        new_add_customer.setText(dataBean.getNowuser()+"");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        unBinder.unbind();
    }

    @OnClick({R.id.center_new_add_customer, R.id.center_new_add_order, R.id.center_main_order, R.id.center_gl, R.id.center_jh,
            R.id.center_th, R.id.center_lx})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.center_new_add_customer:

                break;
            case R.id.center_new_add_order:

                break;
            case R.id.center_main_order:

                break;
            case R.id.center_gl:

                break;
            case R.id.center_jh:

                break;
            case R.id.center_th:

                break;
            case R.id.center_lx:

                break;
            default:
                break;
        }
    }

    @Override
    protected void upInternet() {
        super.upInternet();
        mPresenter.internetRequest();
    }
}
