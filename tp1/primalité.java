import java.util.Scanner;

public class primalité {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = 0;
        for(int i = 1;i<Math.sqrt(n);i++){
            if( n == 0 || n == 1){
                return;
            }
            if(n%i==0){
                k++;
            }
        }
        if(k == 1){
            System.out.println("le nombre "+n+" est premier .");
        }else{
            System.out.println("le nombre "+n+" n'est pas premier .");
        }
    }
}
