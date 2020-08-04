package com.example.qrcodescanner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static TextView tvresult;
    Button btn,bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt=findViewById(R.id.bt1);
        tvresult = (TextView) findViewById(R.id.tvresult);
        Button btn = (Button) findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ScanActivity.class);
                startActivity(intent);
            }
        });
bt.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        String num1 = tvresult.getText().toString();
        Intent intent = new Intent(MainActivity.this,ResultActivity.class);
        intent.putExtra("SUM",num1);
        startActivity(intent);
    }
});

    }
}