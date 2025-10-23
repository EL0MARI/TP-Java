import java.util.Scanner;

public class Somme {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("entre un nombre a = ");
        int a = sc.nextInt();
        System.out.print("entre un nombre b = ");
        int b = sc.nextInt();
        int c = a + b;
        System.out.println("la somme de a et b egal : "+c);
    }
    
}