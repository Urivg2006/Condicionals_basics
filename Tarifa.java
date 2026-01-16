import java.util.Scanner;
public class Tarifa {
public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        /*Catalan*/System.out.print("Indica una zona d'enviament (A, B o C): ");
        /*English*//*System.out.println("Enter a shipping zone (A, B or C): ");*/
        char zona = teclat.next().charAt(0);

        /*Catalan*/System.out.print("Quin és el pes del paquet? ");
        /*English*//*System.out.println("What is the weight of the package? "); */
        double pes = teclat.nextDouble();
        int preu = 0;
        preu = switch (zona) {
        case 'A', 'a' -> 5;
        case 'B', 'b' -> 7;
        default -> 9;
    };
        
        double preu_total = preu;
        if (pes < 1) {
            preu_total = preu; // +0%
        }
        if (pes >= 1 && pes <= 5) {
            preu_total = preu * 1.20; // +20%
        }
        if (pes > 5) {
            preu_total = preu * 1.50; // +50%
        }

        /*Catalan*/System.out.println("El cost total és: " + preu_total + " €");
        /*English*//*System.out.println("The total cost is: " + preu_total + " €");*/
    }
}

