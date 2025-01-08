package assigment2;

public class t11 {
    public static int[][][][] multiArray = {{{{4, 8, 15}, {16}}, {{23, 42}, {}}, {{1}, {2}, {3}, {4, 5}}}};

    public static void main(String[] args) {
        for (int[][][] array3D : multiArray) {
            for (int[][] array2D : array3D) {
                for (int[] array1D : array2D) {
                    for (int num : array1D) {
                        System.out.print(num + " ");
                    }
                    System.out.println();
                }
            }
        }
    }
}
