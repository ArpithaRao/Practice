import java.util.Scanner;

/**
 * Created by ARPITHA RAO on 17-02-2016.
 */
public class ComplementOfNumber {
    private static int nonLeadingZeroComplement(int a){
        int b = (Integer.highestOneBit(a)<< 1)-1;
        System.out.println(b);
        System.out.println(b^a);
        return b ^ a;
    }

    public static void ConvertBinary(int a) {

        int[] number = new int[40];
        int index = 0;

        while (a>0) {
            number[index++] = a % 2;
            a = a / 2;
        }
        for(int i = index-1;i >= 0;i--)
        System.out.print(number[i]);
        }


    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        System.out.println(nonLeadingZeroComplement(a));
        ConvertBinary(a);

    }
}
