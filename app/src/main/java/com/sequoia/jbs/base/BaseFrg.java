package com.sequoia.jbs.base;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.sequoia.jbs.utils.netchangestate.InterNetObservable;
import com.sequoia.jbs.utils.netchangestate.InterNetObserver;
import com.sequoia.jbs.utils.netchangestate.NetWorkData;

import java.util.Observable;

/**
 * @author Administrator.
 * @date 2018/5/24.
 * @funtion
 */
public abstract class BaseFrg extends Fragment implements BaseView {
    public BaseAty mBaseAty;
    public FragmentManager mFragmentManager = null;
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
    protected abstract int setView();

    protected abstract void initView(View view, Bundle savedInstanceState );


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        mBaseAty = (BaseAty) context;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(setView(),container,false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mFragmentManager = mBaseAty.getSupportFragmentManager();
        initView(view,savedInstanceState);
    }


    @Override
    public void showDialog() {

    }

    @Override
    public void hideDialog() {

    }

    @Override
    public void toast(String msg) {
        Toast.makeText(getContext(),msg,Toast.LENGTH_SHORT).show();
    }
    @Override
    public void onResume() {
        super.onResume();
        InterNetObservable.getInterNetObservable().addObserver(observer);
    }
    @Override
    public void onStop() {
        super.onStop();
        InterNetObservable.getInterNetObservable().deleteObserver(observer);
    }
    protected void upInternet(){

    }
}
