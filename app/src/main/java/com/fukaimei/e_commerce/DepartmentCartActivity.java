package com.fukaimei.e_commerce;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.View.OnClickListener;

public class DepartmentCartActivity extends AppCompatActivity {
    private final static String TAG = "DepartmentCartActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_department_cart);
        Toolbar tl_head = (Toolbar) findViewById(R.id.tl_head);
        setSupportActionBar(tl_head);
        tl_head.setNavigationOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

}
