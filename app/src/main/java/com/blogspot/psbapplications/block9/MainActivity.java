package com.blogspot.psbapplications.block9;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void sendMessage(View view) {
        EditText editText = findViewById(R.id.editText);
        String message = editText.getText().toString();

        Intent sendSMS = new Intent(Intent.ACTION_SENDTO, Uri.parse("smsto:9090909090"));
        sendSMS.putExtra("sms_body", message);
        startActivity(sendSMS);
    }
}