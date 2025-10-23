import java.util.Scanner;

 public class Triangle {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        int j;
        Scanner sc = new Scanner(System.in);
        System.out.println("donner les angles du triangle : ");
        System.out.print("a = ");
        b = sc.nextInt();
        System.out.print("b = ");
        c = sc.nextInt();
        System.out.print("c = ");
        a = sc.nextInt();
        j = a + b + c;
        if( j != 180){
            System.out.println("les mesures entrez n'est pas valide");
            return;
        }

        if(a == b && b == c){
            System.out.println("le triangle est équilatéral .");
        }
        if(a == b && (c != a) || a == c && (b != a) || c == b && (a != c) ){
            System.out.println("le triangle est isocèle .");
        }
         if(a == 90 || b == 90 || c == 90){
            System.out.println("le triangle est scalène .");
        }
    }
}
