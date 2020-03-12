package com.example.linkedpath;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.time.Instant;

public class MainActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView=(TextView)findViewById(R.id.textView2);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Aerospace_eng.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this, "Aerospace", Toast.LENGTH_SHORT).show();
            }
        });

        textView=(TextView)findViewById(R.id.textView3);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Agriculture_eng.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this, "Agriculture", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
