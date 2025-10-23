import java.util.Scanner;

public class Sommeàn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("donner un nombre :");
        int n = sc.nextInt();
        int s = 0;
        System.out.println("avec for :");
        for(int i = 1;i <= n;i++){

            s = s + i;
        }
        System.out.println("la somme de 1 a "+n+" est : "+s);
        System.out.println("avec while :");
        int i = 1;
        s = 0 ;
        while (i <= n) {
            s = s + i;
            i++;
        }
        System.out.println("la somme de 1 a "+n+" est : "+s);
    }
}
