public class week1b {
    public static void main(String[] args) {
        int lowerLimit = 1; // Set the lower limit here
        int upperLimit = 10; // Set the upper limit here

        System.out.println("Prime numbers between " + lowerLimit + " and " + upperLimit + " are:");

        for (int num = lowerLimit; num <= upperLimit; num++) {
            int i = 2;
            while (i * i <= num && num % i != 0) {
                i++;
            }

            if (i * i > num) { // If no divisors found within the square root, it's prime
                System.out.println(num);
            }
        }
    }
}
