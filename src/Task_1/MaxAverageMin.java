package Task_1;

import java.util.Arrays;

public class MaxAverageMin {
    static public void work(int sizeArray, boolean isPrintArray){
        double[] array = new double[sizeArray];
        for (int i = 0; i<sizeArray ; i++){
            array[i] = Math.random();
        }
        if (isPrintArray)
            System.out.println(Arrays.toString(array));
        System.out.println("Максимум: " + findMax(array));
        System.out.println("Среднее: " + findAverage(array));
        System.out.println("Минимум: " + findMin(array));
    }

    static public void work(boolean isPrintArray){
        work(10, isPrintArray);
    }

    static public void work(int sizeArray){
        work(sizeArray, true);
    }

    static public void work(){
        work(10, true);
    }

    public static double findMax(double[] numbers) {
        double max = Double.MIN_VALUE;
        for (double number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }

    public static double findAverage(double[] numbers) {
        double sum = 0;
        for (double number : numbers) {
            sum += number;
        }
        return sum / numbers.length;
    }

    public static double findMin(double[] numbers) {
        double min = Double.MAX_VALUE;
        for (double number : numbers) {
            if (number < min) {
                min = number;
            }
        }
        return min;
    }
}
