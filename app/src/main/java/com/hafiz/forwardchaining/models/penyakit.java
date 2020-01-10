package com.hafiz.forwardchaining.models;

import java.util.Comparator;

public class penyakit {

    private String namaPenyakit;
    private int nilaiPresentase;

    public penyakit(String namaPenyakit, int nilaiPresentase) {
        this.namaPenyakit = namaPenyakit;
        this.nilaiPresentase = nilaiPresentase;
    }

    public String getNamaPenyakit() {
        return namaPenyakit;
    }

    public int getNilaiPresentase() {
        return nilaiPresentase;
    }



}
