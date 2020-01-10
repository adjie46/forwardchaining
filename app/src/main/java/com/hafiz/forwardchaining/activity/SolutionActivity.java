package com.hafiz.forwardchaining.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.hafiz.forwardchaining.R;


public class SolutionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solution);
        ImageView btnBack = findViewById(R.id.btnBack);
        btnBack.setOnClickListener(v -> onBackPressed());

    }

    public void rabunjauh(View view) {
        Intent rabunJauh = new Intent(this,webView.class);
        rabunJauh.putExtra("namafile","rabunjauh.html");
        startActivity(rabunJauh);

    }

    public void rabundekat(View view) {
        Intent rabunJauh = new Intent(this,webView.class);
        rabunJauh.putExtra("namafile","rabundekat.html");
        startActivity(rabunJauh);

    }

    public void katarak(View view) {
        Intent rabunJauh = new Intent(this,webView.class);
        rabunJauh.putExtra("namafile","katarak.html");
        startActivity(rabunJauh);

    }

}
