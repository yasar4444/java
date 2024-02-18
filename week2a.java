public class week2a {

    public static void main(String[] args) {

        int[] n = {12, 76, 72, 62, 1, 82, 19, 7, 27};
        sort(n);

        System.out.println("The sorted array is: ");
        for (int i = 0; i < n.length; i++) {
            System.out.print(n[i] + " ");
        }
    }

    public static void sort(int[] arr) {
            for (int i = 0; i < arr.length - 1; i++) {
            
            for (int j = 0; j < arr.length - i - 1; j++) { 
                if (arr[j] > arr[j + 1]) {
                     
                     int temp = arr[j];
                     arr[j] = arr[j + 1];
                     arr[j + 1] = temp;
                    
                }
            }
        }
    }
}
