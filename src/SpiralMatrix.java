/**
 * Created by ARPITHA RAO on 09-03-2016.
 */
public class SpiralMatrix {
    public static void main(String args[]){
        int[][] array = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

        int i, k = 0, l = 0, m = array.length, n = array[0].length;

        while(k< m && l < n){
            /* to print first row*/
            for(i = l; i< n; i++){
                System.out.print(array[k][i]+" ");
            }
            k++;
            /* to print last column*/
            for(i = k; i < m ; i++){
                System.out.print(array[i][n-1]+" ");
            }
            n--;
            /* to print last row*/
            for(i = n-1; i >= l; i--){
                System.out.print(array[m-1][i]+" ");
            }
            m--;
            /* to print first column*/
            for(i = m-1; i>=k; i--){
                System.out.print(array[i][l]+" ");
            }
            l++;
        }
    }
}
