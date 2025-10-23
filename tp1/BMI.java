import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        System.out.print("Entrez votre masse (kg) : ");
        
        double masse = Double.parseDouble(sc.nextLine().replace(",", "."));

        System.out.print("Entrez votre taille (m) : ");
        
        double taille = Double.parseDouble(sc.nextLine().replace(",", "."));

 
        double imc = masse / (taille * taille);


        System.out.printf("Votre IMC est : %.2f\n", imc);

    }
}
