public class lab {
 
    public static void main(String[] args) {
        // TODO Auto-generated method stub
 
        double [][]pointMatrix = {
                {0.5 ,1.2, 
                0.0 ,3.14, 
                15.0, 27.5}         
        };
        
        for (int i=0; i<pointMatrix.length; i++) {
              for (int j=0; j<pointMatrix[i].length; j++){
                System.out.print(pointMatrix[i][j] + " ");
              }
              System.out.println();
            }
 
    }
 
}