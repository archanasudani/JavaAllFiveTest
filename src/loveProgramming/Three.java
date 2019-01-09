package loveProgramming;

public class Three {
    public int getDaysOfWeek() {
        int daysOfWeek = 1;

        switch (daysOfWeek) {
            case 0:
                System.out.println("\nMonday");
                break;
            case 1:
                System.out.println("\nTuesday");
                break;
            case 2:
                System.out.println("\nWednesday");
                break;
            case 3:
                System.out.println("\nThursday");
                break;
            case 4:
                System.out.println("\nFriday");
                break;
            default:
                System.out.println("\nWeekEnd");

        }

        return daysOfWeek;
    }
}