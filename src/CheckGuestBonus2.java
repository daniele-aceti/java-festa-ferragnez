
import java.util.Scanner;

public class CheckGuestBonus2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] guestStar = {"dua lipa", "paris hilton", "manuel agnelli", "j-ax","francesco totti", "ilary blasi", 
        "bebe vio", "luis","pardis zarei","martina maccherone", "rachel zeilic"};

         //inserimento del nome utente
         System.out.println("Digita il tuo nome cognome");
         String userText = scan.nextLine();
         String userName = userText.toLowerCase();


         int indexList = -1;
         int index = 0;
         while (index < guestStar.length) {
            index++;
            if(guestStar[index].equals(userName)){
                indexList = index;
            }
            if(indexList == -1){
                System.out.println("Non sei in lista");
            }else{
                System.out.println("Sei in lista");
                break;
            }
            }
            
         }


    }
    

