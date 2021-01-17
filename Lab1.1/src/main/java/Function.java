public class Function {
    public static double f(double x, double y) {
        double divisor = Math.pow(x, 2) + Math.pow(y, 2);
        double denominator = 1 + Math.pow(x, 2) + Math.pow(x, 2) * Math.pow(y, 2);
        return divisor/denominator;
    }
    public static void g(double x, double y, double[] z) {
        z[0] = f(x, y);
    }
    public static void h(double x, double y, MyDouble z) {
        z.myDouble = f(x,y);
    }
}
