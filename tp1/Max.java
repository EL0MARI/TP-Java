import java.util.Scanner;


public class Max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] T = new int[3];
        int max;
        for(int i = 0;i<3;i++){
            System.out.println("T["+i+"] = ");
            T[i] = sc.nextInt();
        }
        max = T[0];
        for(int i = 0;i<3;i++){
            
            if(T[i]>max){
                max = T[i];
            }
            
        }
        System.out.println("le plus grand nombre est : "+max);
    }
}
