package com.fauna;

public class Kucing extends Hewan {

    public Kucing(String namaHewan, int umurHewan) {
        super(namaHewan, umurHewan);
        displayInfo();
    }

    void displayInfo(){
        System.out.println(namaHewan+" berumur "+umurHewan+" tahun.");
    }

    // implementasi override disini semua adalah dari class parent Hewan.
    @Override
    public void makan() {
        System.out.println(namaHewan+" Makan ikan asin.");
    }
    public void makan(String makanan){
        System.out.println(namaHewan+" Makan "+makanan);
    }

    @Override
    public void bermain() {
        System.out.println(namaHewan+" Bermain dengan kucing lain.");
    }

    @Override
    public void tidur() {
        System.out.println(namaHewan+" Tertidur");
    }


}
