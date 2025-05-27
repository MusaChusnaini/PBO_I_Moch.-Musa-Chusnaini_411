package com.praktikum.users;
import com.praktikum.actions.MahasiswaActions;
import com.praktikum.data.Item;

import java.util.InputMismatchException;

public class Mahasiswa extends User implements MahasiswaActions { // SUBCLASS

    public Mahasiswa(String username, String NIM) {
        super(username, NIM);
        // calling the constructor from superclass, when this called it will act like usual
    }

    // overrides from the superclass, so that we can have our own special implementation
    @Override
    public void login() {
        hasLogged = true;
        displayInfo();
        System.out.println("Login Berhasil.");
        displayAppMenu();
    }

    @Override
    public void displayInfo() {
        System.out.println("Username : " + getUsername() + "\nNIM : " + getUniqueCode());
    }



    @Override
    public void displayAppMenu() {
        System.out.println("1. Laporkan barang temuan / hilang\n2. Lihat daftar laporan\n0. Logout");
        pilihan=0;
        try{

            pilihan = myScanner.nextInt();
            switch(pilihan){
                case 0:
                    hasLogged = false;
                    break;
                case 1:
                    reportItem();
                    break;
                case 2:
                    viewReportedItem();
                    break;
                default:
                    System.out.println("Tolong ulangi lagi");
                    displayAppMenu();
                    break;
            }
        }catch(InputMismatchException e){
            System.err.println("Input Harus berupa angka!");
        }

    }

    @Override
    public void reportItem() {
        String namaBarang, deskripsiBarang, lokasiTerakhir;

        myScanner.nextLine();
        System.out.print("Masukkan nama barang: ");
        namaBarang = myScanner.nextLine();
        System.out.print("Masukkan deskripsi barang: ");
        deskripsiBarang = myScanner.nextLine();
        System.out.print("Masukkan lokasi terakhir: ");
        lokasiTerakhir = myScanner.nextLine();
        Item item= new Item(namaBarang,deskripsiBarang,lokasiTerakhir,"Reported");
        itemArrayList.add(item);

        System.out.println("Menemukan "+ namaBarang+" dengan deskripsi: \""+deskripsiBarang+"\", Lokasi terakhir: "+lokasiTerakhir);
        displayAppMenu();
    }


    @Override
    public void viewReportedItem() {
        int i=0;
        if(itemArrayList.size() <=0){
            System.out.println("Tidak ada barang yang hilang.");
        }else {
            i=0;
            for(Item item : itemArrayList){
                i++;
                System.out.println(i+". "+item.getItemName()+", Deskripsi: "+item.getDescription()+", Ditemukan di:"+
                        item.getLocation()+" Status: "+item.getStatus());
                System.out.println();
            }

        }
        displayAppMenu();
    }
}
