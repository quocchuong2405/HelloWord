package com.example.admin.helloword;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
     EditText a,b;
     TextView KQ,kqua;
    Button Tinh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        a=(EditText)findViewById(R.id.doca);
        b=(EditText)findViewById(R.id.docb);
        KQ=(TextView)findViewById(R.id.KQ);
        kqua=(TextView)findViewById(R.id.kqua);
        Tinh=(Button)findViewById(R.id.tinh);
        Tinh.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (a.getText().toString().length() == 0) {
                    kqua.setText("Nhap a");
                } else if (b.getText().toString().length() == 0) {
                    kqua.setText("Nhap b");
                } else{
                int nhapa = Integer.parseInt(a.getText().toString());
                int nhapb = Integer.parseInt(b.getText().toString());
                kqua.setText((nhapa * nhapb) + "");
                }
            }
        });

    }


}
