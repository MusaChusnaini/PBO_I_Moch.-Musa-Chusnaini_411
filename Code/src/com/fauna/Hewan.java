package com.fauna;

public abstract class Hewan {
    public String namaHewan;
    public int umurHewan;

    // ini adalah construct class Hewan
    public Hewan(String namaHewan,int umurHewan){
        this.namaHewan=namaHewan;
        this.umurHewan=umurHewan;
    }

    // abstract method ini digunakan untuk di implementasi kan di child class.
    // abstract method tidak boleh pakai body
    public abstract void makan();
    public abstract void bermain();
    public abstract void tidur();

    // namun class abstract bisa menggunakan concrete method seperti ini
    public void Mengaji(){
        System.out.println("بِسْمِ اللّٰهِ الرَّحْمٰنِ الرَّحِيْمِ");
    }
}
