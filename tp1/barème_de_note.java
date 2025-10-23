 import java.util.Scanner;

public class barème_de_note {
   

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tapez la note : ");
        int j = sc.nextInt();
        switch (j) {
            case 0: 
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9: System.out.println("F");
                break;
            case 10:
            case 11: System.out.println("D");
                break;
            case 12:
            case 13: System.out.println("C");
                break;
            case 14:
            case 15: System.out.println("B");
                break;
            case 16:
            case 17:
            case 18:
            case 19:
            case 20: System.out.println("A");
                break;
            default:
                System.out.println("Veuillez entrer une note entre 0 et 20.");
                break;
        }
        sc.close();
    }
}

