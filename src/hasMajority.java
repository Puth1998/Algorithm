import java.util.Random;

public class hasMajority {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A= {2,8,7,2,2,5,2,3,1,2,2};
		int k = 2;
		int c = 0;
		
		for ( int j = 0 ; j < k ; k++) {
			c = 0; 
			int m = 1;
			for( int i = 0; i< A.length; i++) {
				if (m == A[i]) {
					++c;
				}
			}
		}
		if (c > (A.length/2)) {
			System.out.println("T************");
		}else {
			System.out.println("F************");
		}
	}
}
