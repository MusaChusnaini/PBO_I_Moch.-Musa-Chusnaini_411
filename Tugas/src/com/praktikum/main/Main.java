package com.praktikum.main;
import com.praktikum.users.*;
import com.praktikum.data.*;
import java.util.*;

public class Main {

    static ArrayList<Item> itemsList = new ArrayList<>();
    static ArrayList<User> usersList = new ArrayList<>();
    static Scanner myScanner;

    public static void main(String[] args) {
        myScanner = new Scanner(System.in);

        // initialize using superclass, and assigns the subclass information inside
        User mahasiswa = new Mahasiswa("Moch. Musa Chusnaini", "202410370110411");
        User admin = new Admin("Admin411", "Password411");

        usersList.add(mahasiswa);
        usersList.add(admin);

        itemsList.add(new Item("Bunga","Putih","Taman","Reported"));
        itemsList.add(new Item("Batu","Putih","Taman","Reported"));
        loginPortal();

    }

    static void loginPortal(){
        int inputLogin=0;
        System.out.println("Pilih Login\n1. Admin\n2. Mahasiswa");
        try{
            inputLogin = myScanner.nextInt();
            if(inputLogin != 1 && inputLogin != 2){
                System.out.println("Input tidak tersedia, mohon input lagi.");
                loginPortal();
            }
        }catch (InputMismatchException e){
            System.err.println("Input harus berupa angka.");
        }

        myScanner.nextLine(); // makes new line to make a clean buffer

        Login(inputLogin);
    }

    static User GivePermit(String inputNama, String inputUniqueCode){
        User permittedUser = null;
        for (User user : usersList){
            if(user.getUsername().equals(inputNama) && user.getUniqueCode().equals(inputUniqueCode)){
                System.out.println("User Ditemukan.");
                permittedUser = user;
                break;
            }
        }
        return permittedUser;
    }

    /// <summary>
    /// Login sebagai mahasiswa (2) atau admin (1)
    /// </summary>
    private static void Login(int loginAs) {
        String inputNama = "";
        String inputUniqueCode="";

        try{
            switch (loginAs) {
                case 2: // Login as student
                    System.out.print("Masukkan Nama : ");
                    inputNama = myScanner.nextLine();
                    System.out.print("Masukkan NIM : ");
                    inputUniqueCode = myScanner.nextLine();
                    break;
                case 1: // Login as admin
                    System.out.print("Masukkan Username : ");
                    inputNama = myScanner.nextLine();
                    System.out.print("Masukkan Password : ");
                    inputUniqueCode = myScanner.nextLine();
                    break;
                default: // If the user inputs incorrect number
                    System.out.println("Pilihan tidak valid.");
                    myScanner.close();
                    break;
            }

            User permittedUser= GivePermit(inputNama,inputUniqueCode);
            permittedUser.setItemArrayList(itemsList);
            permittedUser.setUserArrayList(usersList);
            permittedUser.login();
            if(!permittedUser.hasLogged){
                loginPortal();
            }
        }catch (NullPointerException e){
            System.err.println("Gagal Login User tidak ditemukan");
        }catch (InputMismatchException e){
            System.err.println("Input harus berupa angka!");
        }
    }
}
