public class Function {
    public static double f1() {
        double S = 0;
        int i = 1;
        int N = 15;
        while (i <= N) {
            S += ((Math.sin(10*i) +  Math.cos((double) 10/i))/ Math.sqrt(i));
            i++;
        }
        return S;
    }

    public static double f2() {
        double S = 0;
        int i = 1;
        int N = 15;
        do {
            S += ((Math.sin(10*i) +  Math.cos((double) 10/i))/ Math.sqrt(i));
            i++;
        } while (i <= N);
        return S;
    }

    public static double f3() {
        double S = 0;
        for (int i = 1; i <= 15; i++) {
            S += ((Math.sin(10*i) +  Math.cos((double) 10/i))/ Math.sqrt(i));
        }
        return S;
    }

    public static double f4() {
        double S = 0;
        for (int i = 15; i >= 1; i--) {
            S += ((Math.sin(10*i) +  Math.cos((double) 10/i))/ Math.sqrt(i));
        }
        return S;
    }

    public static void g1(double[] y) {
        y[0] = f1();
    }

    public static void g2(double[] y) {
        y[0] = f2();
    }

    public static void g3(double[] y) {
        y[0] = f3();
    }

    public static void g4(double[] y) {
        y[0] = f4();
    }

    public static void h1(MyDouble y) {
        y.myDouble = f1();
    }

    public static void h2(MyDouble y) {
        y.myDouble = f2();
    }

    public static void h3(MyDouble y) {
        y.myDouble = f3();
    }

    public static void h4(MyDouble y) {
        y.myDouble = f4();
    }
}
