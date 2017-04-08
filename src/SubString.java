/**
 * Created by ARPITHA RAO on 27-01-2016.
 */
public class SubString {
    static int longest_chain(String[] w) {

        int max_len = w[0].length();
        for (int i = 0; i < w.length; i++) {
            if (w[i].length() > max_len) {
                max_len = w[i].length();
            }
            String str = w[i];
            char[] c = str.toCharArray();
            String new_Str = "";
            for (int j = 0; j < c.length; j++) {
                if (i==0)
                    new_Str += c[i];
            }
        }return max_len-1;

    }
        public static void main(String args[]){
            SubString sub = new SubString();
            String [] arr = {"abnce", "lkhmnbmn"};
            System.out.print(sub.longest_chain(arr));

    }


    }


