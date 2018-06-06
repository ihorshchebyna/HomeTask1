import java.util.ArrayList;
import java.util.List;

public class ArrayWithPrimeNumbers {


    public static void main(String[] args) {
        primeNumberList(12);
    }

    public static List<Integer> primeNumberList(int listLength) {
        List<Integer> primeNumerList = new ArrayList<>();
        primeNumerList.add(0);
        for (int i = 0; i < listLength; i++) {
            for (int number = (primeNumerList.get(i) + 1); number <= Integer.MAX_VALUE; number++) {
                if (isPrime(number)) {
                    primeNumerList.add(number);
                    System.out.print(primeNumerList.get(i) + ", ");
                    break;
                } else ;

            }
        }
        return primeNumerList;
    }

    private static boolean isPrime(int number) {
        double sqrt = Math.sqrt(number);
        int roundSqrt = (int) Math.round(sqrt);
        for (int i = roundSqrt; i > 1; i--) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}