import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String Args[]) {
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        String name = "";
        String w = "";
        Pattern pat = Pattern.compile("^[^A-Z]{1}[a-z0-9]{1,9}([A-Z]{1}[a-z0-9]{1,9}){1,}");
        Matcher c = pat.matcher(a);
        StringBuilder str = new StringBuilder();
        while (c.find()) {
            System.out.println("Это язык java");
            name = "java";
        }
        Pattern pat2 = Pattern.compile("([a-z]{1,9}+\\_[a-z]{1,9}){1,}");
        Matcher x = pat2.matcher(a);
        while (x.find()) {
            System.out.println("Это язык C++");
            name = "c++";
        }
        if (name.equals("java")) {
            for (int i = 0; i < a.length(); i++) {
                if ('A' <= a.charAt(i) && a.charAt(i) <= 'Z') {
                    str.append('_');
                    str.append(Character.toLowerCase(a.charAt(i))); //класс оболочка кэрактер, который содержит метод toLowerCase который заменяет символы на маленькие
                    continue;
                }
                str.append(a.charAt(i));
            }
            System.out.println(str.toString());
        }
        int k = 0;
        if (name.equals("c++")) {
            str.append(a.charAt(0));
            for (int i = 0; i < a.length(); i++) {
                if ('_' == a.charAt(i)) {
                    str.append(Character.toUpperCase(a.charAt(i+1)));
                    k = i +1;
                    continue;
                }

                if (i != k ) {
                    str.append(a.charAt(i));
                }
            }
            System.out.println(str.toString());
        }
    }
}
