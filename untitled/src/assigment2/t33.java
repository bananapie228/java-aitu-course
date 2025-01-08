package assigment2;

public class t33 {
    public static void main(String[] args) {
        JavaDeveloper dev = new JavaDeveloper();
        dev.move();
        dev.eat();
        dev.speak();
        dev.code();
    }
}

class Creature {
    public void move() {
        System.out.println("I'm moving.");
    }

    public void eat() {
        System.out.println("I'm eating.");
    }
}

class Human extends Creature {
    public void speak() {
        System.out.println("I can communicate.");
    }
}

class JavaDeveloper extends Human {
    public void code() {
        System.out.println("I know how to communicate in Java.");
    }
}
