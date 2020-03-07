package com.ppgstore.copaamerica;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1=(Button)findViewById(R.id.btn1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity1();
            }
        });
        button2=(Button)findViewById(R.id.btn2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });
        button3=(Button)findViewById(R.id.btn3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity3();
            }
        });
        button6=(Button)findViewById(R.id.btn6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity6();
            }
        });
    }
    public void openActivity1(){
        Intent intent1= new Intent(this, Group.class);
        startActivity(intent1);
    }
    public void openActivity2(){
        Intent intent2= new Intent(this, fixture.class);
        startActivity(intent2);
    }

    public void openActivity3(){
        Intent intent3= new Intent(this, team.class);
        startActivity(intent3);
    }

    public void openActivity6(){
        Intent intent6= new Intent(this, about.class);
        startActivity(intent6);
    }

    public void liveopen(View view) {
        Intent browserIntent =new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/Copa-America-2019-2902720076437373/"));
        startActivity(browserIntent);
    }

    public void pointopen(View view) {
        Intent browserIntent1 =new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/Copa-America-2019-2902720076437373/"));
        startActivity(browserIntent1);
    }
}
