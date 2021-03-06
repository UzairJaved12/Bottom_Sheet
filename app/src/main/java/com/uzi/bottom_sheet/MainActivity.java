package com.uzi.bottom_sheet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.bottomsheet.BottomSheetBehavior;

public class MainActivity extends AppCompatActivity {

    Button btn_expand , btn_collapse, option1;
    View nestedScor;
    BottomSheetBehavior bottomSheetBehavior;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nestedScor = findViewById(R.id.nestedScor);
        bottomSheetBehavior =BottomSheetBehavior.from(nestedScor);

        btn_expand = findViewById(R.id.btn_expand);
        btn_collapse = findViewById(R.id.btn_collapse);
        option1 = findViewById(R.id.btn_option);

        btn_expand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bottomSheetBehavior.setState(BottomSheetBehavior.STATE_EXPANDED);

            }
        });
        btn_collapse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bottomSheetBehavior.setState(BottomSheetBehavior.STATE_COLLAPSED);


            }
        });

        option1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,History.class);
                startActivity(intent);
            }
        });

    }
}