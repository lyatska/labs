import java.io.*;
import java.util.Random;

public class TextFunctions {
    static void createFile(String name) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(name));
        Random random = new Random();

        for (int i = 0; i < 20; i++) {
            String text = Double.toString((random.nextDouble() *(100)) - 50);
            bw.write(text+'\n');
        }
        bw.flush();
    }

    static void rewriteFile(String name1, String name2) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(name1));
        BufferedWriter bw = new BufferedWriter(new FileWriter(name2));

        String s;
        while ((s = br.readLine()) != null) {
            double n = Double.parseDouble(s);
            if (n > 0) {
                String text = Double.toString(n);
                bw.write(text+'\n');
            }
        }
        bw.flush();
    }

    static void printFile(String name) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(name));
        String s;
        while ((s = br.readLine()) != null) {
            System.out.println(s);
        }
        System.out.println();
    }

    public static void main(String[] args) throws IOException {
        createFile("real_numbers.txt");
        printFile("real_numbers.txt");
        rewriteFile("real_numbers.txt", "real_numbers_rewritten.txt");
        printFile("real_numbers_rewritten.txt");
    }
}
