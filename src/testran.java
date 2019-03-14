import java.util.Random;

/**
 *
 * @author Muthu
 */
public class testran {
    public static void main(String[] args) {
     for(int i=0;i<5;i++){
         rndFunc();
     } 
    }
     public static void rndFunc(){
           int[]a= new int[]{1,2,3};
           Random rnd= new Random();
           System.out.println(a[rnd.nextInt(a.length)]);
       }
}