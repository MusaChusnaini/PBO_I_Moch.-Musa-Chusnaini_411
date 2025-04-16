public class User { // SUPERCLASS
    private String username, NIM; // Encapsulation attribute

    public User(String username, String NIM) {
        this.username = username;
        this.NIM = NIM;
    } // constructor class User

    public String getUsername() {
        return username;
    } // getting username

    public void setUsername(String inputUsername) {
        username = inputUsername;
    } // set username

    public String getNIM() {
        return NIM;
    }

    public void setNIM(String inputNIM) {
        NIM = inputNIM;
    }

    public void login(String inputNama, String inputNIM) {
        // Implementation on subclass
    }

    public void displayInfo() {
        System.out.println("Username : " + this.username + "\nNIM : " + this.NIM);
    }
}