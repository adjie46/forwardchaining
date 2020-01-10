package com.hafiz.forwardchaining.models;

import java.util.Comparator;

public class Sortbyroll implements Comparator<penyakit> {
    @Override
    public int compare(penyakit o1, penyakit o2) {
        return o1.getNilaiPresentase() - o2.getNilaiPresentase();
    }
}
