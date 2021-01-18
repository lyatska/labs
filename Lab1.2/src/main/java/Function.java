public class Function {
    public static double fullF1(double a, double b, double c, double x) {
        double F;
        if ((a < 0) && (x != 0)) {
            F = a * Math.pow(x, 2) + Math.pow(b, 2) * x;
        }
        else if ((a > 0) && (x == 0)) {
            if (x == c){
                throw new IllegalArgumentException("Дані аргументи не можуть бути однакові, адже результат " +
                        "їнхнього віднімання не може бути рівним нулю за даних умов");
            } else {
                F = x - (a / (x - c));
            }
            }
        else {
            if (c == 0) {
                throw new IllegalArgumentException("Даний аргумент не може дорівнювати нулю.");
            } else {
                F = 1 + x/c;
            }
        }
        return F;
    }
    public static double shortF1(double a, double b, double c, double x) {
        double F = -1;
        if ((a < 0) && (x != 0)) {
            F = a * Math.pow(x, 2) + Math.pow(b, 2) * x;
        }
        if ((a > 0) && (x == 0)) {
            if (x == c){
                throw new IllegalArgumentException("Дані аргументи не можуть бути однакові, адже результат " +
                        "їнхнього віднімання не може бути рівним нулю за даних умов");
            } else {
                F = x - (a / (x - c));
            }
        }
        if (!((a < 0) && (x != 0)) && !((a > 0) && (x == 0))) {
            if (c == 0) {
                throw new IllegalArgumentException("Даний аргумент не може дорівнювати нулю.");
            } else {
                F = 1 + x/c;
            }
        }
        return F;
    }
    public static void fullG1(double a, double b, double c, double x, double[] y) {
        double F;
        if ((a < 0) && (x != 0)) {
            F = a * Math.pow(x, 2) + Math.pow(b, 2) * x;
        }
        else if ((a > 0) && (x == 0)) {
            if (x == c){
                throw new IllegalArgumentException("Дані аргументи не можуть бути однакові, адже результат " +
                        "їнхнього віднімання не може бути рівним нулю за даних умов");
            } else {
                F = x - (a / (x - c));
            }
        }
        else {
            if (c == 0) {
                throw new IllegalArgumentException("Даний аргумент не може дорівнювати нулю.");
            } else {
                F = 1 + x/c;
            }
        }
        y[0] = F;
    }

    public static void shortG1(double a, double b, double c, double x, double[] y) {
        double F = -1;
        if ((a < 0) && (x != 0)) {
            F = a * Math.pow(x, 2) + Math.pow(b, 2) * x;
        }
        if ((a > 0) && (x == 0)) {
            if (x == c){
                throw new IllegalArgumentException("Дані аргументи не можуть бути однакові, адже результат " +
                        "їнхнього віднімання не може бути рівним нулю за даних умов");
            } else {
                F = x - (a / (x - c));
            }
        }
        if (!((a < 0) && (x != 0)) && !((a > 0) && (x == 0))) {
            if (c == 0) {
                throw new IllegalArgumentException("Даний аргумент не може дорівнювати нулю.");
            } else {
                F = 1 + x/c;
            }
        }
        y[0] = F;
    }

    public static void fullH1(double a, double b, double c, double x, MyDouble y) {
        double F;
        if ((a < 0) && (x != 0)) {
            F = a * Math.pow(x, 2) + Math.pow(b, 2) * x;
        }
        else if ((a > 0) && (x == 0)) {
            if (x == c){
                throw new IllegalArgumentException("Дані аргументи не можуть бути однакові, адже результат " +
                        "їнхнього віднімання не може бути рівним нулю за даних умов");
            } else {
                F = x - (a / (x - c));
            }
        }
        else {
            if (c == 0) {
                throw new IllegalArgumentException("Даний аргумент не може дорівнювати нулю.");
            } else {
                F = 1 + x/c;
            }
        }
        y.myDouble = F;
    }

    public static void shortH1(double a, double b, double c, double x, MyDouble y) {
        double F = -1;
        if ((a < 0) && (x != 0)) {
            F = a * Math.pow(x, 2) + Math.pow(b, 2) * x;
        }
        if ((a > 0) && (x == 0)) {
            if (x == c){
                throw new IllegalArgumentException("Дані аргументи не можуть бути однакові, адже результат " +
                        "їнхнього віднімання не може бути рівним нулю за даних умов");
            } else {
                F = x - (a / (x - c));
            }
        }
        if (!((a < 0) && (x != 0)) && !((a > 0) && (x == 0))) {
            if (c == 0) {
                throw new IllegalArgumentException("Даний аргумент не може дорівнювати нулю.");
            } else {
                F = 1 + x/c;
            }
        }
        y.myDouble = F;
    }
}
