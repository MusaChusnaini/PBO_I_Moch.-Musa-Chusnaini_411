package perpustakaan;

public class Anggota implements Peminjaman {

    String nama;
    String idAnggota;

    String bukuDipinjam="";

    public Anggota(String nama,String idAnggota){
        this.nama = nama;
        this.idAnggota = idAnggota;
    }

    public void displayInfo(){
        System.out.println("Anggota: "+nama+" (ID:"+idAnggota+")");
    }

    @Override
    public void pinjamBuku(String judulBuku) {
        System.out.println(nama+" meminjam buku berjudul: "+judulBuku);
        bukuDipinjam = judulBuku;
    }
    public void pinjamBuku(String judulBuku,int durasiPinjam){
        System.out.println(nama+" meminjam buku berjudul: \""+judulBuku+"\" selama "+durasiPinjam+" hari.");
        bukuDipinjam = judulBuku;
    }

    @Override
    public void kembalikanBuku() {
        System.out.println(nama+" mengembalikan buku berjudul: "+bukuDipinjam);
    }
}
