package leetcode;

import java.util.ArrayList;

/**
 * Created by ARPITHA RAO on 02-05-2017.
 */
public class ToggleLocker {

    public ArrayList<Integer> findOpenLockers(int n){
        ArrayList<Integer> result = new ArrayList<>();
        for(int i = 0; i <=n; i++){
            if(i*i<=n){
                result.add(i*i);
            }
        }
        return result;
    }

    public static void main(String args[]){
        ToggleLocker tl = new ToggleLocker();
        System.out.println(tl.findOpenLockers(100));
    }

}
