public class Admin extends User {
    public Admin(String username, String password) {
        super(username, password);
    }

    @Override
    public void login(String inputNama, String inputPassword) {
        if (!(getUsername().equals(inputNama)) || !(getNIM().equals(inputPassword))) {
            System.out.println("Login Gagal, username atau password anda salah.");
        } else {
            System.out.println("Login Berhasil.");
        }
    }
}
