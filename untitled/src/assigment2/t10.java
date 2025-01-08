package assigment2;

import java.util.Scanner;

public class t10 {
    public static int[][] multiArray;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        multiArray = new int[N][];

        for (int i = 0; i < N; i++) {
            int size = scanner.nextInt();
            multiArray[i] = new int[size];
        }
    }
}
