package com.dragdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    DragView iv_drag;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iv_drag= (DragView) findViewById(R.id.iv_drag);
        iv_drag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!iv_drag.isDrag()){
                    Toast.makeText(MainActivity.this, "响应点击", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}
