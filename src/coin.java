import java.util.Scanner;

public class coin {

   public static void main(String[] args) {
      int coin_10, coin_5, coin_2, coin_1; 
      int money, remain; 
      
      remain = money = coin_10 = coin_5 = coin_2 = coin_1 = 0; 
      Scanner scan = new Scanner(System.in); 
      System.out.println("Please enter your money."); 
      money = scan.nextInt(); 

      coin_10 = money / 10; 
      remain = money % 10;  
      coin_5 = remain / 5;  
      remain = remain % 5;  
      coin_2 = remain / 2;  
      remain = remain % 2;  
      coin_1 = remain;       

      
      System.out.println("10 = " + coin_10 + " coins.");
      System.out.println("5 = " + coin_5 + " coins.");
      System.out.println("2 = " + coin_2 + " coins.");
      System.out.println("1 = " + coin_1 + " coins.");
   }
}