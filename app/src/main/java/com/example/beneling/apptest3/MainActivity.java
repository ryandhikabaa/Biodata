package com.example.beneling.apptest3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button_signin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText etusername = (EditText) findViewById(R.id.editText);
        final EditText etpassword = (EditText) findViewById(R.id.editText2);
        final Button button_signin = (Button) findViewById(R.id.signin);

        button_signin.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String nama = etusername.getText().toString();
                String pass = etpassword.getText().toString();
                if (nama.equals("admin") && pass.equals("admin")) {
                    Intent daftar = new Intent(MainActivity.this, home.class);
                    MainActivity.this.startActivity(daftar);
                } else {
                    Toast.makeText(MainActivity.this, "Ussername atau Password Salah", Toast.LENGTH_SHORT).show();
                }
            }
//        @Override
//        public void onClick(View view) {
//            Toast.makeText(MainActivity.this,"Ussername dan Password Salah",Toast.LENGTH_SHORT).show();

        });
    }
}
