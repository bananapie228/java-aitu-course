package assignment3;

public class t8 {
    public interface Person {
        boolean isAlive();
    }

    public interface Presentable extends Person {}

    public static void main(String[] args) {
        System.out.println("Interfaces Person and Presentable created.");
    }
}
