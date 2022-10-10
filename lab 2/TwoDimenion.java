import java.util.Scanner;

public class TwoDimenion {

    public static void main(String[] args) {
        int[][] arr = new int[4][4];
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("enter a 4x4 matrix:\n");
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
        }
        for (int i = 0; i < 4; i++) {
            System.out.println();
            for (int j = 0; j < 4; j++) {
                System.out.print(" "+arr[j][i]);
            }
        }
    }
}