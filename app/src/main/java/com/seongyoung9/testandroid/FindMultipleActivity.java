package com.seongyoung9.testandroid;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

/*
        작성일 : 2018년 2월 24일
        작성자 : 박성영
        제작 의도 : 입력한 두수의 최소 공배수를 찾아 결과로 출력

        3   ,   5
        3의 배수 : 3 , 6 , 9 , 12 , 15  ...
        5의 배수 : 5 , 10 , 15 , 20  ...

        3과 5의 공배수 : 15 , 30 , 45 , 60 ...
        최소 공배수 : 15
*/

public class FindMultipleActivity extends BaseActivity {

    private EditText edtfirstNum;
    private EditText edtsecondNum;
    private Button btnfindMultiple;
    private TextView txtresult;
    private LinearLayout layoutresult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_multiple);
        bindView();
        setUpEvent();
        setValues();

    }

    @Override
    public void setUpEvent() {

        btnfindMultiple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int firstNum  = 0;

                try {
                    firstNum = Integer.parseInt(edtfirstNum.getText().toString());
                }
                catch ( Exception e ){
                    e.printStackTrace();
                    Toast.makeText(mContext, "입력문제", Toast.LENGTH_SHORT).show();
                    return;
                }
                int secondNum = 0;

                try {
                    secondNum = Integer.parseInt(edtsecondNum.getText().toString());
                }
                catch ( Exception e ){
                    e.printStackTrace();
                    Toast.makeText(mContext, "입력문제", Toast.LENGTH_SHORT).show();
                    return;
                }

                /*1 ~ 숫자 증가. 1 % 3 && 1 % 5 => 둘다 0이라면 두 숫자의 공배수.*/
                int result = 0;    // 최소공배수 저장

                for (int i = 1; i <= firstNum * secondNum; i++) {

                    if (i % firstNum == 0 && i % secondNum == 0) {
                        result = i;
                        break;
                    }
                }

                String resultStr = String.format("%d 입니다.", result);  // 이렇게 사용하는게 좋음
                txtresult.setText(resultStr);

                layoutresult.setVisibility(View.VISIBLE);
            }
        });

    }

    @Override
    public void setValues() {

    }

    @Override
    public void bindView() {

        this.layoutresult    = (LinearLayout) findViewById(R.id.layout_result);
        this.txtresult       = (TextView)     findViewById(R.id.txt_result);
        this.btnfindMultiple = (Button)       findViewById(R.id.btn_findMultiple);
        this.edtsecondNum    = (EditText)     findViewById(R.id.edt_secondNum);
        this.edtfirstNum     = (EditText)     findViewById(R.id.edt_firstNum);

    }
}
