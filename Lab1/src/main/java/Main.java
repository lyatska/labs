import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String value;
        System.out.println("Будь ласка, введіть значення s: ");
        value = input.readLine();
        double s = Double.parseDouble(value);

        System.out.println("Будь ласка, введіть значення t: ");
        value = input.readLine();
        double t = Double.parseDouble(value);
        double result = Function.f(1, s+t) + Function.f(s, s-t) - Function.f(t, Math.sqrt(Math.pow(s, 2) + Math.pow(t, 2)));
        System.out.println("Результат, отриманий за допомогою результату функції: " + result);

        double [] value1 = new double[1];
        double [] value2 = new double[1];
        double [] value3 = new double[1];

        Function.g(1, s+t, value1);
        Function.g(s, s-t, value2);
        Function.g(t, Math.sqrt(Math.pow(s, 2) + Math.pow(t, 2)), value3);
        double result1 = value1[0] + value2[0] - value3[0];
        System.out.println("Результат, отриманий за допомогою параметра-масиву: " + result1);

        MyDouble v1 = new MyDouble();
        MyDouble v2 = new MyDouble();
        MyDouble v3 = new MyDouble();

        Function.h(1, s+t, v1);
        Function.h(s, s-t, v2);
        Function.h(t, Math.sqrt(Math.pow(s, 2) + Math.pow(t, 2)), v3);
        double result2 = v1.myDouble + v2.myDouble - v3.myDouble;
        System.out.println("Результат, отриманий за допомогою параметра-об'єкту: " + result2);
    }
}
