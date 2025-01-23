package assignment3;
import java.util.ArrayList;
import java.util.List;

public class t18 {
    public static class Person implements RepkaItem {
        private String name;
        private String namePadezh;

        public Person(String name, String namePadezh) {
            this.name = name;
            this.namePadezh = namePadezh;
        }

        public String getName() {
            return name;
        }

        @Override
        public String getNamePadezh() {
            return namePadezh;
        }

        public void pull(Person person) {
            System.out.println(this.name + " for " + person.getNamePadezh());
        }
    }

    public interface RepkaItem {
        String getNamePadezh();
    }

    public static class RepkaStory {
        static void tell(List<Person> items) {
            for (int i = items.size() - 1; i > 0; i--) {
                Person first = items.get(i - 1);
                Person second = items.get(i);
                first.pull(second);
            }
        }
    }

    public static void main(String[] args) {
        List<Person> plot = new ArrayList<>();
        plot.add(new Person("Repka", "Repku"));
        plot.add(new Person("Dedka", "Dedku"));
        plot.add(new Person("Babka", "Babku"));
        plot.add(new Person("Granddaughter", "Granddaughter"));

        RepkaStory.tell(plot);
    }
}
