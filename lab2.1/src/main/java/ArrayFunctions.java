import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayFunctions {
    public static void createArray(int[] a) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String value;

        for (int i = 0; i < a.length; i++) {
            System.out.println("a[" + i + "] = ");
            value = input.readLine();
            a[i] = Integer.parseInt(value);
        }
    }
    public static void printArray(int[] a) {
        StringBuilder s = new StringBuilder("Array = ");
        for (int j : a) {
            s.append(String.format("%4d", j));
        }
        System.out.println(s);
    }

    public static int indexOddSum(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 !=0) {
                sum += i;
            }
        }
        return sum;
    }
}
