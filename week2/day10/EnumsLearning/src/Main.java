public class Main {
    public Day day;

    public Main(Day day) {
        this.day = day;
    }

    public enum Month {
        JANUARY, FEBRUARY
    }

    public void printStuff() {
        switch (day) {
            case MONDAY -> System.out.println("Sucks");
            case TUESDAY -> System.out.println("Tacos");
            case WEDNESDAY -> System.out.println("Hump Day");
            case THURSDAY -> System.out.println("Throwback");
            case FRIDAY -> System.out.println("Thank God");
            case SATURDAY, SUNDAY -> System.out.println("Weekend again!");
            default -> System.out.println("weekends are best");
        }
    }

    public static void main(String[] args) {
        new Main(Day.SATURDAY).printStuff();
    }

}
