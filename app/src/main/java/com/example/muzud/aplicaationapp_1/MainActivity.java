package com.example.muzud.aplicaationapp_1;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void LTR(View view) {
        Intent intent = new Intent(this, Lectures.class);
        startActivity(intent);
    }

    public void TTB(View view) {
        Intent intent = new Intent(this, TimeTable.class);
        startActivity(intent);
    }

    public void MDL(View view) {
    }

    public void PRT(View view) {
    }

    public void LCT(View view) {
    }

    public void CTC(View view) {
    }

    public void EXT(View view) {
        // код позволюши полности виыти из програми
        Intent homeIntent = new Intent(Intent.ACTION_MAIN);
        homeIntent.addCategory( Intent.CATEGORY_HOME );
        homeIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(homeIntent);
    }

    public void insta(View view) {
        Intent insta = new Intent(this, Lectures.class);
        startActivity(insta);
    }
    public void face(View view) {
        Intent insta = new Intent(this, Lectures.class);
        startActivity(insta);
    }
    public void twit(View view) {
        Intent insta = new Intent(this, Lectures.class);
        startActivity(insta);
    }
    public void linkin(View view) {
        Intent insta = new Intent(this, Lectures.class);
        startActivity(insta);
    }
}
