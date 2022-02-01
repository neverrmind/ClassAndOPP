package com.example.classandopp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //constructor
        people insan3 = new people("ali", "kara", 27, "izmir", "17.07.1984");
        /*System.out.println(insan3.getIsim());
        insan3.setIsim("mehmet");
        System.out.println(insan3.getIsim());*/
        //setter
        /*insan3.setIsim("mehmet");
        insan3.setSoyisim("gunes");
        insan3.getSehir("ankara");
        insan3.setYas(27);
        insan3.setDogumtarihi("12.05.1992");
        System.out.println();
        //getter
        /*System.out.println("İsim" + insan3.getIsim());
        System.out.println("Soyisim" + insan3.getSoyisim());
        System.out.println("Yaş" + insan3.getYas());
        System.out.println("Şehir" + insan3.getSehir());
        System.out.println("Doğum Tarihi" + insan3.getDogumtarihi());*/
        //insan3.bilgileriyaz();*/
        //Student ogrenci1 = new Student(107, "4-A", "ahmet", "keskin", "bolu", "19.07.2005", 12);
        /*ogrenci1.setIsim("ahmet");
        ogrenci1.setSoyisim("keskin");
        ogrenci1.setYas(12);
        ogrenci1.setSehir("bolu");
        ogrenci1.setDogumtarihi("19.07.2005");*/
        /*System.out.println("Adı = " + ogrenci1.getIsim());
        System.out.println("soyadı = " + ogrenci1.getSoyisim());
        System.out.println("sınıfı = " + ogrenci1.getSinifismi());
        System.out.println("okul no = " + ogrenci1.getOkulno());*/

        //polymorphism
        /*lesson ders1 = new lesson ("matematik", "hasan gumus", "çarşamba", "13:00");
        ders1.dersbilgileriniyaz();
        ders1.dersbilgileriniyaz("carpanlarına ayırma");
        ders1.dersbilgileriniyaz("carpanlarına ayırma",37);*/

        //dinamik

    }
}