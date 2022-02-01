package com.example.classandopp;

public class people {
    //property
    public String isim, soyisim;
    public int yas;
    public String sehir, dogumtarihi;

    //constructor
    public people(String isim, String soyisim, int yas, String sehir, String dogumtarihi) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.yas = yas;
        this.sehir = sehir;
        this.dogumtarihi = dogumtarihi;
    }

    public people() {
    }

    //encapsulation
    //setter
    public void setIsim(String isim) {
        this.isim = isim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public void setSehir(String sehir) {
        this.sehir = sehir;
    }

    public void setDogumtarihi(String dogumtarihi) {
        this.dogumtarihi = dogumtarihi;
    }
    //getter

    public String getIsim() {
        return isim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public int getYas() {
        return yas;
    }

    public String getSehir() {
        return sehir;
    }

    public String getDogumtarihi() {
        return dogumtarihi;
    }

    /*public void bilgileriyaz(){
        System.out.println("İsim" + isim);
        System.out.println("Soyisim" + soyisim);
        System.out.println("Yaş" + yas);
        System.out.println("Şehir" + sehir);
        System.out.println("Doğum Tarihi" + dogumtarihi);
    }*/
}
