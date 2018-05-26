package com.sequoia.jbs.model;

import android.graphics.ColorSpace;

/**
 * @author Administrator.
 * @date 2018/5/26.
 * @funtion
 */
public class IndexModel implements Model{
    private Object d;
    @Override
    public void setModel(Object d) {
        this.d = d;
    }

    @Override
    public Object getModel() {
        return null;
    }
}
