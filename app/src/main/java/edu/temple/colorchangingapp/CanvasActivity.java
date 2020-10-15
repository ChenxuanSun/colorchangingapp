package edu.temple.colorchangingapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

public class CanvasActivity extends AppCompatActivity {
    @SuppressLint("ResourceType")


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canvas);

        getSupportActionBar().setTitle(R.string.CanvasActivity);

        Intent start = getIntent();
        String mycolor = start.getStringExtra("colors");
        String label = start.getStringExtra("Mylabel");







        String color = getIntent().getStringExtra(PaletteActivity.COLOR_KEY);
        ((TextView) findViewById(R.id.textView)).setText(label);

        findViewById(R.id.gridlayout).setBackgroundColor(Color.parseColor(mycolor.toLowerCase()));

    }
}