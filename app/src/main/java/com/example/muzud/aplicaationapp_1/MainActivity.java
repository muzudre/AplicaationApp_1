package com.example.muzud.aplicaationapp_1;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import android.widget.TextView;

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
        Intent intent = new Intent(this, Modules.class);
        startActivity(intent);
    }

    public void PRT(View view) {
        Intent intent = new Intent(this, Portal.class);
        startActivity(intent);
    }

    public void LCT(View view) {
        Intent intent = new Intent(this, MapsActivity.class);
        startActivity(intent);
    }

    public void CTC(View view) {
        Intent intent = new Intent(this, Contacts.class);
        startActivity(intent);
    }

    public void EXT(View view) {
        // код позволюши полности виыти из програми
        Intent homeIntent = new Intent(Intent.ACTION_MAIN);
        homeIntent.addCategory( Intent.CATEGORY_HOME );
        homeIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(homeIntent);
    }

    public void insta(View view) {
        Intent insta = new Intent(this, Instagram.class);
        startActivity(insta);
    }
    public void face(View view) {
        Intent insta = new Intent(this, Facebook.class);
        startActivity(insta);
    }
    public void twit(View view) {
        Intent insta = new Intent(this, Twitter.class);
        startActivity(insta);
    }
    public void linkin(View view) {
        Intent insta = new Intent(this, Linkedin.class);
        startActivity(insta);
    }
}
