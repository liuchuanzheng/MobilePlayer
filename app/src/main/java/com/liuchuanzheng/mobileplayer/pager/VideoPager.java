package com.liuchuanzheng.mobileplayer.pager;

import android.content.Context;
import android.view.View;
import android.widget.TextView;

import com.liuchuanzheng.mobileplayer.base.BasePager;

/**
 * 作者：杨光福 on 2016/7/16 11:48
 * 微信：yangguangfu520
 * QQ号：541433511
 * 作用：本地视频页面
 */
public class VideoPager extends BasePager{
    TextView textView;
    public VideoPager(Context context) {
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
        textView.setText("VideoPager");
    }
}