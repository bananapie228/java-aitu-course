package assignment3;
import java.awt.Color;

public class t16 {
    public interface Animal {
        Color getColor();
        Integer getAge();
    }

    public static class Fox implements Animal {

        public String getName() {
            return "Fox";
        }

        @Override
        public Color getColor() {
            return null;
        }

        @Override
        public Integer getAge() {
            return null;
        }
    }

    public static void main(String[] args) {
        Fox fox = new Fox();
        System.out.println(fox.getName());
    }
}
