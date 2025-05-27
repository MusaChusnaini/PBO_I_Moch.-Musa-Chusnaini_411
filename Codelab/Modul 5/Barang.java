public class Barang {
    private String namaBarang;
    private int stok;
    public Barang(String namaBarang,int stok){
        this.namaBarang = namaBarang;
        this.stok = stok;
    }
    public Barang(){
        return;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public int getStok() {
        return stok;
    }
    public String getnamaBarang() {
        return namaBarang;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }
}
