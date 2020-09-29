import java.util.Scanner;

public class Work10 {
    public static void main(String Args[]) {
        Scanner scan = new Scanner(System.in);
        String str_str = scan.nextLine();
        StringBuilder st = new StringBuilder();
        for (int i = 0; i < str_str.length(); i++) {
            st.append(str_str.charAt(i));
            for (int x = 0; x < str_str.length()-i; x++) {
                System.out.print(" ");
            }
            System.out.println(st);
        }
        for (int y = st.length(); y > 0; y--) {
            st.delete(0, 1);
            System.out.println(st);
        }
    }
}
