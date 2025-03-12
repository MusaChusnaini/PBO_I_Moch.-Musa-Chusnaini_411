public class Modul_2_Codelab_1 {
    public static class Hewan{
        String nama,jenis,suara;
        Hewan(String nama,String jenis,String suara){
            this.nama = nama;
            this.jenis = jenis;
            this.suara = suara;
        }
        public void Print(){
            System.out.println("Nama : "+nama);
            System.out.println("Jenis : "+jenis);
            System.out.println("Suara : "+suara + "\n");
        }
    }
    public static void main(String[] args){
        Hewan hewan1 = new Hewan("Kucing","Mamalia","Nyaaa~");
        Hewan hewan2 = new Hewan("Anjing","Mamalia","Woof!");

        hewan1.Print();
        hewan2.Print();

    }
}
