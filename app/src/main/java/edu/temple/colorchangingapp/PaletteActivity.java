package edu.temple.colorchangingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;

public class PaletteActivity extends AppCompatActivity {
GridView gridView;
    final  String [] colors = {"RED","YELLOW","WHITE","GREEN","BLUE","GRAY","WHITE","BLACK","CYAN","GREEN","MAGENTA","RED"};
    public  static final String COLOR_KEY ="colorkey";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
          
        getSupportActionBar().setTitle(R.string.PaletteActivity);


        Resources res = getResources();
        final String[] gridLabels = res.getStringArray(R.array.MyArray);

        gridView = findViewById(R.id.gridView);
        gridView.setNumColumns(3);
        BaseAdapter adapter = new ColorAdapter(this,gridLabels);

        gridView.setAdapter(adapter);


        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                //startActivity(new Intent(PaletteActivity.this, CanvasActivity.class).putExtra(COLOR_KEY, parent.getItemAtPosition(position).toString()));

                Intent intent = new Intent(PaletteActivity.this,CanvasActivity.class);
                intent.putExtra("colors",colors[position]);
                intent.putExtra("Mylabel",gridLabels[position]);
                startActivityForResult(intent,000);


            }
        });
    }
}