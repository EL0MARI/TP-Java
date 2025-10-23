import java.util.Scanner;

public class Pairimpair {

    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);
        System.out.println("donner un nombre :");

        int a = sc.nextInt();
        
        if(a % 2 == 0){
            System.out.println("le nombre "+a+" est pair");
        }else{
            System.out.println("le nombre "+a+" est impair !!!");
        }
    }
}
