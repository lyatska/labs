import java.util.Random;

class MatrixFunctions {
    public static void createMatrix(int[][] a, int n, int k) {
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {
                a[i][j] = -10 + r.nextInt(20);
            }
        }
    }

    public static void printMatrix(int[][] a, int n, int k) {

        for (int i = 0; i < n; i++) {
            StringBuilder s = new StringBuilder();
            for (int j = 0; j < k; j++) {
                s.append(String.format(" %4d |", a[i][j]));
            }
            System.out.println(s);
        }
    }

    public static void checkDiagonalElements(int[][] a, int n, int k) {
        int sum = 0;
        StringBuilder s = new StringBuilder();
        for (int rowIndex = 0; rowIndex < n; rowIndex++) {
            for (int columnIndex = 0; columnIndex < k; columnIndex++) {
                if ((rowIndex == columnIndex) & (a[rowIndex][columnIndex] < 0)) {
                    for (int i = 0; i < n; i ++) {
                        sum += a[rowIndex][i];
                    }
                    s.append(String.format(" %4d ", a[rowIndex][columnIndex]));

                }
            }
        }
        System.out.println("На головній діагоналі матриці є такі від'ємні елементи: " + s);
        System.out.println("Сума елементів матриці, які розміщені в рядках з від’ємним елементом на головній діагоналі дорівнює: " + sum);
    }

    public static void main(String[] args) {
        int rows = 6;
        int columns = 6;
        int[][] a = new int[rows][columns];
        createMatrix(a,rows,columns);
        System.out.println("Матриця має такий вигляд: ");
        printMatrix(a,rows,columns);
        checkDiagonalElements(a, rows,columns);
    }
}