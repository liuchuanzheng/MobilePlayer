package com.liuchuanzheng.mobileplayer.pager;

import android.content.Context;
import android.view.View;
import android.widget.TextView;

import com.liuchuanzheng.mobileplayer.base.BasePager;

public class AudioPager extends BasePager{
    TextView textView;
    public AudioPager(Context context) {
        super(context);
    }

    @Override
    public View initView() {
        textView = new TextView(context);
        return textView;
    }

    @Override
    public void initData() {
        super.initData();
        textView.setText("AudioPager");
    }
}