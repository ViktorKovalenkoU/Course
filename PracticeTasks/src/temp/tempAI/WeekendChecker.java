public class WeekendChecker {
    public static Boolean dayChecker(DayOfTheWeek day) {
        switch (day) {
            case SATURDAY, SUNDAY:
                return true;
            default:
                return false;
        }
    }
}
