public class week2b {

    public static void main(String[] args) {

        int rows = 4; 
        int cols = 2; 

        int[][] a = {{27, 17}, {7, 37}, {97, 87}, {77, 57}};
        int[][] b = {{127, 117}, {17, 137}, {197, 187}, {177, 157}};

        
        System.out.println("Printing the array a:");
        for (int i = 0; i < rows; i++) { 
            for (int j = 0; j < cols; j++) { 
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        System.out.println("Printing the array b:");
        for (int i = 0; i < rows; i++) { 
            for (int j = 0; j < cols; j++) { 
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        System.out.println("Printing added array:");
        for (int i = 0; i < rows; i++) { 
            for (int j = 0; j < cols; j++) { 
                System.out.print(a[i][j] + b[i][j] + " ");
            }
            System.out.println();
        }
    }
}
