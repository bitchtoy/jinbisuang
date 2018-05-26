package com.sequoia.jbs.model;

/**
 * @author Administrator.
 * @date 2018/5/24.
 * @funtion
 */
public class LoginModel implements Model {
    private Object d;
    @Override
    public void setModel(Object d) {
        this.d = d;
    }

    @Override
    public Object getModel() {
        return d;
    }
}
