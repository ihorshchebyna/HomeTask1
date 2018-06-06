import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ArrayWithDuplicates {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter array length: ");
        int arrayLength = scanner.nextInt();
        System.out.println((listWithoutDupes(createIntArray(arrayLength)).toString()));

    }

    private static ArrayList<Integer> createIntArray(int arrayLength) {
        if(isArrayShort(arrayLength, 3)) {
            System.out.println("Array should be longer than 3, change the lengths of the array. \n" +
                    "New size of array is: ");
            arrayLength = scanner.nextInt();
        }
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        for (int i = 0; i <= arrayLength - 1; i++) {
            System.out.println("Enter an integer for an array: ");
            integerArrayList.add(scanner.nextInt());
        }
        return integerArrayList;
    }

    private static boolean isArrayShort(int  currentLength,int minLength) {
        if (currentLength <= minLength) {
            return true;
        } else return false;
    }

    private static ArrayList<Integer> listWithoutDupes(ArrayList<Integer> integerArrayList) {
        return integerArrayList
                .stream()
                .distinct()
                .collect(Collectors.toCollection(ArrayList::new));
    }
}
