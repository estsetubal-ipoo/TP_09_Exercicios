package parte3;

public class Date {
    private int day, month, year;

    public Date(int day, int month, int year) {
        if(day < 1 || day > 31) throw new IllegalArgumentException("Day must be in [1, 31].");
        if(month < 1 || month > 12) throw new IllegalArgumentException("Month must be in [1, 12].");
        if(year < 1900 || year > 9999) throw new IllegalArgumentException("Year must be in [1900, 9999].");

        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDay(int day) {
        if(day < 1 || day > 31) throw new IllegalArgumentException("Day must be in [1, 31].");

        this.day = day;
    }

    public void setMonth(int month) {
        if(month < 1 || month > 12) throw new IllegalArgumentException("Month must be in [1, 12].");

        this.month = month;
    }

    public void setYear(int year) {
        if(year < 1900 || year > 9999) throw new IllegalArgumentException("Year must be in [1900, 9999].");

        this.year = year;
    }

    public void setDate(int day, int month, int year) {
        if(day < 1 || day > 31) throw new IllegalArgumentException("Day must be in [1, 31].");
        if(month < 1 || month > 12) throw new IllegalArgumentException("Month must be in [1, 12].");
        if(year < 1900 || year > 9999) throw new IllegalArgumentException("Year must be in [1900, 9999].");

        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString() {
        return String.format("%02d/%02d/%04d", day, month, year);
    }
}
