package leetcode;

/**
 * Created by ARPITHA RAO on 11-04-2017.
 */
public class ReverseStringIII {

    public String reverse(String input){

        String newInput = reverseTheString(input);
            String[] strings = newInput.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < strings.length; i++){
            sb.append(reverseTheString(strings[i]));
              if(i<strings.length-1) sb.append(" ");

        }
        return sb.toString();
    }

    public String reverseTheString(String string){
        StringBuilder sb = new StringBuilder();
        for(int i = string.length()-1; i>=0;i--){
            sb.append(string.charAt(i));
        }
        return sb.toString();
    }

    public static void main(String arg[]){
        String s = "Let's take LeetCode contest";
        ReverseStringIII rs = new ReverseStringIII();
        System.out.println(rs.reverse(s));
       // Assert.assertEquals(rs.reverse(s),"s'teL ekat edoCteeL tsetnoc");
    }

}
