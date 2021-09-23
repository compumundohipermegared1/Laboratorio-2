package com.example.laboratorio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button changeActivity2BTN = findViewById(R.id.button1);
        EditText texto = findViewById(R.id.texto);


        changeActivity2BTN.setOnClickListener(v -> {
    if(TextUtils.isEmpty(texto.getText().toString())){
        Toast.makeText(MainActivity.this,"Ingresa un nombre",Toast.LENGTH_SHORT).show();
    }else{
        changeActivity();
    }
});
    }
    private void changeActivity(){
        EditText texto = findViewById(R.id.texto);
        Intent intent = new Intent(this, nuevaActivity.class);
        intent.putExtra("Nombre",texto.getText().toString());
        startActivity(intent);
    }
}