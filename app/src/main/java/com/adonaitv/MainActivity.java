package com.adonaitv;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;

import com.adonaitv.Aboutus.Ui.About;
import com.adonaitv.Contactus.UI.ContactUs;
import com.adonaitv.Gallery.UI.Gallery;
import com.adonaitv.PrayerReq.UI.PrayerReq;
import com.adonaitv.watchlivetv.UI.Watchlivetv;

public class MainActivity extends AppCompatActivity {
    ImageButton watch,about,prayer,gallery;
    Button contactus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        watch=findViewById(R.id.tv);
        about=findViewById(R.id.about);
        prayer=findViewById(R.id.prayer);
        gallery=findViewById(R.id.gallery);
        contactus=findViewById(R.id.contactus);
        //initialize variables

        watch.setOnClickListener(v->{
            Intent intent=new Intent(this, Watchlivetv.class);
            startActivity(intent);
        });
        //onClick on Watch tv

        about.setOnClickListener(v->{
            Intent intent=new Intent(this, About.class);
            startActivity(intent);
        });
        //onClick on About us

        prayer.setOnClickListener(v->{
            Intent intent=new Intent(this, PrayerReq.class);
            startActivity(intent);
        });
        //onClick on Prayer Request

        gallery.setOnClickListener(v->{
            Intent intent=new Intent(this, Gallery.class);
            startActivity(intent);
        });
        //onClick on Gallery

        contactus.setOnClickListener(v->{
            Intent intent=new Intent(this, ContactUs.class);
            startActivity(intent);
        });
        //onClick on Contact us
    }
}