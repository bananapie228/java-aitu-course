package assignment3;
public class t13 {
    public interface DBObject {
        DBObject initializeIdAndName(long id, String name);
    }

    public static class User implements DBObject {
        long id;
        String name;

        @Override
        public DBObject initializeIdAndName(long id, String name) {
            this.id = id;
            this.name = name;
            return this;
        }

        @Override
        public String toString() {
            return String.format("The user's name is %s, id = %d", name, id);
        }
    }

    public static void main(String[] args) {
        System.out.println(new User().initializeIdAndName(1, "Neo"));
    }
}
