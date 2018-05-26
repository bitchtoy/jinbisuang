package com.sequoia.jbs.frg;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.TextView;

import com.sequoia.jbs.R;
import com.sequoia.jbs.base.BaseFrg;
import com.sequoia.jbs.frg.indexchild.ChatFrg;
import com.sequoia.jbs.frg.indexchild.NewsFrg;
import com.sequoia.jbs.frg.indexchild.NoticeFrg;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

/**
 * @author Administrator.
 * @date 2018/5/26.
 * @funtion
 */
public class IndexFrg extends BaseFrg {


    Unbinder unBinder;
    @BindView(R.id.tool_title)
    TextView tool_title;
    @BindView(R.id.tool_right)
    ImageButton tool_right;
    @BindView(R.id.tool_bar)
    Toolbar tool_bar;
    @BindView(R.id.index_user_data)
    TextView index_user_data;
    @BindView(R.id.index_frg_gg)
    TextView gg;
    @BindView(R.id.index_frg_ltq_o)
    TextView ltq_o;
    @BindView(R.id.index_frame_layout)
    FrameLayout index_frame_layout;
    @BindView(R.id.index_frg_ltq)
    TextView ltq;
    @BindView(R.id.index_frg_xx)
    TextView xx;
    @BindView(R.id.index_frg_gg_o)
    TextView gg_o;
    @BindView(R.id.index_frg_xx_o)
    TextView xx_o;

    private ChatFrg mChatFrg = null;
    private NewsFrg mNewsFrg = null;
    private NoticeFrg mNoticeFrg = null;
    private boolean chatFrgIsShow = false;
    private boolean newFrgIsShow = true;
    private boolean noticeFrgIsShow = false;

    public static IndexFrg getIndexFrg() {
        return new IndexFrg();
    }

    @Override
    protected int setView() {
        return R.layout.frg_index;
    }

    @Override
    protected void initView(View view, Bundle savedInstanceState) {
        unBinder = ButterKnife.bind(this, view);
        initLayout();
    }

    private void initLayout() {
        tool_title.setText(R.string.index_btn);
        tool_right.setImageResource(R.drawable.bell);
        tool_bar.setBackground(getResources().getDrawable(R.drawable.index_head_bg_color));


    }

    @Override
    public void upData(Object s) {

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        unBinder.unbind();
    }

    @OnClick({R.id.index_frg_gg, R.id.index_frg_ltq, R.id.index_frg_xx,
            R.id.index_frg_ltq_o, R.id.index_frg_gg_o, R.id.index_frg_xx_o})
    public void onViewClicked(View view) {
        FragmentTransaction transaction = mFragmentManager.beginTransaction();
        hide(transaction);
        switch (view.getId()) {
            case R.id.index_frg_gg:
                if (newFrgIsShow){
                    xx.setVisibility(View.VISIBLE);
                    gg.setVisibility(View.GONE);
                    ltq.setVisibility(View.GONE);
                }
                if (chatFrgIsShow){
                    xx.setVisibility(View.GONE);
                    gg.setVisibility(View.GONE);
                    ltq.setVisibility(View.VISIBLE);
                }
                if (mNoticeFrg == null) {
                    mNoticeFrg = NoticeFrg.getNoticeFrg();
                    transaction.add(R.id.index_frame_layout, mNoticeFrg);

                } else {
                    transaction.show(mNoticeFrg);
                }
                chatFrgIsShow = false;
                newFrgIsShow = false;
                noticeFrgIsShow = true;
                break;
            case R.id.index_frg_xx:
                if (noticeFrgIsShow){
                    xx.setVisibility(View.GONE);
                    gg.setVisibility(View.VISIBLE);
                    ltq.setVisibility(View.GONE);
                }
                if (chatFrgIsShow){
                    xx.setVisibility(View.GONE);
                    gg.setVisibility(View.GONE);
                    ltq.setVisibility(View.VISIBLE);
                }
                if (mNewsFrg == null) {
                    mNewsFrg = NewsFrg.getNewsFrg();
                    transaction.add(R.id.index_frame_layout, mNewsFrg);

                } else {
                    transaction.show(mNewsFrg);
                }
                chatFrgIsShow = false;
                newFrgIsShow = true;
                noticeFrgIsShow = false;
                break;
            case R.id.index_frg_ltq:
                if (newFrgIsShow){
                    xx.setVisibility(View.VISIBLE);
                    gg.setVisibility(View.GONE);
                    ltq.setVisibility(View.GONE);
                }
                if (noticeFrgIsShow){
                    xx.setVisibility(View.GONE);
                    gg.setVisibility(View.VISIBLE);
                    ltq.setVisibility(View.GONE);
                }
                if (mChatFrg == null) {
                    mChatFrg = ChatFrg.getChatFrg();
                    transaction.add(R.id.index_frame_layout, mChatFrg);
                } else {
                    transaction.show(mChatFrg);
                }
                chatFrgIsShow = true;
                newFrgIsShow = false;
                noticeFrgIsShow = false;
                break;
            case R.id.index_frg_ltq_o:
                if (newFrgIsShow){
                    xx_o.setVisibility(View.VISIBLE);
                    gg_o.setVisibility(View.GONE);
                    ltq_o.setVisibility(View.GONE);
                }
                if (noticeFrgIsShow){
                    xx_o.setVisibility(View.GONE);
                    gg_o.setVisibility(View.VISIBLE);
                    ltq_o.setVisibility(View.GONE);
                }
                if (mChatFrg == null) {
                    mChatFrg = ChatFrg.getChatFrg();
                    transaction.add(R.id.index_frame_layout, mChatFrg);
                } else {
                    transaction.show(mChatFrg);
                }
                chatFrgIsShow = true;
                newFrgIsShow = false;
                noticeFrgIsShow = false;
                break;
            case R.id.index_frg_gg_o:
                if (newFrgIsShow){
                    xx_o.setVisibility(View.VISIBLE);
                    gg_o.setVisibility(View.GONE);
                    ltq_o.setVisibility(View.GONE);
                }
                if (chatFrgIsShow){
                    xx_o.setVisibility(View.GONE);
                    gg_o.setVisibility(View.GONE);
                    ltq_o.setVisibility(View.VISIBLE);
                }
                if (mNoticeFrg == null) {
                    mNoticeFrg = NoticeFrg.getNoticeFrg();
                    transaction.add(R.id.index_frame_layout, mNoticeFrg);
                } else {
                    transaction.show(mNoticeFrg);
                }
                chatFrgIsShow = false;
                newFrgIsShow = false;
                noticeFrgIsShow = true;
                break;
            case R.id.index_frg_xx_o:
                if (noticeFrgIsShow){
                    xx_o.setVisibility(View.GONE);
                    gg_o.setVisibility(View.VISIBLE);
                    ltq_o.setVisibility(View.GONE);
                }
                if (chatFrgIsShow){
                    xx_o.setVisibility(View.GONE);
                    gg_o.setVisibility(View.GONE);
                    ltq_o.setVisibility(View.VISIBLE);
                }
                if (mNewsFrg == null) {
                    mNewsFrg = NewsFrg.getNewsFrg();
                    transaction.add(R.id.index_frame_layout, mNewsFrg);
                } else {
                    transaction.show(mNewsFrg);
                }
                chatFrgIsShow = false;
                newFrgIsShow = true;
                noticeFrgIsShow = false;
                break;
            default:
                break;
        }
        transaction.commit();
    }

    private void hide(FragmentTransaction transaction) {
        if (mNewsFrg != null) {
            transaction.hide(mNewsFrg);
        }
        if (mChatFrg != null) {
            transaction.hide(mChatFrg);
        }
        if (mNoticeFrg != null) {
            transaction.hide(mNoticeFrg);
        }
    }
}
