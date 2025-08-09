import java.util.Scanner;

class Multiarray {
    public static void main(String args[]) {
        int A[][] = new int[3][3];
        int B[][] = new int[3][3];
        int C[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);
        int i, j;
        System.out.println("Enter 9-elements of matrix-A:");
        for (i = 0; i < 3; ++i) {
            for (j = 0; j < 3; ++j) {
                A[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter 9-elements of matrix-B:");
        for (i = 0; i < 3; ++i) {
            for (j = 0; j < 3; ++j) {
                B[i][j] = sc.nextInt();
            }
        }
        System.out.println("Resultant Matrix is: ");
        for (i = 0; i < 3; i++) {
            System.out.println(" ");
            for (j = 0; j < 3; j++) {
                C[i][j] = A[i][j] + B[i][j];
                System.out.print(C[i][j] + " ");

            }

        }
    }
}