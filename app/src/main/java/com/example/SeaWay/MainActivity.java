package com.example.SeaWay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.content.res.Configuration;

import com.example.myapplication.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private  int  orientation;
    Button start, exit, list;
    @Override
    public void onConfigurationChanged(Configuration newConfig)
    {
        super.onConfigurationChanged(newConfig);
        orientation = newConfig.orientation;
        setBackgroundImage(newConfig.orientation);
    }

    private void setBackgroundImage(final int orientation)
    {
        LinearLayout  layout;
        layout = (LinearLayout) findViewById(R.id.mainlayout );

        if (orientation == Configuration.ORIENTATION_LANDSCAPE)
            layout.setBackgroundResource(R.drawable.carta_landscape);
        else if (orientation == Configuration.ORIENTATION_PORTRAIT)
            layout.setBackgroundResource(R.drawable.carta);
    }

    @Override
    public void onResume()
    {
        super.onResume();
        setBackgroundImage(orientation);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        start = (Button)findViewById(R.id.start);
        start.setOnClickListener(this);
        exit=(Button) findViewById(R.id.exit);
        exit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                startActivityForResult(intent, 1);
                finish();
            }
        });
    }

    @Override
    public void onClick(View v) {
        Intent i;
        i = new Intent(this, Main2Activity.class);
        startActivity(i);
    }
}
