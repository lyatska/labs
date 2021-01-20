import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringsFunctions2 {
    static int findWords(String s) {
        int count = 0;
        String[] words = s.split(" ");
        for (String w: words) {
            if (Character.isLetter(w.charAt(0))) {
                if (w.charAt(0) == w.charAt((w.length() - 1))) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader input  = new BufferedReader(new InputStreamReader(System.in));
        String s;
        System.out.println("Введіть послідовність слів: ");
        s = input.readLine();
        System.out.println("Кількість слів, у яких перша та остання літера співпадають між собою: " + findWords(s));
    }
}
