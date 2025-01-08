package assigment2;

import java.util.Scanner;

public class t16 {
    public static char[][] array;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();
        int width = 2 * height - 1;

        array = new char[height][width];

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (j >= height - 1 - i && j <= height - 1 + i) {
                    array[i][j] = '#';
                } else {
                    array[i][j] = ' ';
                }
            }
        }

        for (char[] row : array) {
            System.out.println(new String(row));
        }
    }
}
