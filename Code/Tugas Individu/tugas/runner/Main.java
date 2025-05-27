package tugas.runner;

import tugas.hewan.*;

public class Main {
    public static void main(String[] args){
        // pertama kita buat class yang sudah kita isi dari parent hewan dan karnivora
        Komodo komodo = new Komodo("Azriel","Nusa Tenggara Timur",3,100);
        // kita isi attribut melalui konstruktor (konstruktor ini otomatis memanggil display info)

        // setelah objek dibuat methodnya bisa kita pakai
        komodo.berperang();
        komodo.berburuMangsa();
        komodo.makanDaging("Ayam");
        komodo.tidur();
    }
}
