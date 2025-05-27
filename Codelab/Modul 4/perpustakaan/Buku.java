package perpustakaan;

public abstract class Buku {

    public String genre, penulis, judul;

    public Buku(String judul,String penulis,String genre){
        this.genre = genre;
        this.judul = judul;
        this.penulis = penulis;
    }
    public abstract void displayInfo();
}
