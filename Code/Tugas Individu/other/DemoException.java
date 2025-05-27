package other;

public class DemoException {
    public static void main(String[] args) {
        int[] data = {10, 20, 30};
        try {
            System.out.println("Nilai: " + data[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Terjadi error: " + e.getMessage());
        }
    }
}
