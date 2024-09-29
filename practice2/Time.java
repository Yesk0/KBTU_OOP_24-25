package practice2;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        if (isValidTime(hour, minute, second)) {
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        } else {
            throw new IllegalArgumentException("Invalid time provided");
        }
    }

    private boolean isValidTime(int hour, int minute, int second) {
        return (hour >= 0 && hour < 24) && (minute >= 0 && minute < 60) && (second >= 0 && second < 60);
    }

    public String toUniversal() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    public String toStandard() {
        String period = hour < 12 ? "AM" : "PM";
        int standardHour = hour % 12;
        if (standardHour == 0) {
            standardHour = 12;
        }
        return String.format("%02d:%02d:%02d %s", standardHour, minute, second, period);
    }

    public void add(Time t) {
        this.second += t.second;
        this.minute += t.minute + this.second / 60;
        this.second %= 60;
        this.hour += t.hour + this.minute / 60;
        this.minute %= 60;
        this.hour %= 24;
    }

    public static void main(String[] args) {
        Time t = new Time(23, 5, 6);
        System.out.println("Universal Time: " + t.toUniversal());
        System.out.println("Standard Time: " + t.toStandard());

        Time t2 = new Time(4, 24, 33);
        t.add(t2);  // Добавляем t2 к t
        System.out.println("After adding t2 to t:");
        System.out.println("Universal Time: " + t.toUniversal());
        System.out.println("Standard Time: " + t.toStandard());
    }
}

