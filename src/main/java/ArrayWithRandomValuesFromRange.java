import java.util.Arrays;
import java.util.Random;

public class ArrayWithRandomValuesFromRange {

    public static void main(String[] args) {
        int[] intArray = generateRandomArray(10, -1, 1);
        System.out.println(Arrays.toString(intArray));
        findMinValue(intArray, -1);
        findMaxValue(intArray, 1);
    }

    private static int[] generateRandomArray(int arraySize, int minValue, int maxValue) {
        int[] integerList = new int[arraySize];
        for (int i = 0; i <= (arraySize - 1); i++) {
            integerList[i] = (new Random()).nextInt(maxValue - minValue + 1) + minValue;
        }
        return integerList;
    }

    private static void findMinValue(int[] list, int minValue) {
        System.out.println("Min value count in array: " + Arrays.stream(list).filter(min -> minValue == min).count());
    }

    private static void findMaxValue(int[] list, int maxValue) {
        System.out.println("Max value count in array: " + Arrays.stream(list).filter(max -> maxValue == max).count());
    }
}
