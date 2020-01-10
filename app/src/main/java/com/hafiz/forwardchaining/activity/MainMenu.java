package com.hafiz.forwardchaining.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.hafiz.forwardchaining.R;

public class MainMenu extends AppCompatActivity implements View.OnClickListener {

    private TextView tv_auth_subtitle;
    private Button btnSolusi,btnKonsultasi;
    private ImageView btnLogout;
    private String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        initView();
        initInitialize();
    }

    private void initInitialize() {
        Intent intent = getIntent();
        if (intent!=null){
            name =  intent.getStringExtra("name");
            tv_auth_subtitle.setText(String.format("Selamat Datang %s", name));
        }

        btnSolusi.setOnClickListener(this);
        btnKonsultasi.setOnClickListener(this);
        btnLogout.setOnClickListener(this);
    }

    private void initView() {
        tv_auth_subtitle = findViewById(R.id.tv_auth_subtitle);
        btnSolusi = findViewById(R.id.btnsolusi);
        btnKonsultasi = findViewById(R.id.btnConsult);
        btnLogout = findViewById(R.id.btnLogout);
    }

    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.btnsolusi){
            Intent mainMenu = new Intent(this,SolutionActivity.class);
            startActivity(mainMenu);
        }else if(v.getId()==R.id.btnConsult){
            Intent mainMenu = new Intent(this, ConsultActivity.class);
            mainMenu.putExtra("name",name);
            startActivity(mainMenu);
        }else if(v.getId()==R.id.btnLogout){
            Intent register = new Intent(this,RegisterActivity.class);
            register.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(register);
            finish();
        }
    }
}
