package Task_4;

public class AngleOnClock {
    public static void work(int hours, int minutes){
        if (hours < 0 || hours > 23) {
            throw new IllegalArgumentException("Некорректное значение часа");
        }
        if (minutes < 0 || minutes > 59) {
            throw new IllegalArgumentException("Некорректное значение минуты");
        }
        double hourAngle = 30 * (hours % 12) + 0.5 * minutes;
        double minuteAngle = 6 * minutes;
        double angleDiff = Math.abs(hourAngle - minuteAngle);
        System.out.println("Угол между часовой и минутной стрелками: " + Math.min(angleDiff, 360 - angleDiff) + " градусов");
    }
}
