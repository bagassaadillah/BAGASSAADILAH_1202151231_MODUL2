package com.example.bagas.bagass_1202151231;

import android.support.v7.app.AppCompatActivity;

/**
 * Created by bagas on 2/18/2018.
 */

public class MenuUtama extends AppCompatActivity {
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_utama);
        Toast.makeText(this, "Bagas Saadilah 120251231", Toast.LENGTH_SHORT).show();
    }

    public void onButtonClicked(View view) {

        RadioButton DineIn = (RadioButton) findViewById(R.id.dinein);
        RadioButton TakeAway = (RadioButton) findViewById(R.id.takeaway);

        if (DineIn.isChecked()) {
            dineIn();
        } else if (TakeAway.isChecked()) {
            takeAway();
        }

    }

    public void dineIn() {
        intent = new Intent(this, DineIn.class);
        startActivity(intent);
    }

    public void takeAway() {
        intent = new Intent(this, TakeAway.class);
        startActivity(intent);
    }
