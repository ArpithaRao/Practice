package Algorithms.DynamicProgramming;

/**
 * Created by ARPITHA RAO on 22-04-2017.
 */
public class MaxRectangleInMatrix {

    public int maxArea(int[][] matrix){

        int[] temp = new int[matrix[0].length];

        for(int i = 0; i < matrix[0].length; i++){
            temp[i] = matrix[0][i];
        }

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0 ; j < matrix[0].length; j++){
                if(matrix[i][j] == 0){
                    temp[j] = 0;
                }
                else{
                    temp[j] += matrix[i][j];
                }
            }
        }
        System.out.print("temp: ");
        for(int i = 0; i < temp.length; i++){
            System.out.println(temp[i]+" ");
        }
        int max = findHistogramArea(temp);

        System.out.println("max "+max);
        return max;
    }

    public int findHistogramArea(int[] array){
        int min = Integer.MAX_VALUE;
        int count = 0;

        for(int i = 0; i < array.length; i++){
            if(array[i] == 0) {
                i = i+1;
            }
            if(array[i]!=0) {
                count++;
                if( array[i]<min){
                    min = array[i];
                }
            }
        }

        System.out.println("min "+min);
        System.out.println("count "+count);

        return count* min;

    }

    public static void main(String[] args){
        MaxRectangleInMatrix maxRect = new MaxRectangleInMatrix();
        int[][] input = {{1, 0, 0, 1, 1, 1},
                         {1, 0, 1, 1, 0, 1},
                         {0, 1, 1, 1, 1, 1},
                         {0, 0, 1, 1, 1, 1}};
        int max = maxRect.maxArea(input);
        System.out.println("Max Area: "+max);
    }

}
