package assignment3;


public class t2 {
    public interface CanFly {
        void fly();
    }

    public interface CanMove {
        void move();
    }

    public interface CanEat {
        void eat();
    }

    public class Dog implements CanMove, CanEat {
        @Override
        public void move() {
            System.out.println("Dog is moving.");
        }

        @Override
        public void eat() {
            System.out.println("Dog is eating.");
        }
    }

    public class Duck implements CanMove, CanFly, CanEat {
        @Override
        public void move() {
            System.out.println("Duck is moving.");
        }

        @Override
        public void fly() {
            System.out.println("Duck is flying.");
        }

        @Override
        public void eat() {
            System.out.println("Duck is eating.");
        }
    }

    public class Car implements CanMove {
        @Override
        public void move() {
            System.out.println("Car is moving.");
        }
    }

    public class Airplane implements CanMove, CanFly {
        @Override
        public void move() {
            System.out.println("Airplane is moving.");
        }

        @Override
        public void fly() {
            System.out.println("Airplane is flying.");
        }
    }

    public static void main(String[] args) {
        t2 solution = new t2();

        Dog dog = solution.new Dog();
        dog.move();
        dog.eat();

        Duck duck = solution.new Duck();
        duck.move();
        duck.fly();
        duck.eat();

        Car car = solution.new Car();
        car.move();

        Airplane airplane = solution.new Airplane();
        airplane.move();
        airplane.fly();
    }
}
