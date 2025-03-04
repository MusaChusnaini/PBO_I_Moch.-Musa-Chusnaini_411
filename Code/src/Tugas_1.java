import java.util.*;

public class Tugas_1 {
    static Scanner myScanner;
    public static void main(String[] args) {
        myScanner = new Scanner(System.in);
        String usernameAdmin ="Admin411";
        String passwordAdmin ="Password411";

        String usernameMahasiswa = "Moch. Musa Chusnaini";
        String NIMMahasiswa = "202410370110411";
        int inputLogin=0;
        System.out.println("Pilih Login\n1. Admin\n2. Mahasiswa");
        inputLogin = myScanner.nextInt();
        switch (inputLogin){
            case 1:
                Login(usernameAdmin,passwordAdmin,1);
                break;
            case 2:
                Login(usernameMahasiswa,NIMMahasiswa,0);
                break;
            default:
                break;
        }
    }


    /// <summary>
    /// Login jika mahasiswa 0 jika admin 1
    /// </summary>
    private static void Login(String username, String password, int loginAs) {
        String inputNama;
        switch (loginAs){
           case 0: // Ini masuk sebagai mahasiswa
               System.out.print("Masukkan Nama : ");
               inputNama = myScanner.nextLine();
               myScanner.nextLine();
               System.out.print("Masukkan NIM : ");
               String inputNim = myScanner.nextLine();
               if(!(inputNama.equals(username)) && !(inputNim.equals(password))){
                   // Ini jika username salah
                   System.out.println("Login Gagal, username atau password anda salah.");
               }else {
                   // Ini jika benar
                   System.out.println("Login Berhasil.");
               }
               break;
           case 1:// ini masuk sebagai admin
               System.out.print("Masukkan Username : ");
               inputNama = myScanner.nextLine();
               myScanner.nextLine();
               System.out.print("Masukkan Password : ");
               String inputPassword = myScanner.nextLine();

               if(!(inputNama.equals(username)) && !(inputPassword.equals(password))){
                   // Ini jika username salah
                   System.out.println("Login Gagal, username atau password anda salah.");
               }else {
                   // Ini jika benar
                   System.out.println("Login Berhasil.");
               }
               break;
       }
        myScanner.close();
    }

}
