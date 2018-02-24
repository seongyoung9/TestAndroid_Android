package com.seongyoung9.testandroid;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Administrator on 2018-02-24.
 */

public abstract  class BaseActivity extends AppCompatActivity{

    public Context mContext = this;


    //버튼 등등 이벤트 처리
    public abstract void setUpEvent();
    //값 세팅
    public abstract void setValues();
    //findVIewById를 모아둔 메소드
    public abstract void bindView();
}
