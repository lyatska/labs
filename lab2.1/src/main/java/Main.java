import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String value;
        System.out.println("Введіть число, яке дорівнює розміру масиву: ");
        value = input.readLine();

        int n = Integer.parseInt(value);
        int[] a = new int[n];

        ArrayFunctions.createArray(a);
        ArrayFunctions.printArray(a);

        System.out.println("Сума індексів непарних елементів даного масиву дорівнює: " + ArrayFunctions.indexOddSum(a));
    }
}
