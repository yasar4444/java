public class week1c {

    public static void main(String[] args) {

        int n = 10;

        // Efficient iterative approach instead of recursion
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    public static int fibonacci(int n) {
        int a = 0, b = 1, c;
        for (int i = 0; i < n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return a;
    }
}
