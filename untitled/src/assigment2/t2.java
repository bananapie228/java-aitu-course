package assigment2;

public class t2 {
    public static final String ODD = "Odd";
    public static final String EVEN = "Even";
    public static String[] strings = new String[5];

    public static void main(String[] args) {
        for (int i = 0; i < strings.length; i++) {
            strings[i] = (i % 2 == 0) ? ODD : EVEN;
        }
    }
}
