/**
 * Created by ARPITHA RAO on 24-01-2016.
 */
public class FindZero {
    public static void main(String args[]){

        int [][] matrix = {{1,2,3,4},
                            {1,2,0,4},
                             {1,2,3,4},
                             {1,2,3,4},};

        for (int i=0; i< matrix.length; i++){
            for (int j=0; j<matrix[0].length; j++){
               if(matrix[i][j]==0){
                   matrix[i][0]=0;
                   matrix[0][j]=0;
                   System.out.println(matrix[i][0]);
                   System.out.println(matrix[0][j]);
                   System.out.println(matrix[2]);
                   System.out.println(matrix[1]);

               }
            }
        }

    }
}
