package com.example.classandopp;

public class Student extends people {
    private int okulno;
    private String sinifismi;

    public Student(int okulno, String sinifismi,String isim, String soyisim, String sehir, String dogumtarihi, int yas) {
        this.okulno = okulno;
        this.sinifismi = sinifismi;
        this.isim = isim;
        this.soyisim = soyisim;
        this.sehir = sehir;
        this.dogumtarihi = dogumtarihi;
        this.yas = yas;
    }

    public int getOkulno() {
        return okulno;
    }

    public void setOkulno(int okulno) {
        this.okulno = okulno;
    }

    public String getSinifismi() {
        return sinifismi;
    }

    public void setSinifismi(String sinifismi) {
        this.sinifismi = sinifismi;
    }
}
