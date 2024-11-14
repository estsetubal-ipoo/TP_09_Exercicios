package parte3;

public class Time {
    private int hour, minute, second;

    public Time(int hour, int minute, int second) {
        if(hour < 0 || hour > 23) throw new IllegalArgumentException("Hour must be in [1, 23].");
        if(minute < 0 || minute > 59) throw new IllegalArgumentException("Minute must be in [0, 59].");
        if(second < 0 || second > 59) throw new IllegalArgumentException("Second must be in [0, 59].");

        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setHour(int hour) {
        if(hour < 0 || hour > 23) throw new IllegalArgumentException("Hour must be in [1, 23].");

        this.hour = hour;
    }

    public void setMinute(int minute) {
        if(minute < 0 || minute > 59) throw new IllegalArgumentException("Minute must be in [0, 59].");

        this.minute = minute;
    }

    public void setSecond(int second) {
        if(second < 0 || second > 59) throw new IllegalArgumentException("Second must be in [0, 59].");

        this.second = second;
    }

    public void setTime(int hour, int minute, int second) {
        if(hour < 0 || hour > 23) throw new IllegalArgumentException("Hour must be in [1, 23].");
        if(minute < 0 || minute > 59) throw new IllegalArgumentException("Minute must be in [0, 59].");
        if(second < 0 || second > 59) throw new IllegalArgumentException("Second must be in [0, 59].");

        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    public void nextSecond() {
        second++;
        if (second == 60) {
            second = 0;
            minute++;
            if (minute == 60) {
                minute = 0;
                hour++;
                if (hour == 24) {
                    hour = 0;
                }
            }
        }
    }

    public void previousSecond() {
        second--;
        if (second == -1) {
            second = 59;
            minute--;
            if (minute == -1) {
                minute = 59;
                hour--;
                if (hour == -1) {
                    hour = 23;
                }
            }
        }
    }
}
