public class week2dii {

    public static void main(String[] args) {
        String a = "I am Vampire";
        String b = "bats";

        if (isSubstring(a, b)) {
            System.out.println("b is a substring of a");
        } else {
            System.out.println("b is not a substring of a");
        }
    }

    public static boolean isSubstring(String x, String y) {
        return x.indexOf(y) != -1;
    }
}

