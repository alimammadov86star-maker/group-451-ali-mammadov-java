package Classworks.Classwork_7;

public class Time {
    int hours;
    int minutes;

    Time(int h, int m) {
        if (h >= 0 && h <= 23 && m >= 0 && m <= 59) {
            hours = h;
            minutes = m;
        } else {
            hours = 0;
            minutes = 0;
        }
    }

    void addMinutes(int min) {
        minutes += min;
        hours += minutes / 60;
        minutes %= 60;
        hours %= 24;
    }

    public String toString() {
        return String.format("%02d:%02d", hours, minutes);
    }
}