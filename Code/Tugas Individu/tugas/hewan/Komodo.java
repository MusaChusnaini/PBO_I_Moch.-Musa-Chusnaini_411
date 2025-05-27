package tugas.hewan;

public class Komodo extends HewanAbstrak implements Karnivora{

    // konstruk akan otomatis mengisi dari parent class
    public Komodo(String namaHewan, String habitatAsli, int ukuranBadan, int beratBadan) {
        super(namaHewan, habitatAsli, ukuranBadan, beratBadan);
    }


    // overriding setiap method yang ada pada parent class, kita implementasikan disini.
    @Override
    public void tidur() {
        System.out.println("Komodo tidur..... ZZZZZ");
    }

    @Override
    public void berperang() {
        System.out.println("Komodo menyatakan perang dengan manusia!");
    }

    @Override
    public void makanDaging(String namaBuruan) {
        System.out.println(namaHewan+" sang komodo memakan "+namaBuruan+". Nyam-nyam.");
    }

    @Override
    public void berburuMangsa() {
        System.out.println(namaHewan+" sang komodo pergi berburu..");
    }
}
