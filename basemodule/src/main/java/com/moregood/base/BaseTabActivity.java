package com.moregood.base;

import android.support.v4.app.FragmentTabHost;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TabHost;
import android.widget.TextView;

import com.moregood.basemodule.R;
import com.moregood.bean.Tab;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yexifeng on 2018/4/22.
 */

public abstract class BaseTabActivity extends BaseActivity {
    private FragmentTabHost mTabHost;

    private List<Tab> list = new ArrayList<>();

    protected void initTab(Tab... tabs) {
        for(Tab tab:tabs) {
            list.add(tab);
        }
        mTabHost = (FragmentTabHost) findViewById(android.R.id.tabhost);
        mTabHost.setup(this, getSupportFragmentManager(), R.id.realtabcontent);

        for (Tab tab : list) {
            TabHost.TabSpec tabSpec = mTabHost.newTabSpec(tab.getTag());
            tabSpec.setIndicator(buildView(tab));
            mTabHost.addTab(tabSpec, tab.getmFragment(), null);
        }
        mTabHost.getTabWidget().setShowDividers(LinearLayout.SHOW_DIVIDER_NONE);
        if(list!=null && list.size()>0){
            mTabHost.setCurrentTabByTag(list.get(0).getTag());
        }
    }

    private View buildView(Tab tab) {
        View view = LayoutInflater.from(this).inflate(R.layout.tab_indicator, null);
        ImageView tabImg = (ImageView) view.findViewById(R.id.tab_img);
        TextView text = (TextView) view.findViewById(R.id.tab_text);
        tabImg.setImageResource(tab.getIcon());
        text.setText(tab.getText());
        return view;
    }
}
