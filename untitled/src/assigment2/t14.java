package assigment2;

import java.util.Scanner;

public class t14 {
    public static int[][] array = new int[3][3];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = scanner.nextInt();
            }
        }

        int minSum = Integer.MAX_VALUE;

        for (int[] row : array) {
            int rowSum = 0;
            for (int num : row) {
                rowSum += num;
            }
            minSum = Math.min(minSum, rowSum);
        }

        for (int j = 0; j < array[0].length; j++) {
            int colSum = 0;
            for (int[] row : array) {
                colSum += row[j];
            }
            minSum = Math.min(minSum, colSum);
        }

        System.out.println(minSum);
    }
}
