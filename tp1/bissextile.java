import java.util.Scanner;
public class bissextile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("donner annee convonable : ");
        int annee = sc.nextInt();
        if(annee % 4 == 0 || annee % 400 == 0){
            if(annee % 100 != 0)
                System.out.println("l'annee "+annee+" est bissextile .");
            else{System.out.println("l'annee "+annee+" n'est pas bissextile .");}
        }else{
            System.out.println("l'annee "+annee+" n'est pas bissextile .");
        }
    }
}
