/**
 * Created by ARPITHA RAO on 09-03-2016.
 */
public class RemoveSpaces {
    public static void main(String args[]){
        String string = "ge   eks   for   ge   ek  s hare krishna";
        StringBuilder str = new StringBuilder();
        char[] ch = string.toCharArray();
        for(int i = 0; i < ch.length; i++){
            if(ch[i]!=' '){
               str.append(ch[i]);
            }
        }
        System.out.print(str);
    }
}
