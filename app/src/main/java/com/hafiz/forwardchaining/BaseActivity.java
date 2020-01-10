package com.hafiz.forwardchaining;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.hafiz.forwardchaining.activity.RegisterActivity;

public class BaseActivity extends AppCompatActivity {
    private ProgressDialog dialog;
    private AlertDialog alertDialog;
    public void showLoading(String title, String message) {
        dialog = ProgressDialog.show(
                this,
                title,
                message,
                true);
        dialog.show();
    }

    public void hideLoading() {
        dialog.dismiss();
    }

    public void showMessage(String message) {
        AlertDialog alertDialog = new AlertDialog.Builder(this)
                .setIcon(android.R.drawable.ic_dialog_info)
                .setTitle("Pesan")
                .setMessage(message)
                .setCancelable(false)
                .setPositiveButton("Coba Lagi", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                }).show();
    }

    public void showMessage(Activity activity, String message) {
        alertDialog = new AlertDialog.Builder(this)
                .setIcon(android.R.drawable.ic_dialog_info)
                .setTitle("Pesan")
                .setMessage(message)
                .setCancelable(false)
                .setPositiveButton("Coba Lagi", (dialogInterface, i) -> {

                }).setNegativeButton("Keluar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent register = new Intent(BaseActivity.this,
                                RegisterActivity.class);
                        register.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                        activity.finish();
                        startActivity(register);
                    }
                })
                .show();
    }
    public void hideMessage(){
        alertDialog.dismiss();
    }

}
