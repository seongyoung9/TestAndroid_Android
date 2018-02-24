package com.seongyoung9.testandroid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/*
        작성일 : 2018년 2월 24일
        작성자 : 박성영
        제작 의도 : 알고리즘 테스트 문제로 넘어가는 엑티비티
*/
public class AlgorismListActivity extends BaseActivity implements View.OnClickListener{

    private Button btnmultiple;
    private Button btnstar;
    private Button btngugudan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_algorism_list);
        bindView();
        setUpEvent();
        setValues();
    }

    @Override
    public void setUpEvent() {

        btnmultiple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent( mContext , FindMultipleActivity.class);
                startActivity( i );
            }
        });

        btnstar.setOnClickListener( this );
        btngugudan.setOnClickListener( this );
    }

    @Override
    public void setValues() {

    }

    @Override
    public void bindView() {

        this.btngugudan  = (Button) findViewById(R.id.btn_gugudan);
        this.btnstar     = (Button) findViewById(R.id.btn_star);
        this.btnmultiple = (Button) findViewById(R.id.btn_multiple);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.btn_star:  // click star button

                Intent i = new Intent( mContext, MakeStarActivity.class);
                startActivity( i );

                break;
            case R.id.btn_gugudan:  // click gugudan button

                Toast.makeText(mContext,"구구단버튼 클릭",Toast.LENGTH_SHORT).show();

                break;
        }
    }


}
