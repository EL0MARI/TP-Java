import java.util.Scanner;

public class cercle {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("donner le rayon du cercle : ");
        double a = sc.nextInt();
        double p = a * a * 3.14;
        System.out.println("le rayon du circle est : "+p);
    }
}
