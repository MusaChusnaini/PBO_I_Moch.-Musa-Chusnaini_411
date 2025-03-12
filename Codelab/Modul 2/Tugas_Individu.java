public class Tugas_Individu {
    public static class Tupai{
        String nama, jenis, suara;

        Tupai(String nama,String jenis,String suara){
            this.nama = nama;
            this.jenis = jenis;
            this.suara = suara;
        }

        public void memanjatPohon(){
            System.out.println("Tupai itu memanjat pohon!");
        }
        public void memakanKacang(){
            System.out.println("Tupai itu memakan kacang. *krek-krek-krek*");
        }
        public void berjalan(){
            System.out.println("Tupai itu berjalan di dahan pohon!");
        }
        public void mengumpulkanKacang(int jumlahKacang){
            System.out.println("Tupai itu membawa " + jumlahKacang + " Kacang untuk sarangnya!");
        }
    }
    public static void main(String[] args){
        Tupai tupai = new Tupai("Sandy Cheeks","Mamalia","Cik-Cik-Cik");
        tupai.memanjatPohon();
        tupai.memakanKacang();
        tupai.berjalan();
        tupai.mengumpulkanKacang(50);
    }
}