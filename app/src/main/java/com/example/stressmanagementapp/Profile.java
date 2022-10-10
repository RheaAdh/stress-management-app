package com.example.stressmanagementapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile);

        String name= getIntent().getStringExtra("name");
        TextView err = (TextView) findViewById(R.id.textView);
        err.setText("Name : " + name);

        String email= getIntent().getStringExtra("email");
        TextView err1 = (TextView) findViewById(R.id.textView2);
        err1.setText("Email ID : "+email);

        String steps= getIntent().getStringExtra("steps");
        TextView err2 = (TextView) findViewById(R.id.textView4);
        err2.setText("Steps : "+steps);

        String time= getIntent().getStringExtra("time");
        TextView err3 = (TextView) findViewById(R.id.textView5);
        err3.setText("Time : "+time);

        Bundle extras = getIntent().getExtras();
        byte[] byteArray = extras.getByteArray("image");

        Bitmap bmp = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
        ImageView image = (ImageView) findViewById(R.id.imageView);

        image.setImageBitmap(bmp);
    }
}