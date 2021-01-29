package com.example.chapter7cartooncafe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class OrderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
    }

    public void onRadioButtonClicked(View view) {
        switch (view.getId()) {
            case R.id.sameday:
                Toast.makeText(this, "you selected same day delivery", Toast.LENGTH_SHORT).show();
                break;
            case R.id.nextday:
                Toast.makeText(this, "you selected next day delivery", Toast.LENGTH_SHORT).show();
                break;
            case R.id.pickup:
                Toast.makeText(this, "you selected Pickup", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}