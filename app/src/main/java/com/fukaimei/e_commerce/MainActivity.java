package com.fukaimei.e_commerce;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity implements OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_swipe_refresh).setOnClickListener(this);
        findViewById(R.id.btn_swipe_recycler).setOnClickListener(this);
        findViewById(R.id.btn_department_store).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn_swipe_refresh) {
            Intent intent = new Intent(this, SwipeRefreshActivity.class);
            startActivity(intent);
        } else if (v.getId() == R.id.btn_swipe_recycler) {
            Intent intent = new Intent(this, SwipeRecyclerActivity.class);
            startActivity(intent);
        } else if (v.getId() == R.id.btn_department_store) {
            Intent intent = new Intent(this, DepartmentStoreActivity.class);
            startActivity(intent);
        }
    }

}
