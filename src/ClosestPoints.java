
public class ClosestPoints {
	public static void main(String [] args) {
		
		double dmin =  Double.POSITIVE_INFINITY;
		int[][] p = {{2,4},
					{3,6},
					{2,9},
					{5,5}};
		double d;
		int k = 0 , l = 0 ;
		for( int i = 0 ; i < p.length ; i++ ) {
			for( int j = i+1 ; j < p.length ; j++) {
			int p1 = p[i][0]-p[j][0];
			int p2 = p[i][1]-p[j][1];
			d = Math.sqrt((Math.pow(p1,2))+(Math.pow(p2,2)));
			System.out.println(+p[i][0]+","+p[i][1]+" And "+p[j][0]+","+p[j][1]+" distance : "+d);
				if (d<=dmin){
					dmin = d;
					k = i;
					l = j;
				}
			}
		}
		System.out.println("Closest-Pair is =>"+p[k][0]+","+p[k][1]+" and "+p[l][0]+","+p[l][1]+" have distance :"+dmin);	
	}

}
