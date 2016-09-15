package com.realmilk.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.realmilk.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public static final String EXTRA_NAME = "app_name";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FloatingActionButton reg = (FloatingActionButton)findViewById(R.id.reg);

        reg.setOnClickListener(this);

        Intent intent = getIntent();
        final String cheeseName = intent.getStringExtra(EXTRA_NAME);

        CollapsingToolbarLayout collapsingToolbar =
                (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar);
        collapsingToolbar.setTitle("RealMilk Login");
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.reg:
                Intent registration = new Intent(this, RegistrationActivity.class);
                startActivity(registration);
        }
    }
}
