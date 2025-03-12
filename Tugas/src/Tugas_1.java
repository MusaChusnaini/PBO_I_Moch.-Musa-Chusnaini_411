import java.util.*;

public class Tugas_1 {

    static class Mahasiswa{
        String usernameMahasiswa;
        String NIMMahasiswa;
        Mahasiswa(String usernameMahasiswa,String NIMMahasiswa){
            this.usernameMahasiswa = usernameMahasiswa;
            this.NIMMahasiswa = NIMMahasiswa;
        }

        String getUsernameMahasiswa(){
            return usernameMahasiswa;
        }String getNIMMahasiswa(){
            return NIMMahasiswa;
        }
    }
    static class Admin{
        String usernameAdmin;
        String passwordAdmin;
        Admin(String usernameAdmin,String passwordAdmin){
            this.usernameAdmin = usernameAdmin;
            this.passwordAdmin = passwordAdmin;
        }

        String getUsernameAdmin(){
            return usernameAdmin;
        }
        String getPasswordAdmin(){
            return passwordAdmin;
        }
    }

    static Scanner myScanner;
    public static void main(String[] args) {
        myScanner = new Scanner(System.in);

        Mahasiswa mahasiswa = new Mahasiswa("Moch. Musa Chusnaini","202410370110411");
        Admin admin = new Admin("Admin411","Password411");

        int inputLogin=0;
        System.out.println("Pilih Login\n1. Admin\n2. Mahasiswa");
        inputLogin = myScanner.nextInt();
        Login(inputLogin,admin,mahasiswa);
    }


    /// <summary>
    /// Login jika mahasiswa 2 jika admin 1
    /// </summary>
    private static void Login(int loginAs,Admin admin,Mahasiswa mahasiswa) {
        String inputNama;
        switch (loginAs){
           case 2: // Ini masuk sebagai mahasiswa
               System.out.print("Masukkan Nama : ");
               inputNama = myScanner.nextLine();
               myScanner.nextLine();
               System.out.print("Masukkan NIM : ");
               String inputNim = myScanner.nextLine();
               if(!(inputNama.equals(mahasiswa.getUsernameMahasiswa())) && !(inputNim.equals(mahasiswa.getNIMMahasiswa()))){
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

               if(!(inputNama.equals(admin.getUsernameAdmin())) && !(inputPassword.equals(admin.getPasswordAdmin()))){
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
