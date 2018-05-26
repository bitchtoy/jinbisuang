package com.sequoia.jbs.bean;

/**
 * @author Administrator.
 * @date 2018/5/25.
 * @funtion
 */
public class LoginBean {


    /**
     * messgae : 成功
     * state : 0
     * data : 1
     */

    private String messgae;
    private int state;
    private String data;

    public String getMessgae() {
        return messgae;
    }

    public void setMessgae(String messgae) {
        this.messgae = messgae;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
