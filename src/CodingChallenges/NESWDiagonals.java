package CodingChallenges;

/**
 * Created by ARPITHA RAO on 03-05-2017.
 */
public class NESWDiagonals {

    public void printDiagonals(int[][] arr){

        int N = arr.length, M = arr[0].length;

        for (int i = N - 1; i >= 0; i--) {
            int row = i;
            int col = 0;
            while (row < N && col < M) {
                System.out.print(arr[row][col] + "  ");
                row++;
                col++;
            }
            System.out.println();
        }

        for (int j = 1; j < M; j++) {
            int col = j;
            int row = 0;
            while (col < M && row < N) {
                System.out.print(arr[row][col] + "  ");
                col++;
                row++;
            }
            System.out.println();
        }

    }

    public static void main(String args[]){
        int[][] input = {{1,2,3,4},
                         {5,6,7,8},
                         {9,10,11,12},
                         {13,14,15,16}};
        NESWDiagonals nd = new NESWDiagonals();
        nd.printDiagonals(input);
    }

}
