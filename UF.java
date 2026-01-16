import java.util.Scanner;

public class UF {
    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);

        /*Catalan*/System.out.print("Quina és la nota de les activitats de la RA? ");
        /*English*//*System.out.println("What is the grade of the RA activities? ");*/
        double activitats = teclat.nextDouble();

        /*Catalan*/System.out.print("Quina és la nota de les proves de la RA? ");
        /*English*//*System.out.println("What is the grade of the RA tests? ");*/
        double proves = teclat.nextDouble();
        
        /*Catalan: RA=RESULTAT DE APRENENTATGE*/
        /*English: RA=LEARNING RESULT*/
        double notaFinal = (activitats*0.10) + (proves*0.90);

        /*Catalan*/System.out.println("La nota final de la RA és: " + notaFinal);
        /*English*//*System.out.println("The final grade of the RA is: " + notaFinal);*/
        if (notaFinal >= 5) {
            /*Catalan*/System.out.print("Has aprovat");
            /*English*//*System.out.println("You have passed");*/
        }else {
            /*Catalan*/System.out.print("Has suspes");
            /*English*//*System.out.println("You have failed");*/
        }
    }
}
