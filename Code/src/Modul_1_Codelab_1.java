import java.time.LocalDate;
import java.util.Scanner;

// My Coding is Amazing

public class Modul_1_Codelab_1 {
    public static void main(String[] args){
        String myNama;
        char jenisKelamin;
        char inputLowercase;
        int tahunLahir;
        try (Scanner myScanner = new Scanner(System.in)){
            System.out.print("Masukkan Nama : ");
            myNama = myScanner.nextLine();


            do{
                System.out.print("Masukkan Jenis Kelamin (P/L) : ");
                jenisKelamin = myScanner.next().charAt(0);
                inputLowercase = Character.toLowerCase(jenisKelamin);
            }while(!(inputLowercase == 'p' || inputLowercase == 'l'));
            System.out.print("Masukkan Tahun Lahir : ");
            tahunLahir = myScanner.nextInt();

        }

        LocalDate localDate = LocalDate.now();
        int year = localDate.getYear();

        System.out.println("Nama : "+myNama);
        switch (inputLowercase){
            case 'p':
                System.out.println("Jenis Kelamin : Perempuan");
                break;
            case 'l':
                System.out.println("Jenis Kelamin : Laki-laki");
                break;
        }
        int umur = year - tahunLahir;
        System.out.println("Umur : "+umur);
    }
}
