package assignment3;
public class t15 {
    public interface Selectable {
        void onSelect();
    }

    public interface Updatable extends Selectable {
        void refresh();
    }

    public class Screen implements Updatable {
        @Override
        public void onSelect() {
            System.out.println("Screen selected.");
        }

        @Override
        public void refresh() {
            System.out.println("Screen refreshed.");
        }
    }

    public static void main(String[] args) {
        t15 solution = new t15();
        Screen screen = solution.new Screen();
        screen.onSelect();
        screen.refresh();
    }
}
