package com.sequoia.jbs.activity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.blankj.utilcode.util.SPUtils;
import com.jaeger.library.StatusBarUtil;
import com.lzy.okgo.model.HttpParams;
import com.sequoia.jbs.R;
import com.sequoia.jbs.base.BaseAty;
import com.sequoia.jbs.bean.LoginBean;
import com.sequoia.jbs.presenter.LoginPresenter;
import com.sequoia.jbs.utils.UserCount;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * @author Administrator.
 * @date 2018/5/25.
 * @funtion
 */
public class LoginAty extends BaseAty {

    private static final String TAG = "LoginAty";
    @BindView(R.id.login_phone)
    EditText login_phone;
    @BindView(R.id.login_password)
    EditText login_password;
    @BindView(R.id.login_btn)
    Button login_btn;
    String phone,password;
    LoginPresenter loginPresenter;
    private static final int SUCCESS_CODE = 0;
    @Override
    public void initView(Bundle savedInstanceState) {
        setContentView(R.layout.aty_login);
        ButterKnife.bind(this);
        StatusBarUtil.setTranslucent(this);
        loginPresenter = new LoginPresenter(this);

    }



    @OnClick(R.id.login_btn)
    public void onClick(View v) {
      switch (v.getId()){
          case R.id.login_btn:
              phone = login_phone.getText().toString().trim();
              password = login_password.getText().toString().trim();
              if (!TextUtils.isEmpty(phone)&&!TextUtils.isEmpty(password)){
                  HttpParams login = new HttpParams();
                  login.put("username",phone);
                  login.put("password",password);
                  loginPresenter.internetRequest(login);
                  Log.d("------>",phone+"----->"+password);
              }
              break;
          default:
              break;
      }
    }

    @Override
    public void upData(Object s) {
        LoginBean bean = (LoginBean) s;
        if (bean.getState() == SUCCESS_CODE){
            SPUtils.getInstance().put(UserCount.ID,bean.getData());
            Intent main = new Intent(LoginAty.this,MainAty.class);
            startActivity(main);
            finish();
        }
    }
}
