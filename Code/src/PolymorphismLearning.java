import com.fauna.Kucing;

public class PolymorphismLearning {
    public static class Manusia{
        String nama;
        int umur;
        public Manusia(String nama,int umur){
            this.nama = nama;
            this.umur = umur;
        }

        public Manusia(String nama){
            this.nama = nama;
        }
        public Manusia(){
            // KOMSONG
        }
    }
    public static void main(String[] args){
        Manusia manusia = new Manusia("Adit");
        System.out.println(manusia.nama);
    }
}
