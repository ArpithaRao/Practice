package GeeksForGeeks;

/**
 * Created by ARPITHA RAO on 25-01-2017.
 */
public class StringToNumWithComma {

    public static void main(String [] args){

        int sampleInput = 123456789;
        System.out.println(formatNum(sampleInput));
    }

    public static String formatNum(int num) {

        int total_processed = 0;
        String ret = "";

        while (num > 0){
            if (total_processed != 0 && total_processed %3 == 0)
                ret += ",";
            ret += (char) (num %10 + '0');
            total_processed ++;
            num /= 10;
        }

        StringBuilder sb = new StringBuilder(ret);
        ret = sb.reverse().toString();

        return ret;
    }
}
