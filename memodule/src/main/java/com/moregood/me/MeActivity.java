package com.moregood.me;

import android.os.Bundle;

import com.moregood.base.BaseTabActivity;
import com.moregood.bean.Tab;

public class MeActivity extends BaseTabActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_me);
        Tab tab2 = new Tab(R.drawable.ic_launcher_background, "person", "我", TabMeFragment.class);
        initTab(tab2);
    }
}
