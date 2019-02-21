package com.example.createlabs;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView tv_Show;
    private Button btn_OK;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_Show = (TextView) findViewById(R.id.tv_Show);
        btn_OK = (Button) findViewById(R.id.btn_OK);

        btn_OK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickButtonOK();
            }
        });

    }

    private void clickButtonOK() {
        tv_Show.setText("Click Button");
        int duration = Toast.LENGTH_SHORT;
        Context context = getApplicationContext();
        Toast toast = Toast.makeText(context, "click", duration);
        toast.show();

        Intent intent = new Intent(MainActivity.this,Page2Activity.class);
        startActivity(intent);
    }


}
