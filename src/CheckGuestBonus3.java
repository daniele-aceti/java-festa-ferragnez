
//BONUS RISULTATO SOLO UN VALORE SEI O NON SEI IN LISTA


import java.util.Scanner;

public class CheckGuestBonus3 {

    public static void main(String[] args) {
        String[] guestStar = {"dua lipa", "paris hilton", "manuel agnelli", "j-ax","francesco totti", "ilary blasi", 
        "bebe vio", "luis","pardis zarei","martina maccherone", "rachel zeilic"};

        Scanner scan = new Scanner(System.in);

        System.out.println("inserisci nome e cognome");
        String textname = scan.nextLine();
        String userName = textname.toLowerCase();


        //assegno un valore ad indexName che non è presente come indice nell'array
        int indexName = -1;
        //ciclo l'array fino a trovare l'indice del nome inserito
        for(int index = 0; index < guestStar.length; index++){
            if(guestStar[index].equals(userName)){
                indexName = index;
            }
        }
        //verifico se esiste l'indice individuato quindi un numero da 0 alla lunghezza dell'array
        if( indexName >= 0 &&  indexName < guestStar.length){
             System.out.println("Sei in lista");
        }else{
            System.out.println("Non sei in lista");
        }


        //ricerca con un booleano 
        boolean indexName2 = false;
        //ciclo l'array 
        for(int index = 0; index < guestStar.length; index++){
            if(guestStar[index].equals(userName)){
                indexName2= true;
            }
        }
        //verifico 
        if( indexName2){
             System.out.println("Sei in lista");
        }else{
            System.out.println("Non sei in lista");
        }






    }
    
}
