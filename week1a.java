public class week1a {
    public static void main(String[] args) {
        int a = 7;
        int i;

        for (i = 2; i <= a - 1; i++) {
            if (a % i == 0) {
                System.out.println(a + " is not a prime number");
                return;
            }
        }

        System.out.println(a + " is a prime number");
    }
}
