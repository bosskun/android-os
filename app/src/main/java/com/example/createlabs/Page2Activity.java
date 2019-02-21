package com.example.createlabs;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Page2Activity extends AppCompatActivity {
    private Button btn_Back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);
        Log.d("OS_App", "Start Activity2");

        btn_Back = (Button) findViewById(R.id.btn_Back);

        btn_Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickButtonBack();
            }
        });
    }

    private void clickButtonBack() {

        Intent intent = new Intent(Page2Activity.this,MainActivity.class);
        startActivity(intent);
        finish();
        Log.d("OS_App", "Close Activity2");
    }
}
