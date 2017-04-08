package HackerRank;

import java.util.*;

/**
 * Created by ARPITHA RAO on 18-01-2017.
 */
public class SparseArray {

    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int strings = scan.nextInt();
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < strings; i++){
            String str = scan.next();

            if(map.containsKey(str)){
                map.put(str, map.get(str)+1);

            }else{
                map.put(str, 1);
            }
        }
        int query = scan.nextInt();
        List<String> queryList = new ArrayList<>();
        for(int i = 0; i < query; i++ ){
            String str = scan.next();
            queryList.add(str);
        }
        for(int i = 0; i < queryList.size(); i++) {
            if (map.containsKey(queryList.get(i))) {
                System.out.println(map.get(queryList.get(i)));
            } else {
                System.out.println("0");
            }
        }
    }

}
