package com.example.c5implementingcoordinatorlayout;

import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnsnackbar;
    CoordinatorLayout coordinator_layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnsnackbar = (Button)findViewById(R.id.btnsnackbar);
        coordinator_layout = (CoordinatorLayout) findViewById(R.id.coordinator_layout);

        btnsnackbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(coordinator_layout,"This is my snackbar",Snackbar.LENGTH_LONG).show();
            }
        });


    }
}
