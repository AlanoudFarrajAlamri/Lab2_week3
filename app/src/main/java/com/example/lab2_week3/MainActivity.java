package com.example.lab2_week3;

/*alanoud alamri*/

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
public class MainActivity extends AppCompatActivity {
    Button send_button;
    EditText send_text;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        send_button= findViewById(R.id.send_button_id);
        send_text = findViewById(R.id.send_text_id);


        send_button.setOnClickListener(v -> {
            String str = send_text.getText().toString();

            Intent intent = new Intent(getApplicationContext(), SecoundActivity.class);
            intent.putExtra("message_key",str);
            startActivity(intent);


        });




    }

}