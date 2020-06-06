package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.dummy.DummyContent;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {
    private int orientation;
    Button carta, list;
    @Override
    public void onConfigurationChanged(Configuration newConfig)
    {
        super.onConfigurationChanged(newConfig);

        orientation = newConfig.orientation;
        setBackgroundImage(newConfig.orientation);
    }

    private void setBackgroundImage(final int orientation)
    {
        LinearLayout layout;
        layout = (LinearLayout) findViewById(R.id.mainlayout );

        if (orientation == Configuration.ORIENTATION_LANDSCAPE)
            layout.setBackgroundResource(R.drawable.map_landscape);
        else if (orientation == Configuration.ORIENTATION_PORTRAIT)
            layout.setBackgroundResource(R.drawable.map);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        carta = (Button)findViewById(R.id.carta);
        carta.setOnClickListener(this);
        list = (Button)findViewById(R.id.list);
        list.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;
        switch (v.getId()){
            case R.id.carta:
                i = new Intent(this, Carta.class);
                startActivity(i);
                break;
                case R.id.list:
                i=new Intent(this, ItemListActivity.class);
                startActivity(i);
                break;
        }
    }
}
