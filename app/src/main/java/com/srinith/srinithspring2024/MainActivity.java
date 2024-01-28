package com.srinith.srinithspring2024;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView helloTextView = findViewById(R.id.helloTextView);
        ImageView myImageView = findViewById(R.id.imageView);
        Button myButton = findViewById(R.id.myButton);
        myImageView.setVisibility(View.INVISIBLE);

        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                helloTextView.setText("Welcome to Mobile Computing");
                myImageView.setVisibility(View.VISIBLE);
                Toast.makeText(MainActivity.this, "Loading Mobile Computing Course", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
