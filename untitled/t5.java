package assignment3;

public class t5 {
    public interface Drinker {
        void askForMore(String message);
        void sayThankYou();
        boolean isReadyToGoHome();
    }

    public interface Alcoholic extends Drinker {
        boolean READY_TO_GO_HOME = false;

        void sleepOnTheFloor();
    }

    public static class BeerLover implements Alcoholic {
        @Override
        public void askForMore(String message) {
            System.out.println("More beer please: " + message);
        }

        @Override
        public void sayThankYou() {
            System.out.println("Thank you!");
        }

        @Override
        public boolean isReadyToGoHome() {
            return READY_TO_GO_HOME;
        }

        @Override
        public void sleepOnTheFloor() {
            System.out.println("Sleeping on the floor...");
        }
    }

    public static void main(String[] args) {
        BeerLover beerLover = new BeerLover();
        beerLover.askForMore("Cheers!");
        beerLover.sayThankYou();
        System.out.println("Ready to go home: " + beerLover.isReadyToGoHome());
        beerLover.sleepOnTheFloor();
    }
}
