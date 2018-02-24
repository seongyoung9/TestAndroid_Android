package com.seongyoung9.testandroid;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/*
        작성일 : 2018년 2월 24일
        작성자 : 박성영
        제작 의도 : 별찍기

        기본
        *
        **
        ***
        ****
        *****


        역순
        *****
        ****
        ***
        **
        *

        우측 정방향
             *
            **
           ***
          ****
         *****

        우측 역순
        *****
         ****
          ***
           **
            *

*/

public class MakeStarActivity extends BaseActivity implements View.OnClickListener{

    private Button btnleftBottom;
    private Button btnleftTop;
    private Button btnrightBottom;
    private Button btnrightTop;
    private TextView txtresult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_make_star);
        bindView();
        setUpEvent();
        setValues();
    }

    @Override
    public void setUpEvent() {

        btnleftBottom.setOnClickListener(this);
        btnleftTop.setOnClickListener(this);
        btnrightBottom.setOnClickListener(this);
        btnrightTop.setOnClickListener(this);

    }

    @Override
    public void setValues() {

    }

    @Override
    public void bindView() {

        this.btnrightTop = (Button) findViewById(R.id.btn_rightTop);
        this.btnrightBottom = (Button) findViewById(R.id.btn_rightBottom);
        this.btnleftTop = (Button) findViewById(R.id.btn_leftTop);
        this.btnleftBottom = (Button) findViewById(R.id.btn_leftBottom);
        this.txtresult = (TextView) findViewById(R.id.txt_result);

    }

    @Override
    public void onClick(View v) {

        switch ( v.getId() ){
            case R.id.btn_leftBottom:
                printNomalStar();
                break;
            case R.id.btn_leftTop:
                printReverseStar();
                break;
            case R.id.btn_rightBottom:
                printNomalreStar();
                break;
            case R.id.btn_rightTop:
                printReversereStar();
                break;
        }
    }


    private void printNomalStar() {
        //기본형 별찍기
        String starStr = "";

        for (int i = 0; i <= 5; i++ ){

            for (int j = 0; j < i; j++){
                starStr = starStr + "*";
            }
            starStr = starStr + "\n";
        }

        txtresult.setText(starStr);
        txtresult.setGravity(Gravity.LEFT);
    }

    private void printNomalreStar() {
        printNomalStar();
        txtresult.setGravity(Gravity.RIGHT);
    }
    private void printReverseStar() {
        //역순형 별찍기
        String starStr = "";

        for (int i = 5; i > 0; i-- ){

            for (int j = 0; j < i; j++){
                starStr = starStr + "*";
            }
            starStr = starStr + "\n";
        }

        txtresult.setText(starStr);
        txtresult.setGravity(Gravity.LEFT);
    }

    private void printReversereStar() {
        printReverseStar();
        txtresult.setGravity(Gravity.RIGHT);
    }

}
