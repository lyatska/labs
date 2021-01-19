import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int rows = 6;
        int columns = 6;
        int[][] a = new int[rows][columns];
        ArrayFunction.createArray(a,rows,columns);
        ArrayFunction.printArray(a,rows,columns);
        int[] small = ArrayFunction.smallestInCol(a,rows,columns);
        System.out.println("Мінімальні елементи кожного стовпця: " + Arrays.toString(small));
        int[] big = ArrayFunction.largestInColumn(a,rows,columns);
        System.out.println("Максимальні елементи кожного стовпця: " + Arrays.toString(big));
        int [][] aa = ArrayFunction.arrayTask(a,rows,columns, small,big);
        ArrayFunction.printArray(aa, rows, columns);
    }
}
