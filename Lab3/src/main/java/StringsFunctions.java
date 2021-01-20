import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringsFunctions {
    static boolean searchFor(String s) {
        return (s.contains("ab") || s.contains("cd"));
    }

    static String replaceChars(String s) {
        s = s.replaceAll("ab cd" , "**");
        return s;

    }

    public static void main(String[] args) throws IOException {
        BufferedReader input  = new BufferedReader(new InputStreamReader(System.in));
        String s;
        System.out.println("Введіть послідовність символів: ");
        s = input.readLine();
        System.out.println("Серед даних символів присутня четвірка сусідніх abcd: " + searchFor(s));
        System.out.println("Після заміни символів стрічка вигядає так: " + replaceChars(s));
    }
}
