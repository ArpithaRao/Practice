/**
 * Created by ARPITHA RAO on 20-01-2016.
 */
public class permut {
    public static  void main(String args[]){
        permut p = new permut();
        System.out.print(p.ispermut("Arpitha", "Arpi"));

    }
   /* String sort(String s){
        char[] content = s.toCharArray();
        java.util.Arrays.sort(content);
        return new String(content);
    }
    boolean ispermut(String s, String t){
        if (s.length()!= t.length())
        { return false;
        }
    return  sort(s).equals(sort(t));
    }*/

    boolean ispermut(String s, String t){

    if (s.length()!= t.length())
        { return false;
        }

        int letters[]=new int[128];
        char[] s_array = s.toCharArray();
        for (char c : s_array){
            letters[c]++;// count every char in char array
        }
        for(int i=0; i<t.length();i++){
            int c = (int) t.charAt(i);
            letters[c]--;
            if(letters[c]<0){
                return false;
            }
        }return true;

    }

}
