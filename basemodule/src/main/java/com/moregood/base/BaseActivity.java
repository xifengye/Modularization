package com.moregood.base;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by yexifeng on 2018/4/22.
 */

public class BaseActivity extends AppCompatActivity{
    @Override
    public void onCreate(Bundle data) {
        super.onCreate(data);
        AppManager.getAppManager().addActivity(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        AppManager.getAppManager().finishActivity(this);
    }
}
