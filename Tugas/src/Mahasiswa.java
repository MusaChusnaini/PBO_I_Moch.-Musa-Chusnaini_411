public class Mahasiswa extends User { // SUBCLASS
    public Mahasiswa(String username, String NIM) {
        super(username, NIM);
        // calling the constructor from superclass, when this called it will act like usual
    }

    // overrides from the superclass, so that we can have our own special implementation
    @Override
    public void login(String inputNama, String inputNIM) {
        if (!(getUsername().equals(inputNama)) || !(getNIM().equals(inputNIM))) {
            System.out.println("Login Gagal, username atau password anda salah.");
        } else {
            System.out.println("Login Berhasil.");
        }
    }
}
