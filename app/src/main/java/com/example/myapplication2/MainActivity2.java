package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView re;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        re=(TextView) findViewById(R.id.re);
        findViewById(R.id.btn0).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                re.setText(re.getText().toString() +"0");
            }
        });

        findViewById(R.id.btn1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                re.setText(re.getText().toString() +"1");
            }
        });

        findViewById(R.id.btn2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                re.setText(re.getText().toString() +"2");
            }
        });

        findViewById(R.id.btn3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                re.setText(re.getText().toString() +"3");
            }
        });

        findViewById(R.id.btn4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                re.setText(re.getText().toString() +"4");
            }
        });

        findViewById(R.id.btn5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                re.setText(re.getText().toString() +"5");
            }
        });

        findViewById(R.id.btn6).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                re.setText(re.getText().toString() +"6");
            }
        });

        findViewById(R.id.btn7).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                re.setText(re.getText().toString() +"7");
            }
        });

        findViewById(R.id.btn8).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                re.setText(re.getText().toString() +"8");
            }
        });

        findViewById(R.id.btn9).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                re.setText(re.getText().toString() +"9");
            }
        });


        findViewById(R.id.btnsum).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                re.setText(re.getText().toString() +" + ");
            }
        });


        findViewById(R.id.btnsub).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                re.setText(re.getText().toString() +" - ");
            }
        });


        findViewById(R.id.btnmod).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                re.setText(" ");
            }
        });


        findViewById(R.id.btndiv).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                re.setText(re.getText().toString() +" / ");
            }
        });


        findViewById(R.id.btnmui).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                re.setText(re.getText().toString() +" * ");
            }
        });
        findViewById(R.id.btneql).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s =re.getText().toString();
                String [] num=s.split(" ");
                int r= Integer.parseInt(num[0]);
                int g=0;
                for(int i=1;i<num.length;i+=2)
                {
                    if(num[i].equals("+"))
                    {r+= Integer.parseInt(num[g+=2]);}
                    else if(num[i].equals("-"))
                    {r-= Integer.parseInt(num[g+=2]);}
                    else if(num[i].equals("*"))
                    {r*= Integer.parseInt(num[g+=2]);}
                    else if(num[i].equals("/"))
                    {r/= Integer.parseInt(num[g+=2]);}
                }
                re.setText(" "+ r);
            }
        });
    }
}