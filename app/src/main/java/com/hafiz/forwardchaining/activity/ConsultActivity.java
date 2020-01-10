package com.hafiz.forwardchaining.activity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;

import androidx.annotation.RequiresApi;

import com.hafiz.forwardchaining.BaseActivity;
import com.hafiz.forwardchaining.R;
import com.hafiz.forwardchaining.models.Sortbyroll;
import com.hafiz.forwardchaining.models.penyakit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class ConsultActivity extends BaseActivity implements CompoundButton.OnCheckedChangeListener, View.OnClickListener {

    private CheckBox G01, G02, G03, G04, G05, G06, G07, G08, G09, G10, G11, G12, G13, G14, G15, G16, G17, G18;
    private Button btnDiagnosa;
    private String name;
    private ArrayList<String> daftarPenyakit = new ArrayList<>();
    private ArrayList<Object> A = new ArrayList<>();
    private ArrayList<penyakit> rangkum = new ArrayList<>();
    private ArrayList<String> P01 = new ArrayList<>(Arrays.asList("G01", "G02", "G03", "G04", "G05"
            , "G06", "G07", "G08", "G09", "G13", "G17", "G18"));
    private ArrayList<String> P02 = new ArrayList<>(Arrays.asList("G02", "G03", "G04", "G05"
            , "G08", "G09", "G10", "G11", "G12"));
    private ArrayList<String> P03 = new ArrayList<>(Arrays.asList("G01", "G04", "G13"
            , "G14", "G15", "G16", "G17", "G18"));

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consult);
        initView();
        initInitialize();
    }

    private void initInitialize() {

        Intent intent = getIntent();
        if (intent!=null){
            name =  intent.getStringExtra("name");
        }

        ImageView btnBack = findViewById(R.id.btnBack);
        btnBack.setOnClickListener(v -> onBackPressed());

        G01.setOnCheckedChangeListener(this);
        G02.setOnCheckedChangeListener(this);
        G03.setOnCheckedChangeListener(this);
        G04.setOnCheckedChangeListener(this);
        G05.setOnCheckedChangeListener(this);
        G06.setOnCheckedChangeListener(this);
        G07.setOnCheckedChangeListener(this);
        G08.setOnCheckedChangeListener(this);
        G09.setOnCheckedChangeListener(this);
        G10.setOnCheckedChangeListener(this);
        G11.setOnCheckedChangeListener(this);
        G12.setOnCheckedChangeListener(this);
        G13.setOnCheckedChangeListener(this);
        G14.setOnCheckedChangeListener(this);
        G15.setOnCheckedChangeListener(this);
        G16.setOnCheckedChangeListener(this);
        G17.setOnCheckedChangeListener(this);
        G18.setOnCheckedChangeListener(this);
        btnDiagnosa.setOnClickListener(this);
    }

    private void initView() {
        btnDiagnosa = findViewById(R.id.btnDiagonsa);
        G01 = findViewById(R.id.G01);
        G02 = findViewById(R.id.G02);
        G03 = findViewById(R.id.G03);
        G04 = findViewById(R.id.G04);
        G05 = findViewById(R.id.G05);
        G06 = findViewById(R.id.G06);
        G07 = findViewById(R.id.G07);
        G08 = findViewById(R.id.G08);
        G09 = findViewById(R.id.G09);
        G10 = findViewById(R.id.G10);
        G11 = findViewById(R.id.G11);
        G12 = findViewById(R.id.G12);
        G13 = findViewById(R.id.G13);
        G14 = findViewById(R.id.G14);
        G15 = findViewById(R.id.G15);
        G16 = findViewById(R.id.G16);
        G17 = findViewById(R.id.G17);
        G18 = findViewById(R.id.G18);


    }


    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        if (buttonView.getId() == R.id.G01) {
            if (isChecked) {
                daftarPenyakit.add("G01");
            } else {
                daftarPenyakit.remove("G01");
            }

        } else if (buttonView.getId() == R.id.G02) {
            if (isChecked) {
                daftarPenyakit.add("G02");
            } else {
                daftarPenyakit.remove("G02");
            }

        } else if (buttonView.getId() == R.id.G03) {
            if (isChecked) {
                daftarPenyakit.add("G03");
            } else {
                daftarPenyakit.remove("G03");
            }

        } else if (buttonView.getId() == R.id.G04) {
            if (isChecked) {
                daftarPenyakit.add("G04");
            } else {
                daftarPenyakit.remove("G04");
            }

        } else if (buttonView.getId() == R.id.G05) {
            if (isChecked) {
                daftarPenyakit.add("G05");
            } else {
                daftarPenyakit.remove("G05");
            }

        } else if (buttonView.getId() == R.id.G06) {
            if (isChecked) {
                daftarPenyakit.add("G06");
            } else {
                daftarPenyakit.remove("G06");
            }

        } else if (buttonView.getId() == R.id.G07) {
            if (isChecked) {
                daftarPenyakit.add("G07");
            } else {
                daftarPenyakit.remove("G07");
            }

        } else if (buttonView.getId() == R.id.G08) {
            if (isChecked) {
                daftarPenyakit.add("G08");
            } else {
                daftarPenyakit.remove("G08");
            }

        } else if (buttonView.getId() == R.id.G09) {
            if (isChecked) {
                daftarPenyakit.add("G09");
            } else {
                daftarPenyakit.remove("G09");
            }

        } else if (buttonView.getId() == R.id.G10) {
            if (isChecked) {
                daftarPenyakit.add("G10");
            } else {
                daftarPenyakit.remove("G10");
            }

        } else if (buttonView.getId() == R.id.G11) {
            if (isChecked) {
                daftarPenyakit.add("G11");
            } else {
                daftarPenyakit.remove("G11");
            }

        } else if (buttonView.getId() == R.id.G12) {
            if (isChecked) {
                daftarPenyakit.add("G12");
            } else {
                daftarPenyakit.remove("G12");
            }

        } else if (buttonView.getId() == R.id.G13) {
            if (isChecked) {
                daftarPenyakit.add("G13");
            } else {
                daftarPenyakit.remove("G13");
            }

        } else if (buttonView.getId() == R.id.G14) {
            if (isChecked) {
                daftarPenyakit.add("G14");
            } else {
                daftarPenyakit.remove("G14");
            }

        } else if (buttonView.getId() == R.id.G15) {
            if (isChecked) {
                daftarPenyakit.add("G15");
            } else {
                daftarPenyakit.remove("G15");
            }

        } else if (buttonView.getId() == R.id.G16) {
            if (isChecked) {
                daftarPenyakit.add("G16");
            } else {
                daftarPenyakit.remove("G16");
            }

        } else if (buttonView.getId() == R.id.G17) {
            if (isChecked) {
                daftarPenyakit.add("G17");
            } else {
                daftarPenyakit.remove("G17");
            }

        } else if (buttonView.getId() == R.id.G18) {
            if (isChecked) {
                daftarPenyakit.add("G18");
            } else {
                daftarPenyakit.remove("G18");
            }
        }
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    public void onClick(View v) {

        if (daftarPenyakit.isEmpty()){
            showMessage(getString(R.string.msg_no_choice));

        }else{
            showLoading(getString(R.string.title_diagnosa),
                    getString(R.string.please_wait));
            new Handler().postDelayed(this::diagnosa,2000);
        }
    }

    public void refresh(){
        G01.setChecked(false);
        G02.setChecked(false);
        G03.setChecked(false);
        G04.setChecked(false);
        G05.setChecked(false);
        G06.setChecked(false);
        G07.setChecked(false);
        G08.setChecked(false);
        G09.setChecked(false);
        G10.setChecked(false);
        G11.setChecked(false);
        G12.setChecked(false);
        G13.setChecked(false);
        G14.setChecked(false);
        G15.setChecked(false);
        G16.setChecked(false);
        G17.setChecked(false);
        G18.setChecked(false);
    }

    @SuppressLint("DefaultLocale")
    private void diagnosa(){
        rangkum.clear();
        rangkum.add(new penyakit("Rabun Jauh (Myopi)", (checkPenyakitA(P01, daftarPenyakit))));
        rangkum.add(new penyakit("Rabun Dekat (Hipermetropi)", checkPenyakitB(P02, daftarPenyakit)));
        rangkum.add(new penyakit("Katarak Senilis", checkPenyakitC(P03, daftarPenyakit)));

        Comparator<penyakit> c = Collections.reverseOrder(new Sortbyroll());
        Collections.sort(rangkum, c);

        if (rangkum.get(0).getNilaiPresentase()==100 && rangkum.get(1).getNilaiPresentase()==100
                && rangkum.get(2).getNilaiPresentase()==100) {
            showMessage(ConsultActivity.this, String.format("%s%s%s \n%s\n%s\n%s%d%%",
                    name, String.format(" %s", getString(R.string.msgdiagnosa)) + " ",
                    rangkum.get(0).getNamaPenyakit(), rangkum.get(1).getNamaPenyakit(),
                    rangkum.get(2).getNamaPenyakit(), getString(R.string.msg_accuracy)+ " ",
                    rangkum.get(0).getNilaiPresentase()));
            hideLoading();
        }else

        if (rangkum.get(0).getNilaiPresentase()==100 && rangkum.get(1).getNilaiPresentase()==100){
            showMessage(ConsultActivity.this,
                    String.format("%s%s%s \n%s\n%s%d%%", name, String.format(" %s",
                            getString(R.string.msgdiagnosa))+ " ",
                            rangkum.get(0).getNamaPenyakit(), rangkum.get(1).getNamaPenyakit(),
                            getString(R.string.msg_accuracy) + " ",  rangkum.get(0).getNilaiPresentase()));
            hideLoading();
        }else

        if (rangkum.get(0).getNilaiPresentase()==100 && rangkum.get(2).getNilaiPresentase()==100){
            showMessage(ConsultActivity.this, String.format("%s%s%s \n%s\n%s%d%%",
                    name, String.format(" %s", getString(R.string.msgdiagnosa))+ " ",
                    rangkum.get(0).getNamaPenyakit(),
                    rangkum.get(2).getNamaPenyakit(), getString(R.string.msg_accuracy) + " ",
                    rangkum.get(0).getNilaiPresentase()));
            hideLoading();
        }else

        if (rangkum.get(1).getNilaiPresentase()==100 && rangkum.get(2).getNilaiPresentase()==100){
            showMessage(ConsultActivity.this, String.format("%s%s%s \n%s\n%s%d%%",
                    name, String.format(" %s", getString(R.string.msgdiagnosa))+ " ",
                    rangkum.get(1).getNamaPenyakit(), rangkum.get(2).getNamaPenyakit(),
                    getString(R.string.msg_accuracy)+ " ", rangkum.get(0).getNilaiPresentase()));
            hideLoading();
        } else {
            showMessage(ConsultActivity.this, String.format("%s%s%s \n%s%d%%", name,
                    String.format(" %s", getString(R.string.msgdiagnosa)) + " ",
                    rangkum.get(0).getNamaPenyakit(), getString(R.string.msg_accuracy)+ " ",
                    rangkum.get(0).getNilaiPresentase()));
            hideLoading();
        }



        refresh();
    }

    private Integer checkPenyakitA(ArrayList<String> array1, ArrayList<String> array2) {
        Iterator<String> itr = array2.iterator();
        A.clear();
        while (itr.hasNext()) {
            Object list_two_element = itr.next();
            if (array1.contains(list_two_element)) {
                A.add(list_two_element);
            }
        }
        int totaldipilih = A.size();
        double total = (Double.parseDouble(String.valueOf(totaldipilih)) / 12) * 100;
        return Integer.valueOf(String.valueOf((Math.round(total))));
    }

    private Integer checkPenyakitB(ArrayList<String> array1, ArrayList<String> array2) {
        Iterator<String> itr = array2.iterator();
        A.clear();
        while (itr.hasNext()) {
            Object list_two_element = itr.next();
            if (array1.contains(list_two_element)) {
                A.add(list_two_element);
            }
        }
        int totaldipilih = A.size();
        double total = (Double.parseDouble(String.valueOf(totaldipilih)) / 9) * 100;
        return Integer.valueOf(String.valueOf((Math.round(total))));
    }

    private Integer checkPenyakitC(ArrayList<String> array1, ArrayList<String> array2) {
        Iterator<String> itr = array2.iterator();
        A.clear();
        while (itr.hasNext()) {
            Object list_two_element = itr.next();
            if (array1.contains(list_two_element)) {
                A.add(list_two_element);
            }
        }
        int totaldipilih = A.size();
        double total = (Double.parseDouble(String.valueOf(totaldipilih)) / 8) * 100;
        return Integer.valueOf(String.valueOf((Math.round(total))));
    }
}
