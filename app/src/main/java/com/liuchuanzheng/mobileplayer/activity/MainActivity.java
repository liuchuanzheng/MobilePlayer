package com.liuchuanzheng.mobileplayer.activity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.RadioGroup;

import com.liuchuanzheng.mobileplayer.R;

public class MainActivity extends Activity {

    private RadioGroup  rg_bottom_tag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rg_bottom_tag = (RadioGroup) findViewById(R.id.rg_bottom_tag);
        rg_bottom_tag.check(R.id.rb_video);//默认选中首页
    }
}
