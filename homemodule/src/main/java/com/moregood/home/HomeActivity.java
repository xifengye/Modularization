package com.moregood.home;

import android.os.Bundle;

import com.moregood.base.BaseTabActivity;
import com.moregood.bean.Tab;

public class HomeActivity extends BaseTabActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Tab tab1 = new Tab(R.drawable.ic_launcher_background, "home", "主页", TabHomeFragment.class);
        initTab(tab1);
    }
}
