import java.util.Scanner;

public class Main {
    public static double fak(int n) {
        double out = 1;
        for (int i = 1; i <= n; i++) out *= i;
        return out;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number in order to return n! ");
        int n = sc.nextInt();
        System.out.println(n + "! = " + fak(n));
    }
}