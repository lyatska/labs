import java.util.Random;

public class ArrayFunction {
    public static void createArray(int[][] a, int n, int k) {
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {
                a[i][j] = -10 + r.nextInt(20);
            }
        }
    }
    public static void printArray(int[][] a, int n, int k) {

        for (int i = 0; i < n; i++) {
            StringBuilder s = new StringBuilder();
            for (int j = 0; j < k; j++) {
                s.append(String.format(" %4d |", a[i][j]));
            }
            System.out.println(s);
        }
    }

    static int[] smallestInCol(int[][] a, int n, int m) {

        String s ="";
        for (int i = 0; i < m; i++) {
            int minm = a[0][i];
            for (int j = 1; j < n; j++) {
                if (a[j][i] < minm) {
                    minm = a[j][i];
                }
            }

            s+=minm + ", ";
        }
        String[] parts = s.split(", ");
        int[] n1 = new int[parts.length];
        for(int r = 0; r < parts.length; r++) {
            n1[r] = Integer.parseInt(parts[r]);
        }
        return n1;
    }

    public static int[] largestInColumn(int[][] a, int n, int m) {
        String s = "";

        for (int i = 0; i < m; i++) {
            int maxm = a[0][i];
            for (int j = 1; j < n; j++) {
                if (a[j][i] > maxm) {
                    maxm = a[j][i];
                }
            }
            s += maxm + ", ";
        }

        String[] parts = s.split(", ");
        int[] n1 = new int[parts.length];
        for(int r = 0; r < parts.length; r++) {
            n1[r] = Integer.parseInt(parts[r]);
        }
        return n1;
    }

    public static int[][] arrayTask(int[][] a, int n, int k, int[] small, int[] big) {
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < n; j++) {
                if ((i+1) % 2 == 0) {
                    if (a[j][i] == small[i]) {
                        a[j][i] = big[i-1];
                    }
                } else {
                    if (a[j][i] == big[i]) {
                        a[j][i] = small[i+1];
                    }
                }
            }
        }
        return a;
    }
}
