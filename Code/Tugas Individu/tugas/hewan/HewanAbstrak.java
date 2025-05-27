package tugas.hewan;


// ini adalah kelas abstrak yang digunakan sebagai pengkategorian hewan
public abstract class HewanAbstrak {

    // ini konstruk hewan yang akan dipanggil saat objek dibuat (akan dipanggil juga di class Komodo)
    public HewanAbstrak(String namaHewan,String habitatAsli,int ukuranBadan,int beratBadan){
        this.namaHewan = namaHewan;
        this.habitatAsli = habitatAsli;
        this.ukuranBadan = ukuranBadan;
        this.beratBadan = beratBadan;

        displayInfo();
    }

    // menampilkan informasi hewan
    void displayInfo(){
        System.out.println(namaHewan+" si komodo dari "+habitatAsli+", dengan berat badan "+beratBadan+" kg,"
        +" berukuran "+ukuranBadan+" meter, siap bertahan hidup!");
    }

    public String namaHewan;
    public String habitatAsli;
    public int ukuranBadan;
    public int beratBadan;

    // method abstract ini digunakan / diimplementasikan nanti di child class
    public abstract void tidur();
    public abstract void berperang();
}
