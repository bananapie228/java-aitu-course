package assigment2;

public class t12 {
    public static int[][] array = new int[2][3];

    public static void main(String[] args) {
        int value = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = value++;
                System.out.println(array[i][j]);
            }
        }
    }
}
