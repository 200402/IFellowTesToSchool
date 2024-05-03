package Task_3;

public class BaseConverter {
    public static void convert(double degreesCelsius, unitsOfMeasurement converseTo){
        switch (converseTo){
            case Kelvins -> System.out.println("Температура в кельвинах " + (degreesCelsius + 273.15));
            case Fahrenheit -> System.out.println("Температура в фаренгейтах " + (degreesCelsius * 9 / 5 + 32));
        }
    }
}
