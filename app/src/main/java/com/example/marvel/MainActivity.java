package com.example.marvel;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    Button buttonEnviar;
    EditText senha, email;
    TextView textView;
    Activity activity = this;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textBemVindo);
        buttonEnviar = findViewById(R.id.enviar);
        senha = findViewById(R.id.senha);
        email = findViewById(R.id.email);
        buttonEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textoNome = senha.getText().toString();
                String textoEmail = email.getText().toString();

                if (textoNome.isEmpty() || textoEmail.isEmpty()) {
                    Toast.makeText(activity, "Por favor preencha todos os campos!", Toast.LENGTH_LONG).show();
                } else {
                    Intent intent = new Intent(getApplicationContext(), HomeActivity.class);
                    startActivity(intent);

                }
            }
        });
    }
}