package other;

public class ThrowExample {
    public static void main(String[] args) {
        int x = 0;
        try {
            if (x == 0) {
                throw new ArithmeticException("Nilai x tidak boleh nol.");
            }
            System.out.println("Nilai x: " + x);
        } catch (ArithmeticException e) {
            System.out.println("Terjadi error: " + e.getMessage());
        }
    }
}
