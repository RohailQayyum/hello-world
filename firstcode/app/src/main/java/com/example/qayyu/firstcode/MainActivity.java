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

        et = (EditText) findViewById(R.id.First_Name_layoutpp);
        et = (EditText) findViewById(R.id.Last_Name_layoutpp);
        et = (EditText) findViewById(R.id.Father_Name_layoutpp);
        et = (EditText) findViewById(R.id.Enter_Email_layoutpp);
        et = (EditText) findViewById(R.id.Enter_Password_layoutpp);
        et = (EditText) findViewById(R.id.Enter_Cell_Number_layoutpp);
        bt = (Button) findViewById(R.id.button_layoutpp);
        bt.setOnClickListener(this);


}

    @Override
    public void onClick(View v) {
        Toast.makeText(getApplicationContext(),et.getText().toString(),Toast.LENGTH_LONG).show();
    }
}
