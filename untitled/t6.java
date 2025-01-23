package assignment3;
public class t6 {
    public interface Selectable {
        void onSelect();
    }

    public interface Updatable {
        void refresh();
    }

    public static class Screen implements Selectable, Updatable {
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
        Screen screen = new Screen();
        screen.onSelect();
        screen.refresh();
    }
}
