package CodingChallenges;

/**
 * Created by ARPITHA RAO on 23-05-2017.
 */
public class DecimalZip {

    long result;
    public long calculateDecimalZip(long a, long b) {
        if ((a < 0 || a > 100000000) || ((b < 0 || b > 100000000))) {
            return -1;
        }
        char[] arrayFirstNumber = String.valueOf(a).toCharArray();
        char[] arraySecondNumber = String.valueOf(b).toCharArray();
        String aux = "";
        for (int i = 0; i < arrayFirstNumber.length || i < arraySecondNumber.length; i++) {
            if (i < arrayFirstNumber.length) {
                aux += arrayFirstNumber[i];
            }
            if (i < arraySecondNumber.length) {
                aux += arraySecondNumber[i];
            }
        }
        result = Long.parseLong(aux);
        if (result > 100000000) {
            return -1;
        }
        return result;

    }

    public static void main(String args[]){
        DecimalZip dc = new DecimalZip();
        long res = dc.calculateDecimalZip(12,56);
        System.out.println(res);
    }

}
