
import java.util.Scanner;

public class CheckGuest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] guestStar = {"dua lipa", "paris hilton", "manuel agnelli", "j-ax","francesco totti", "ilary blasi", 
                             "bebe vio", "luis","pardis zarei","martina maccherone", "rachel zeilic"};

        //inserimento del nome utente
        System.out.println("Digita il tuo nome cognome");
        String userText = scan.nextLine();
        String userName = userText.toLowerCase();
        
        for(int index = 0; index < guestStar.length; index++){

             String list = guestStar[index];
            if(!list.equals(userName)){
                System.out.println("Non nella lista");
            }else{
                System.out.println("Sei nella lista");
                break;
            }
        }
      } 
    }
