package assigment2;

public class t28 {
    public static void main(String[] args) {
        int[] array = {15, 64, 9, 51, 42};
        printSqrt(array);
    }

    public static void printSqrt(int[] array) {
        String prefix = "The square root for the number ";
        for (int i = 0; i < array.length; i++) {
            int number = array[i];
            double sqrt = Math.sqrt(number);
            System.out.println(prefix + number + " is " + sqrt);
        }
    }
}
