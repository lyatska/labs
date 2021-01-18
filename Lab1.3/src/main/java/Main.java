public class Main {
    public static void main(String[] args) {
        System.out.println("Результат виконання 1 способу, отриманий за допомогою результату функції: " + Function.f1());
        System.out.println("Результат виконання 2 способу, отриманий за допомогою результату функції: " + Function.f2());
        System.out.println("Результат виконання 3 способу, отриманий за допомогою результату функції: " + Function.f3());
        System.out.println("Результат виконання 4 способу, отриманий за допомогою результату функції: " + Function.f4());

        double[] y1 = new double[1];
        double[] y2 = new double[1];
        double[] y3 = new double[1];
        double[] y4 = new double[1];

        Function.g1(y1);
        Function.g2(y2);
        Function.g3(y3);
        Function.g4(y4);

        System.out.println("Результат виконання 1 способу, отриманий за допомогою параметра-масиву: " + y1[0]);
        System.out.println("Результат виконання 2 способу, отриманий за допомогою параметра-масиву: " + y2[0]);
        System.out.println("Результат виконання 3 способу, отриманий за допомогою параметра-масиву: " + y3[0]);
        System.out.println("Результат виконання 4 способу, отриманий за допомогою параметра-масиву: " + y4[0]);

        MyDouble value1 = new MyDouble();
        MyDouble value2 = new MyDouble();
        MyDouble value3 = new MyDouble();
        MyDouble value4 = new MyDouble();

        Function.h1(value1);
        Function.h2(value2);
        Function.h3(value3);
        Function.h4(value4);

        System.out.println("Результат виконання 1 способу, отриманий за допомогою параметра-об'єкту: " + value1.myDouble);
        System.out.println("Результат виконання 2 способу, отриманий за допомогою параметра-об'єкту: " + value2.myDouble);
        System.out.println("Результат виконання 3 способу, отриманий за допомогою параметра-об'єкту: " + value3.myDouble);
        System.out.println("Результат виконання 4 способу, отриманий за допомогою параметра-об'єкту: " + value4.myDouble);
    }
}
