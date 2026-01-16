import java.util.Scanner;
public class Cinema {
public static void main(String[] args) {
    Scanner teclat = new Scanner(System.in);
        /*Catalan*/System.out.print("Indica de quin tipus de dia disposa: (Laborable=L, Cap de setmana=C  )");
        /*English*//*System.out.println("Indicate what type of day you have: (Workday=L, Weekend=C)");*/
        char tipus_entrada = teclat.next().charAt(0);
        /*Catalan*/System.out.print("Disposa de carnet Jove (S/N)");
        /*English*//*System.out.println("Has a Youth ID card (Y/N)");*/
        char descompte = teclat.next().charAt(0);
        double entrada=5;
        if (descompte=='S' || descompte=='s'){
            entrada=entrada*0.15;
        }
        if (tipus_entrada=='C' || tipus_entrada=='c' ) {
            entrada=entrada*0.10;
        }
        /*Catalan*/System.out.print("L'entrada val" + entrada);
        /*English*//*System.out.println("The ticket costs " + entrada);*/
    }
}