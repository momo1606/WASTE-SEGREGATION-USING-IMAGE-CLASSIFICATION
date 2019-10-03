package com.example.wastesegregation;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Notification;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class WasteResult extends AppCompatActivity {

   // public ImageView showImage;
    TextView textView;
    private Notification.Action.Builder data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_waste_result);

        textView = (TextView)findViewById(R.id.textView) ;
      //  showImage = (ImageView)findViewById(R.id.showImage);


        Intent intent = getIntent();
        Bitmap bitmap = (Bitmap) intent.getParcelableExtra("BitmapImage");
        textView.setText("madar clothes");
        //showImage.setImageBitmap(bitmap);
    }
}
