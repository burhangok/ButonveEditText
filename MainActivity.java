package com.example.lab08.ismek;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText username,password;
    TextView output;
    Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username=findViewById(R.id.kullaniciAdi);
        password =findViewById(R.id.kullaniciSifre);

        output=findViewById(R.id.sonuc);

        loginButton=findViewById(R.id.butonGiris);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username1 =username.getText().toString();
                String password1 =password.getText().toString();

                if(username1.equals("admin")==true) {
                    output.setText("HOŞGELDİNİZ");
                }
                else {
                    output.setText("BİLGİLERİNİZ HATALI");
                }
            }
        });



    }
}
