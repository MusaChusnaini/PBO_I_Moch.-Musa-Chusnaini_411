
public class Modul_3_Codelab_1 {
    static class KarakterGame{
        private String nama;
        private int kesehatan;
        KarakterGame(String nama,int kesehatan){
            this.nama=nama;
            this.kesehatan=kesehatan;
        }

        public String getNama() {
            return nama;
        }

        public void setNama(String nama) {
            this.nama = nama;
        }

        public int getKesehatan() {
            return kesehatan;
        }

        public void setKesehatan(int kesehatan) {
            this.kesehatan = kesehatan;
        }

        void serang(KarakterGame karakterGame){
            System.out.println(nama+" : Bersiaplah!");
        }
    }
    static class Pahlawan extends KarakterGame{
        Pahlawan(String name,int health){
            super(name,health);
        }

        @Override
        void serang(KarakterGame karakterGame) {
            super.serang(karakterGame);
            karakterGame.setKesehatan(-20);
            System.out.println(super.getNama()+" menyerang "+karakterGame.nama +" menggunakan Orbital Strike!\n"+
                    karakterGame.getKesehatan()+" Tersisa");
        }
    }
    static class Villain extends KarakterGame{
        Villain(String name,int health){
            super(name,health);
        }

        @Override
        void serang(KarakterGame karakterGame) {
            super.serang(karakterGame);
            karakterGame.setKesehatan(-20);
            System.out.println(super.getNama()+" menyerang "+karakterGame.nama +" menggunakan Snake Bite!\n"+
                    karakterGame.getKesehatan()+" Tersisa");
        }
    }
    public static void main(String[] args){
        Pahlawan hero = new Pahlawan("Brimstone",150);
        Villain villain = new Villain("Viper",200);
        System.out.println(hero.getNama()+" memiliki kesehatan: "+hero.getKesehatan());
        System.out.println(villain.getNama()+" memiliki kesehatan: "+villain.getKesehatan());
        hero.serang(villain);

        villain.serang(hero);
    }
}
