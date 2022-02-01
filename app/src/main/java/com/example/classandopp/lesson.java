package com.example.classandopp;

public class lesson {
    private String dersadi, ogretmenadı, dersgunu, derssaati;

    public lesson(String dersadi, String ogretmenadı, String dersgunu, String derssaati) {
        this.dersadi = dersadi;
        this.ogretmenadı = ogretmenadı;
        this.dersgunu = dersgunu;
        this.derssaati = derssaati;
    }

    public void dersbilgileriniyaz(){
        System.out.println("ders adı = " + dersadi);
    }

    public void dersbilgileriniyaz(String dersicerigi) {
        System.out.println("ders adı = " + dersadi);
        System.out.println("dersicerigi = " + dersicerigi);
    }

    public void dersbilgileriniyaz(String dersicerigi, int isleneceksayfa) {
        System.out.println("ders adı = " + dersadi);
        System.out.println("ders icerigi = " + dersicerigi);
        System.out.println("islenecek sayfa = " + isleneceksayfa);
    }
}
