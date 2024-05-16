import java.util.Set;


public class Date {
    private int year;
    private int month;
    private int day;

    static private Set<Integer> monthWith31days = Set.of(1, 3, 5, 7, 8, 10, 12);
    static private Set<Integer> monthWith30days = Set.of(4, 6, 9, 11);

    Date(int year, int month, int day) {
        setYear(year);
        setMonth(month);
        setDay(day);
    }

    public int getYear() { return year; }

    public void setYear(int year) { this.year = year; }

    public int getMonth() { return month; }

    public void setMonth(int month) {
        if (month < 1 || month > 12) {
            throw new IllegalArgumentException("Invalid month value: " + month);
        }
        this.month = month;
    }

    public int getDay() { return day; }

    public void setDay(int day) {
        if (day < 1 || monthWith31days.contains(day) && day > 31 ||
            monthWith30days.contains(day) && day > 30 ||
            isLeapYear(year) && day > 29 || day > 28) {
            throw new IllegalArgumentException("Invalid day value: " + day +
                                               " for month: " + month);
        }
        this.day = day;
    }

    public static boolean isLeapYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    public static String displayMonth(int month) {
        switch (month) {
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
            default:
                throw new IllegalArgumentException("Invalid month value: " + month);
        }
    }

    public static void main(String[] args) {
        Date date = new Date(2024, 7, 3);
        System.out.println("Month: " + Date.displayMonth(date.getMonth()));
    }
}
