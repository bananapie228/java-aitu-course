package assignment3;

public class t9 {
    public interface CanMove {
        Double speed();
    }

    public interface CanFly extends CanMove {
        Double speed(CanFly flyObject);
    }

    public static void main(String[] args) {
        System.out.println("Interfaces CanMove and CanFly created with appropriate methods.");
    }
}
