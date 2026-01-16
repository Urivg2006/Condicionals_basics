import java.util.Scanner;

public class Nota {

    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);
        /*Catalan*/System.out.print("Fica la nota entre (0-10):");
        /*English*//*System.out.println("Enter the grade between (0-10):");*/
        double nota = teclat.nextDouble();
        if (nota>=9 ) {
            /*Catalan*/System.out.print("Tens un excelent!!😊");
            /*English*//*System.out.println("You have an excellent!!😊");*/
        }else if (nota>=7){
            /*Catalan*/System.out.print("Tens un notable!!💪🏻");
            /*English*//*System.out.println("You have a notable!!💪🏻");*/
        }else if (nota>=6) {
            /*Catalan*/System.out.print("Tens un suficient");
            /*English*//*System.out.println("You have a sufficient");*/
        }else if (nota>=5) {
            /*Catalan*/System.out.print("Tens un suficient");
            /*English*//*System.out.println("You have a sufficient");*/
        }else {
            /*Catalan*/System.out.print("Tens un insuficient😢");
            /*English*//*System.out.println("You have an insufficient😢");*/
        }


    }
}
