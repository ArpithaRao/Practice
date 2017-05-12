package leetcode;

import java.util.HashSet;

/**
 * Created by ARPITHA RAO on 02-05-2017.
 */
public class IfStringIsInteger {

    public boolean findIfStingIsInteger(String s){
        HashSet<Character> set = new HashSet<>();
        set.add('-');
        set.add('1');
        set.add('2');
        set.add('3');
        set.add('4');
        set.add('5');
        set.add('6');
        set.add('7');
        set.add('8');
        set.add('9');
        set.add('0');

        for(char c:s.toCharArray()){
            if(!set.contains(c)){
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]){
        IfStringIsInteger is = new IfStringIsInteger();
        //test case 1
        System.out.println(is.findIfStingIsInteger("-12345678912"));

        //test case 2
        System.out.println(is.findIfStingIsInteger("-123ohsdf912"));

    }

}
