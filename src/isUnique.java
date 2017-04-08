/**
 * Created by ARPITHA RAO on 20-01-2016.
 */
import java.lang.*;
public class isUnique {

    public static void main(String args[]){

        isUnique isu = new isUnique();
        System.out.print(isu.isUniquechar("arpith1"));

    }
    /*boolean isUniquechar(String str){
        if (str.length()> 128) return false;

        boolean[] char_set = new boolean[128];
        for (int i=0; i< str.length();i++) {
            int val = str.charAt(i);
            if (char_set[val]) {
                return false;
            } char_set[val]= true;
        }return true;

    }*/

    boolean isUniquechar(String str){

        int checker =0;
        for (int i=0; i< str.length(); i++) {
            int val = str.charAt(i)-'a';
            if((checker & (1<< val))>0) {
                return false;
            } checker |= (1<< val);
        }
        return true;}
}
