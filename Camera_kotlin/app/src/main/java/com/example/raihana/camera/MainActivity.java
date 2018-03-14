package com.example.raihana.camera;

import android.app.Activity;
import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Button btn;
    private static final int CAMERA_REQUEST=123;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=(Button)findViewById(R.id.idbtn);
        imageView=(ImageView) imageView.findViewById(R.id.imageView);
    }

    public void btnClick(View v){
        Intent intent =new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(intent, CAMERA_REQUEST);
    }

    public void onActivityResult(int requestCode, int resultCode, Intent data){
        if (requestCode == CAMERA_REQUEST && requestCode == Activity.RESULT_OK)
        {

            Bitmap photo =(Bitmap)data.getExtras().get("data");
            imageView.setImageBitmap(photo);

          }
        }
    }

