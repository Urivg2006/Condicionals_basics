import java.util.Calendar;
public class Entrada {
   public static void main(String[] args) {
      Calendar calendar = Calendar.getInstance();
      int day = calendar.get(Calendar.DAY_OF_WEEK);
      System.out.println("Day: " + day);
      int hour = calendar.get(Calendar.HOUR_OF_DAY);
      System.out.println("Hour: " + hour);
      int minute = calendar.get(Calendar.MINUTE);
      System.out.println("Minute: " + minute);
      if (day==2 || day==3 || day==4 || day==5 || day==6 ) {
        if (hour>=8) {
            if (minute>=1) {
               /*Catalan*/System.out.print("Benvingut a l'aplicació");
               /*English*//*System.out.println("Welcome to the application");*/
            }else {
            }
        }else {
            /*Catalan*/System.out.print("No pots entrar: Encara no són es 08:00 hores!");
            /*English*//*System.out.println("You can't enter: It's not 8:00 am yet!");*/
        }
      }else {
          if (day==7){
              /*Catalan*/System.out.print("NO pots entrar: és dissabte!");
              /*English*//*System.out.println("You can't enter: It's Sunday!");*/
          }else {
              /*Catalan*/System.out.print("No pots entrar: és diumenge!");
              /*English*//*System.out.println("You can't enter: It's Saturday!");*/
          }
      }
   }
}