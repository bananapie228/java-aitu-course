package assigment2;

import java.util.Scanner;

public class t6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] array = new int[N];

        for (int i = 0; i < N; i++) {
            array[i] = scanner.nextInt();
        }
        int max = array[0];
        for (int i : array) {
            if (i > max){
                max = i;
            }
        }
        System.out.println(max);
    }
}
