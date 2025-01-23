package assignment3;

public class t12 {
    public interface Weather {
        String getWeatherType();
    }

    public static class Today implements Weather {
        private String type;

        public Today(String type) {
            this.type = type;
        }

        @Override
        public String getWeatherType() {
            return type;
        }

        @Override
        public String toString() {
            return String.format("Today it will be %s", this.getWeatherType());
        }
    }

    public static void main(String[] args) {
        System.out.println(new Today("Cloudy"));
        System.out.println(new Today("Foggy"));
        System.out.println(new Today("Freezing"));
    }
}
