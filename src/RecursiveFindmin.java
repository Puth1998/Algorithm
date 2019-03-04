public class RecursiveFindmin {
	public static void main(String[] args) {
		  int A[] = {16, 4, -45, 6, 50, 10, 2}; 
//	        int n = A.length; 
	          
	        // Function calling 
	        int m = findMinRec(A,0,A.length-1); 
	        System.out.println(m);
		
	}
	  // function to return minimum element using recursion 
    public static int findMinRec(int A[],int startIndex, int endIndex) 
    { 
    
      if(startIndex == endIndex) 
        return A[startIndex]; 
      
      int mid = (startIndex+endIndex)/ 2;
      
      int m1 = findMinRec(A,startIndex,mid);
      
      int m2 = findMinRec(A,mid+1,A.length-1);
      
     if(m1 < m2 ) {
    	 return m1;
     }
       	return m2; 
    } 
    
}
