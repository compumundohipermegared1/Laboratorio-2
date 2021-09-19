package com.example.laboratorio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button changeActivity2BTN = findViewById(R.id.button1);

        changeActivity2BTN.setOnClickListener(new View.OnClickListener(){
            @Override
                    public  void onClick(View v){
                changeActivity();
            }
        });
    }
    private void changeActivity(){
        Intent intent = new Intent(this, nuevaActivity.class);
        startActivity(intent);
    }
}