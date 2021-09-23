package com.example.laboratorio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class nuevaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nueva);
        Button changeActivity1BTN = findViewById(R.id.button2);
        Intent intent =getIntent();
        String txt =intent.getStringExtra("Nombre");
        TextView text = findViewById(R.id.texto2);
        text.setText(txt);

        changeActivity1BTN.setOnClickListener(view -> changeActivity());
    }
    private void changeActivity(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}