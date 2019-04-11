import java.util.Random;
import java.util.Scanner;
public class hasMajority {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		Random rnd= new Random();
		int[] A = new int[11];
		int q;
		int k = 1;
		int c = 0; 
		int m = 0;	
//		3 2 2 3 5 6 1 2 2 2 2
		System.out.print("Input : ");
		for(int p = 0; p < A.length; p++) {	
			q = in.nextInt();
			A[p] = q;
		}
		for ( int j = 0 ; j < k ; j++) {
			c = 0;
			m = (A[rnd.nextInt(A.length)]);
			for( int i = 0; i< A.length; i++) {
				if (m == A[i]) {
					++c;
				}
			}
			if (c > (A.length/2)) {
				System.out.println("Output : " +m);
			}else {
				System.out.println("Output : No Majority Element");
			}	
		}
	}
}
