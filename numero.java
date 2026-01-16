import java.util.Scanner;
public class numero {

    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);
        /*Catalan*/System.out.print("Introdueix un nombre enter: ");
        /*English*//*System.out.println("Enter a number: ");*/
        int nombre = teclat.nextInt();
        if (nombre>=1) {
            /*Catalan*/System.out.print("El nombre es positiu: " + nombre);
            /*English*//*System.out.println("The number is positive: " + nombre);*/
        }else if (nombre<=-1) {
            /*Catalan*/System.out.print("El nombre es negatiu:" + nombre);
            /*English*//*System.out.println("The number is negative: " + nombre);*/
        }else {
            /*Catalan*/System.out.print("El nombre es 0 ");
            /*English*//*System.out.println("The number is 0");*/
        }
    }
}