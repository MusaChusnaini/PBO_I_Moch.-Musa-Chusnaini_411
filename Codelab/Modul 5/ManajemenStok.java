import java.util.*;

public class ManajemenStok {

    static ArrayList<Barang> barangArrayList = new ArrayList<Barang>();

    static Scanner myScanner = new Scanner(System.in);
    static int index=0;
    public static void main(String[] args){

        // Tes Barang
        Barang barang1 = new Barang();
        barang1.setNamaBarang("Laptop");
        barang1.setStok(1);
        barangArrayList.add(barang1);


        int choice=0;
        do{
            try{
            System.out.println("======[MENU MANAJEMEN STOK]======\n1. Tambahkan barang baru\n2. Tampilkan semua barang\n3. Kurangi Stok Barang\n0. Keluar");
            choice= myScanner.nextInt();
            myScanner.nextLine();
            switch (choice){
                case 0:
                    Keluar();
                    break;
                case 1:
                    TambahBarang();
                    System.out.println();
                    break;
                case 2:
                    TampilkanBarang();
                    System.out.println();
                    break;
                case 3:
                    KurangiStokBarang();
                    System.out.println();
                    break;
                default:
                    System.out.println("Input Invalid");
                    break;
            }
        }catch (InputMismatchException e){
            System.out.println("Input harus Angka");
        }
        }while (choice!=0);

    }

    static void TampilkanBarang(){
        index =0;
        for(Barang b : barangArrayList){
            index++;
            if(b.getStok() <= 0){
                System.out.println(index+". "+b.getnamaBarang()+", stok tidak ada.");
            }else {
                System.out.println(index+". "+b.getnamaBarang()+", "+b.getStok());
            }
        }
        index=0;
    }
    static void Keluar(){
        System.out.println("Sistem keluar, sampai jumpa!");
    }
    static void TambahBarang(){
        System.out.print("Masukkan Nama Barang: ");
        String namaBarang = myScanner.nextLine();
        System.out.print("Masukkan Stok Barang: ");
        int stok = myScanner.nextInt();

        Barang barang = new Barang(namaBarang,stok);
        barangArrayList.add(barang);
        System.out.println(barang.getnamaBarang()+" ditambahkan, stok : "+barang.getStok());
    }


    static void KurangiStokBarang() {
        int kurangi=0;
        TampilkanBarang();
        System.out.print("Input nomor indeks barang yang ingin dikurangi: ");
        try{
            index = myScanner.nextInt();
            Barang barang= barangArrayList.get(index-1);
            System.out.print("Kurangi berapa : ");
            kurangi = myScanner.nextInt();
            if(kurangi > barang.getStok()){
                throw new StokTidakCukupException("Barang tidak mencukupi");
            }
            else{
                barang.setStok(barang.getStok()-kurangi);
                System.out.println(barang.getnamaBarang()+" Sekarang tinggal : "+barang.getStok());
            }
        }catch (IndexOutOfBoundsException e){
            System.err.println(e.getMessage());
            throw new IndexOutOfBoundsException("Harus dari angka yang ada di list");
        } catch (StokTidakCukupException e) {
            throw new RuntimeException(e);
        }
    }
}
