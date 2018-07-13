package com.sandipbhattacharya.changeimageonbuttonpress;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageView cats; //ImageView object reference
    Button button; // Button object reference

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cats = findViewById(R.id.cats); // object instantiation
        button = findViewById(R.id.button); // object instantiation
        // 1. Set onClickListener on button
        // 2. Create annonymous inner class
        // 3. Define your logic inside the onClick method (which takes a View parameter evenif we don't need it)
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cats.setImageResource(R.drawable.cat2); // Change the Image
                Toast.makeText(MainActivity.this,"Image Changed!",Toast.LENGTH_SHORT).show(); // Show Toast message
            }
        });
    }
}
