import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String value;
        System.out.println("Будь ласка, введіть значення а: ");
        value = input.readLine();
        double a = Double.parseDouble(value);

        System.out.println("Будь ласка, введіть значення b: ");
        value = input.readLine();
        double b = Double.parseDouble(value);

        System.out.println("Будь ласка, введіть значення c, c не дорівнює 0: ");
        value = input.readLine();
        double c = Double.parseDouble(value);

        System.out.println("Будь ласка, введіть значення х: ");
        value = input.readLine();
        double x = Double.parseDouble(value);

        System.out.println("Результат виконання функції за допомогою команд розгалуження у повній формі: " + Function.fullF1(a, b, c, x));
        System.out.println("Результат виконання функції за допомогою команд розгалуження у скороченій формі: " + Function.shortF1(a, b, c, x));

        double[] y1 = new double[1];
        double[] y2 = new double[1];

        Function.fullG1(a, b, c, x, y1);
        Function.shortG1(a, b, c, x, y2);

        System.out.println("Результат виконання функції за допомогою команд розгалуження у повній формі, отриманий за допомогою параметра-масиву: " + y1[0]);
        System.out.println("Результат виконання функції за допомогою команд розгалуження у скороченій формі, отриманий за допомогою параметра-масиву: : " + y2[0]);

        MyDouble value1 = new MyDouble();
        MyDouble value2 = new MyDouble();

        Function.fullH1(a, b, c, x, value1);
        Function.shortH1(a, b, c, x, value2);

        System.out.println("Результат виконання функції за допомогою команд розгалуження у повній формі, отриманий за допомогою параметра-об'єкту: : " + value1.myDouble);
        System.out.println("Результат виконання функції за допомогою команд розгалуження у скороченій формі, отриманий за допомогою параметра-об'єкту: : " + value2.myDouble);
    }
}
