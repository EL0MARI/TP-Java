import java.util.Scanner;
public class Collatz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez un entier positif : ");
        int n = sc.nextInt();
        int steps = 0;
        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = 3 * n + 1;
            }
            steps++;
        }
        System.out.println("Nombre du etapes : " + steps);
        
    }
}

