import java.util.Scanner;

public class ArraySum {

    public static void main(String[] args) {
        /*Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner numscan = new Scanner(System.in);
        System.out.println("Enter input array size");
       int  num = numscan.nextInt();
        long[] array;
        array = new long[num];
        System.out.println("Enter elements of the array ");
        Scanner scan = new Scanner(System.in);
        long sum = 0;
        for(int i = 0;i<num;i++) {
            array[i] = scan.nextInt();
            sum += array[i];
        }
        System.out.println("Array sum is "+ sum );



    }
}