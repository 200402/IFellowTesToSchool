import Task_1.MaxAverageMin;
import Task_2.DuplicateCharacter;
import Task_3.BaseConverter;
import Task_3.unitsOfMeasurement;
import Task_4.AngleOnClock;

public class Main {
    public static void main(String[] args) {
        MaxAverageMin.work(100, false);
        System.out.println();
        DuplicateCharacter.work();
        System.out.println();
        BaseConverter.convert(100, unitsOfMeasurement.Fahrenheit);
        System.out.println();
        AngleOnClock.work(15, 30);
    }
}