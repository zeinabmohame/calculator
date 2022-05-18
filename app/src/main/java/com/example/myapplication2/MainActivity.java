package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button v;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        v=(Button) findViewById(R.id.send);
        act a =new act();
        v.setOnClickListener(a);
        v.setText("hello zeze");
        v.getText().toString();


    }

    class act implements View.OnClickListener{


        @Override
        public void onClick(View view) {
            Toast.makeText(MainActivity.this, "one action ", Toast.LENGTH_LONG).show();

        }
    }
}