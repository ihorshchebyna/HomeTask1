import java.util.Arrays;

public class ArrayMaxMinConverting {

    public static void main(String[] args) {
        int[] intList = {15, 2, 3, 2, 15};
        int maxFromList = findMax(intList);
        int minFromList = findMin(intList);
        convertMaxMin(intList, minFromList, maxFromList);

    }

    private static int findMin(int[] list) {
        return Arrays.stream(list).min().getAsInt();
    }

    private static int findMax(int[] list) {
        return Arrays.stream(list).max().getAsInt();
    }

    private static int[] convertMaxMin(int[] list, int min, int max) {
        for (int i = 0; i <= (list.length - 1); i++) {
            if (list[i] == min) {
                list[i] = max;
            } else if (list[i] == max) {
                list[i] = min;
            }
        }
        System.out.println(Arrays.toString(list));
        return list;
    }
}