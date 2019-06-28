package com.moregood.modularization;

import android.os.Bundle;

import com.moregood.base.BaseTabActivity;
import com.moregood.bean.Tab;
import com.moregood.home.TabHomeFragment;
import com.moregood.me.TabMeFragment;

import java.lang.reflect.Proxy;

public class MainActivity extends BaseTabActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Tab tab1 = new Tab(R.drawable.tab_home_selector, "home", "主页", TabHomeFragment.class);
        Tab tab2 = new Tab(R.drawable.tab_me_selector, "person", "我", TabMeFragment.class);
        initTab(tab1,tab2);

    }
}
