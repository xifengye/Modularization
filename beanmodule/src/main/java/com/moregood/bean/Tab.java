package com.moregood.bean;

import android.support.v4.app.Fragment;

/**
 * Created by Administrator on 2016/9/13.
 */
public class Tab {
    private String tag;
    private String text;
    private int icon;
    private Class mFragment;

    public Tab(int icon, String tag, String text, Class mFragment) {
        this.icon = icon;
        this.tag = tag;
        this.text = text;
        this.mFragment = mFragment;
    }

    public int getIcon() {
        return this.icon;
    }

    public String getTag() {
        return this.tag;
    }

    public String getText() {
        return text;
    }

    public Class getmFragment() {
        return this.mFragment;
    }
}
