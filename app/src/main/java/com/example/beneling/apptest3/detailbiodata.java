package com.example.beneling.apptest3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class detailbiodata extends AppCompatActivity {
    TextView textViewTitle;
    TextView textViewShortDesc;
    ImageView imageView1;
    TextView biodatanya;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailbiodata);

        imageView1 = (ImageView)  findViewById(R.id.imageView1);
        textViewTitle = (TextView) findViewById(R.id.textViewTitle);
        textViewShortDesc = (TextView) findViewById(R.id.textViewShortDesc);
        biodatanya = (TextView) findViewById(R.id.biodatanya);



        if(getIntent().getExtras()!=null) {
            Bundle bundle = getIntent().getExtras();
            imageView1.setImageResource(bundle.getInt("image"));
            textViewTitle.setText(bundle.getString("title"));
            textViewShortDesc.setText(bundle.getString("shortdesc"));
            biodatanya.setText(bundle.getInt("biodatanya"));

        }else {
            textViewTitle.setText(getIntent().getStringExtra("title"));
            textViewShortDesc.setText(getIntent().getStringExtra("Shortdesc"));

        }
    }
}
