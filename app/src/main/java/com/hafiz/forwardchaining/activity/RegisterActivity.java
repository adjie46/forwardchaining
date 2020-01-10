package com.hafiz.forwardchaining.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.hafiz.forwardchaining.R;

public class RegisterActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText et_name_regigster;
    private Button btnSave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        initView();
        initIntitialize();
    }

    private void initIntitialize() {
        btnSave.setOnClickListener(this);
    }

    private void initView() {
        et_name_regigster = findViewById(R.id.et_name_regigster);
        btnSave = findViewById(R.id.btn_save);


    }

    private boolean validation(String name){
        if (!name.isEmpty()){
            Intent mainMenu = new Intent(this,MainMenu.class);
            mainMenu.putExtra("name",name);
            mainMenu.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(mainMenu);
            this.finish();
        }else{
            Toast.makeText(this,"Nama Tidak Boleh Kosong",Toast.LENGTH_SHORT).show();
        }
        return false;
    }

    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.btn_save){
            validation(et_name_regigster.getText().toString());
        }
    }
}
