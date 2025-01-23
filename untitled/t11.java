package assignment3;
public class t11 {
    public interface Movable {
        void move();
    }

    public interface Edible {
        void beEaten();
    }

    public interface Eat {
        void eat();
    }

    public class Dog implements Movable, Eat {
        @Override
        public void move() {
            System.out.println("Dog is moving.");
        }

        @Override
        public void eat() {
            System.out.println("Dog is eating.");
        }
    }

    public class Cat implements Movable, Eat, Edible {
        @Override
        public void move() {
            System.out.println("Cat is moving.");
        }

        @Override
        public void eat() {
            System.out.println("Cat is eating.");
        }

        @Override
        public void beEaten() {
            System.out.println("Cat is being eaten.");
        }
    }

    public class Mouse implements Movable, Edible {
        @Override
        public void move() {
            System.out.println("Mouse is moving.");
        }

        @Override
        public void beEaten() {
            System.out.println("Mouse is being eaten.");
        }
    }

    public static void main(String[] args) {
        t11 solution = new t11();

        Dog dog = solution.new Dog();
        dog.move();
        dog.eat();

        Cat cat = solution.new Cat();
        cat.move();
        cat.eat();
        cat.beEaten();

        Mouse mouse = solution.new Mouse();
        mouse.move();
        mouse.beEaten();
    }
}
