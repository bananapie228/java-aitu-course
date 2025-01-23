package assignment3;

public class t3 {
    public interface CanFly {
        void fly();
    }

    public interface CanRun {
        void run();
    }

    public interface CanSwim {
        void swim();
    }

    public class Human implements CanRun, CanSwim {
        @Override
        public void run() {
            System.out.println("Human is running.");
        }

        @Override
        public void swim() {
            System.out.println("Human is swimming.");
        }
    }

    public class Duck implements CanFly, CanRun, CanSwim {
        @Override
        public void fly() {
            System.out.println("Duck is flying.");
        }

        @Override
        public void run() {
            System.out.println("Duck is running.");
        }

        @Override
        public void swim() {
            System.out.println("Duck is swimming.");
        }
    }

    public class Penguin implements CanRun, CanSwim {
        @Override
        public void run() {
            System.out.println("Penguin is running.");
        }

        @Override
        public void swim() {
            System.out.println("Penguin is swimming.");
        }
    }

    public class Airplane implements CanFly {
        @Override
        public void fly() {
            System.out.println("Airplane is flying.");
        }
    }

    public static void main(String[] args) {
        t3 solution = new t3();

        Human human = solution.new Human();
        human.run();
        human.swim();

        Duck duck = solution.new Duck();
        duck.fly();
        duck.run();
        duck.swim();

        Penguin penguin = solution.new Penguin();
        penguin.run();
        penguin.swim();

        Airplane airplane = solution.new Airplane();
        airplane.fly();
    }
}
