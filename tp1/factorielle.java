import java.util.Scanner;

public class factorielle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("donner un nombre :");
        int a = sc.nextInt();
        int f = 1;
        for(int i = 1;i <= a;i++){
            f = f * i;
        }
        System.out.println("la factorielle du "+a+" est : "+f);
    }
}
