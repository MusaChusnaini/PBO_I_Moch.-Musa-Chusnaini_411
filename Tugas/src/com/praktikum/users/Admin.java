package com.praktikum.users;

import com.praktikum.actions.AdminActions;
import com.praktikum.data.Item;

import java.util.InputMismatchException;

public class Admin extends User implements AdminActions {

    public Admin(String username, String password) {
        super(username, password);
    }

    @Override
    public void login() {
        hasLogged = true;
        System.out.println("Login Berhasil.");
        displayAppMenu();
    }

    @Override
    public void displayInfo() {
        System.out.println("Username : " + getUsername() + "\nNIM : " + getUniqueCode());
    }

    @Override
    public void displayAppMenu() {
        System.out.println("1. Kelola laporan barang\n2. Kelola data mahasiswa\n0. Logout");
        pilihan=0;
        pilihan = myScanner.nextInt();
        switch(pilihan){
            case 0:
                hasLogged =false;
                break;
            case 1:
                manageItems();
                break;
            case 2:
                manageUsers();
                break;
            default:
                displayAppMenu();
                break;
        }
        return;
    }


    @Override
    public void manageItems() {
        int i=0;
        if(itemArrayList.size() <= 0){
            System.out.println("Tidak ada barang yang hilang.");
        }else {
            i=0;
            for(Item item : itemArrayList){
                i++;
                if(item.getStatus().equals("Reported")){
                    System.out.println((i)+". "+item.getItemName()+", Deskripsi: "+item.getDescription()+", Ditemukan di:"+
                            item.getLocation());
                }
            }
        }
        try{
            System.out.println("Pilih angka barang yang sudah ditemukan.");
            i = myScanner.nextInt();
            itemArrayList.get(i-1).setStatus("Claimed");
            System.out.println("Perubahan Sukses!");
            displayAppMenu();
        }catch (IndexOutOfBoundsException e){
            System.err.println("Index Tidak Ditemukan!");
            manageItems();
        }catch (InputMismatchException e){
            System.err.println("Masukkan Angka");
            manageItems();
        }
    }

    @Override
    public void manageUsers() {
        System.out.println("Pilih aksi: \n1. Tambah Mahasiswa\n2. Hapus Mahasiswa\n0. Keluar");


        try{
            pilihan = myScanner.nextInt();
            myScanner.nextLine();
            switch (pilihan){
                case 1:
                    tambahMahasiswa();
                    break;
                case 2:
                    hapusMahasiswa();
                    break;
                case 0:
                    displayAppMenu();
                    break;
            }
        }catch (InputMismatchException e){
            System.err.println("Input harus berupa angka!");
        }
    }

    @Override
    public void tambahMahasiswa() {
        String nama, NIM;
        System.out.println("Masukkan Nama: ");
        nama = myScanner.nextLine();
        System.out.println("Masukkan NIM: ");
        NIM = myScanner.nextLine();

        User mahasiswa = new Mahasiswa(nama,NIM);
        userArrayList.add(mahasiswa);
        System.out.println(mahasiswa.getUsername()+" NIM: "+mahasiswa.getUniqueCode()+",Berhasil ditambahkan.");
        displayAppMenu();
    }

    @Override
    public void hapusMahasiswa() {
        String NIM;
        System.out.println("Masukkan NIM: ");
        NIM = myScanner.nextLine();
        for(User user : userArrayList){
            if(user instanceof Mahasiswa && user.getUniqueCode().equals(NIM)){
                System.out.println(user.getUsername()+" dengan NIM: "+user.getUniqueCode()+" dihapus.");
                userArrayList.remove(user);
            }else {
                System.out.println("Mahasiswa tidak ditemukan.");
            }
            break;
        }
        manageUsers();

    }
}
