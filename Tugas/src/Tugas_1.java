import java.util.*;

public class Tugas_1 {


    static Scanner myScanner;

    public static void main(String[] args) {
        myScanner = new Scanner(System.in);

        // initialize using superclass, and assigns the subclass information inside
        User mahasiswa = new Mahasiswa("Moch. Musa Chusnaini", "202410370110411");
        User admin = new Admin("Admin411", "Password411");

        System.out.println("Pilih Login\n1. Admin\n2. Mahasiswa");
        int inputLogin = myScanner.nextInt();
        myScanner.nextLine(); // makes new line to make a clean buffer

        Login(inputLogin, admin, mahasiswa);
    }

    /// <summary>
    /// Login sebagai mahasiswa (2) atau admin (1)
    /// </summary>
    private static void Login(int loginAs, User admin, User mahasiswa) {
        String inputNama;
        switch (loginAs) {
            case 2: // Login as student
                System.out.print("Masukkan Nama : ");
                inputNama = myScanner.nextLine();
                System.out.print("Masukkan NIM : ");
                String inputNim = myScanner.nextLine();
                mahasiswa.login(inputNama, inputNim);
                break;
            case 1: // Login as admin
                System.out.print("Masukkan Username : ");
                inputNama = myScanner.nextLine();
                System.out.print("Masukkan Password : ");
                String inputPassword = myScanner.nextLine();
                admin.login(inputNama, inputPassword);
                break;
            default: // If the user inputs incorrect number
                System.out.println("Pilihan tidak valid.");
        }
        myScanner.close();
    }
}
