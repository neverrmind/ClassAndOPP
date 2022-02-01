package com.example.classandopp;

public class note extends lesson{
    private int alinannot;
    public Note(String dersadi, String ogretmenadi, String dersgunu, String dersaati, int alinannot){
        super(dersadi, ogretmenadi, dersgunu, dersaati, alinannot);
        this.alinannot = alinannot;
    }
    public void dersbilgileriniyaz(){
        super.dersbilgileriniyaz();
    }
}
