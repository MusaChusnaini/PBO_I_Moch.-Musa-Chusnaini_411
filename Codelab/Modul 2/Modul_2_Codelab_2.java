public class Modul_2_Codelab_2 {
    static class RekeningBank{
        String nomorRekening, namaPemilik;
        double saldo;
        RekeningBank(String nomorRekening,String namaPemilik,double saldo){
            this.nomorRekening = nomorRekening;
            this.namaPemilik = namaPemilik;
            this.saldo = saldo;
        }

        public void displayInfo(){
            System.out.println("Nomor Rekening : "+nomorRekening+"\nNama Pemilik : "+namaPemilik
                +"\nSaldo : "+saldo+"\n");
        }
        public void setorUang(double uang){
            System.out.println(namaPemilik+" Menyetor RP"+uang+"\n");
            saldo+=uang;
        }
        public void tarikUang(double uang){
            if(saldo>=uang){
                System.out.println(namaPemilik+" Menarik RP"+uang+"\n");
                saldo-=uang;
            }else{
                System.out.println(namaPemilik+" Gagal Menarik Uang RP"+uang+".(Saldo tidak mencukupi)" +
                        " Saldo : "+ saldo+"\n");
            }
        }
    }
    public static void main(String[] args){
        RekeningBank rekening1 = new RekeningBank("202410370110411","Moch. Musa Chusnaini",
                5000000);
        RekeningBank rekening2 = new RekeningBank("202410370110434","Ariel Ardiansyah",
                7500000);

        rekening1.displayInfo();
        rekening1.tarikUang(3000000);
        rekening1.setorUang(150000);

        rekening2.displayInfo();
        rekening2.tarikUang(8000000);
        rekening2.setorUang(300000);

    }
}
