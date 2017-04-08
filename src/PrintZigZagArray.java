/**
 * Created by ARPITHA RAO on 04-03-2016.
 */
public class PrintZigZagArray {

    public static void main(String args[]){
        int[][] array = {{0,1,2,3}, {0,1,2,3},  {0,1,2,3},  {0,1,2,3} };

        for(int i=0; i< array.length; i++){
            int j = 0;
            if(j==0){
                for(j=0; j< array[0].length; j++){
                    System.out.print(array[i][j]);
                }
//                j = array[0].length;
            }

               for(j= array[0].length-1; j>=0;j--){
                   System.out.print(array[i][j]);

            }

        }

    }
}
