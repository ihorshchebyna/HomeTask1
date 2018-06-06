
import java.util.ArrayList;
import java.util.Scanner;

public class StringArray {


    public static void main(String[] args) {
        ArrayList<String> stringArray = newArray(5);
        returnShortestString(stringArray, findShortest(stringArray));
    }

    private static ArrayList<String> newArray(int arrayLength) {
        ArrayList<String> stringArray = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= arrayLength; i++) {
            System.out.println("Enter string value for an array: ");

            stringArray.add(scanner.nextLine());
        }
        return stringArray;
    }

    private static int findShortest(ArrayList<String> array) {
        int shortestArray = Integer.MAX_VALUE;
        for (int i = 0; i <= array.size() - 2; i++) {
            if (shortestArray > array.get(i).length()) {
                shortestArray = array.get(i).length();
            }
        }
        return shortestArray;
    }

    private static void returnShortestString(ArrayList<String> array, int minLength) {
        System.out.println("The shortest value(s) from array is/are: ");
        for (int i = 0; i <= array.size() - 1; i++) {
            if (array.get(i).length() == minLength) {
                System.out.println(array.get(i));
            }
        }
    }
}
