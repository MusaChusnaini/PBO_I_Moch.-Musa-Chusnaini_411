package other;
import java.util.Scanner;

class NeracaKeuangan {
    private int debit = 100000; // saldo awal
    private int limitSaldo = 200000;

    public void tambahKredit(int kredit) {
        try {
            if (debit + kredit > limitSaldo) {
                throw new Exception("Kredit melebihi limit saldo!");
            }
            debit += kredit;
            System.out.println("Kredit berhasil ditambahkan.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void tampilkanSaldo() {
        System.out.println("Saldo saat ini: " + debit);
    }

    public void displayAll() {
        System.out.println("=== Neraca Keuangan ===");
        tampilkanSaldo();
        System.out.println("=======================");
    }
}

public class BankIndonesia {
    public static void main(String[] args) {
        NeracaKeuangan akun = new NeracaKeuangan();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah kredit: ");
        try {
            int kredit = scanner.nextInt();
            akun.tambahKredit(kredit);
        } catch (Exception e) {
            System.out.println("Input tidak valid.");
        }

        akun.displayAll();
        scanner.close();
    }
}
