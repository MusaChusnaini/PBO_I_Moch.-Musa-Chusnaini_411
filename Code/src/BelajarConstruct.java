import java.util.*;


public class BelajarConstruct {
    public static class Jajan{
        String nama;
        double harga;
        Jajan(String nama,double harga){
           this.nama = nama;
           this.harga = harga;
        }
    }
    public static void main(String[] args){
        String namaJajan, namaPelanggan;
        int input=0;
        double hargaJajan;

        ArrayList<Jajan> jajans = new ArrayList<>();
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Nama pelanggan kamu! : ");
        namaPelanggan = myScanner.nextLine();
        do{
            System.out.print("Masukkan nama jajan :");
            namaJajan = myScanner.nextLine();
            System.out.print("Masukkan harga jajan :");
            hargaJajan = myScanner.nextDouble();
            Jajan jajan = new Jajan(namaJajan,hargaJajan);

            jajans.add(jajan);
            System.out.println("Input lagi?");
            input = myScanner.nextInt();
            myScanner.nextLine();
        }while (input!=0);
        myScanner.close();
        Random rand = new Random();
        int randomPick = rand.nextInt(jajans.size());

        for(Jajan j:jajans){
            System.out.println(j.nama+" "+j.harga);
        }

        System.out.println("Kata "+namaPelanggan+ " : Aku mau "+jajans.get(randomPick).nama+"!\n"+namaPelanggan+" bilek: Mahal banget njir.. "
                +jajans.get(randomPick).harga);
    }
}
