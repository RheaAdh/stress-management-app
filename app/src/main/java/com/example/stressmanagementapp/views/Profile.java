package com.example.stressmanagementapp.views;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.stressmanagementapp.R;
import com.example.stressmanagementapp.helpers.PatientDbAdapter;
import com.example.stressmanagementapp.models.PatientRecord;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import java.util.ArrayList;

public class Profile extends AppCompatActivity {
    FirebaseAuth mAuth;
    PatientDbAdapter patientDbAdapter;
    ArrayList<PatientRecord>arrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile);


//        arrayList=patientDbAdapter.getPatientRecords();
        //show array list in row form on profile page


        String name= "Rhea";
        TextView err = (TextView) findViewById(R.id.textView);
        err.setText("Name : " + name);

        String email= "rheadhikari@gmail.com";
        TextView err1 = (TextView) findViewById(R.id.textView2);
        err1.setText("Email ID : "+email);

        String steps= "2000";
        TextView err2 = (TextView) findViewById(R.id.textView4);
        err2.setText("Steps : "+steps);

        String time= "12 minutes";
        TextView err3 = (TextView) findViewById(R.id.textView5);
        err3.setText("Time : "+time);

//        Bundle extras = getIntent().getExtras();
//        byte[] byteArray = extras.getByteArray("image");
//
//        Bitmap bmp = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
//        ImageView image = (ImageView) findViewById(R.id.imageView);
//
//        image.setImageBitmap(bmp);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    public void nextPage(){
        Intent intent = new Intent(Profile.this, Home.class);
        startActivity(intent);
        return;
    }
    public void logout(){
        Intent intent = new Intent(Profile.this, LoginActivity.class);
        startActivity(intent);
        return;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
// Handle item selection
        switch (item.getItemId()) {
            case R.id.list1:
                nextPage();
                return true;
            case R.id.signout1:
                logout();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

}