package com.example.qayyu.firstcode;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    EditText et ;
    Button bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layoutpp);

        et = (EditText) findViewById(R.id.et1);
        bt = (Button) findViewById(R.id.button);
        bt.setOnClickListener(this);

        et = (EditText) findViewById(R.id.et2);
        bt = (Button) findViewById(R.id.button);
        bt.setOnClickListener(this);

        et = (EditText) findViewById(R.id.et3);
        bt = (Button) findViewById(R.id.button);
        bt.setOnClickListener(this);

        et = (EditText) findViewById(R.id.et4);
        bt = (Button) findViewById(R.id.button);
        bt.setOnClickListener(this);

        et = (EditText) findViewById(R.id.et5);
        bt = (Button) findViewById(R.id.button);
        bt.setOnClickListener(this);

        et = (EditText) findViewById(R.id.et6);
        bt = (Button) findViewById(R.id.button);
        bt.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(getApplicationContext(),et.getText().toString(),Toast.LENGTH_LONG).show();
    }
}
