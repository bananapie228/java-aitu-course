package assignment3;

public class t10 {
    public interface Person {
        void use(Person person);
        void startToWork();
    }

    public interface HasManagementPotential {
        boolean inspiresOthersToWork();
    }

    public interface Secretary extends Person {}

    public interface Boss extends Person, HasManagementPotential {}

    public class Manager implements Boss {
        @Override
        public void use(Person person) {
            person.startToWork();
        }

        @Override
        public void startToWork() {
            System.out.println("Manager is starting to work.");
        }

        @Override
        public boolean inspiresOthersToWork() {
            return true;
        }
    }

    public class Subordinate implements Secretary {
        @Override
        public void use(Person person) {}

        @Override
        public void startToWork() {
            System.out.println("Subordinate is starting to work.");
        }
    }

    public static void main(String[] args) {
        Manager manager = new t10().new Manager();
        Subordinate subordinate = new t10().new Subordinate();
        manager.use(subordinate);
        subordinate.startToWork();
    }
}
