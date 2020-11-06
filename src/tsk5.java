import java.lang.*;
import java.util.Scanner;

public class tsk5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = recursion(n);
        System.out.println("Chislo = " + n);
        System.out.println("Summa cifr = " + m);

    }

    public static int recursion(int m) {
        if (m / 10 >= 1) {
            int tempvar = m % 10;
            int remain = m / 10;
            return tempvar + recursion(remain);
        } else {
            return m;
        }
    }
}
