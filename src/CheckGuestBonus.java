
import java.util.Scanner;

public class CheckGuestBonus {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String [] guestStar = {"dua lipa", "paris hilton", "manuel agnelli", "j-ax","francesco totti", "ilary blasi", 
                             "bebe vio", "luis","pardis zarei","martina maccherone", "rachel zeilic"};
        
        System.out.println("Inserisci il tuo nome e cognome");
        String textUser = scan.nextLine();
        String userName = textUser.toLowerCase();

        int index = 0;
        while(index < guestStar.length){
            if(!guestStar[index].equals(userName)){
                System.out.println("Non sei in lista");
            }else{
                System.out.println("Sei in lista");
                break;
            }
            index++;
        }

        





    }
}
