import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("entrez un nombre : ");
        int k = sc.nextInt();

        int a = 0;
        int b = 1;
        int c;

        System.out.print("la serie de fibonacci :");
        for (int i = 0; i < k; i++) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
    }
}
