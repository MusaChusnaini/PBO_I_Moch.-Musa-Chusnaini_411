package com.example;
import com.fauna.*;

public class Main {
    public static void main(String[] args){

        // buat object seperti biasa
        Kucing myKucing = new Kucing("Blacky",3);

        // tinggal kita pangil method yang kita buat hasil override di class Kucing dari class Hewan
        myKucing.makan();
        myKucing.makan("Tempe");

        /*
            meskipun method Mengaji tidak ada di class Kucing, tapi karena class Kucing extends ke
            class Hewan, jadi class ini bisa akses method tersebut hanya dengan meng-extend saja
        */
        myKucing.Mengaji();

        myKucing.bermain();
        myKucing.tidur();
    }
}
