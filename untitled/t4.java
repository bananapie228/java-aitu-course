package assignment3;

public class t4 {
    public interface CanRun {
        void run();
    }

    public interface CanSwim {
        void swim();
    }

    public abstract class Human implements CanRun, CanSwim {
        // No implementation required for the methods in the abstract class
    }

    public static void main(String[] args) {
        System.out.println("Abstract Human class created with CanRun and CanSwim interfaces.");
    }
}
