package app;
import perpustakaan.*;

public class Main {
    public static void main(String[] args){
        NonFiksi bukuNonFiksi= new NonFiksi("Madilog","Tan Malaka","Bidang: Sejarah & Ilmu Pengetahuan");
        Fiksi bukuFiksi = new Fiksi("Hainuwele: Sang Putri Kelapa", "Lilis Hu","Genre: Dongeng");

        System.out.println();
        Anggota anggota1 = new Anggota("Moch. Musa Chusnaini","I411");
        Anggota anggota2 = new Anggota("Rizki Adi Pranata","I410");


        System.out.println();
        bukuFiksi.displayInfo();
        bukuNonFiksi.displayInfo();

        System.out.println();
        anggota1.displayInfo();
        anggota2.displayInfo();

        System.out.println();
        anggota1.pinjamBuku(bukuNonFiksi.judul);
        anggota2.pinjamBuku(bukuFiksi.judul,7);

        System.out.println();
        anggota1.kembalikanBuku();
        anggota2.kembalikanBuku();
    }
}
