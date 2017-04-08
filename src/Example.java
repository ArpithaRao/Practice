/**
 * Created by ARPITHA RAO on 22-01-2016.
 */
public class Example {
    public static void main(String args[]) {

      System.out.print(Example("pale","paml"));
    }

    public static boolean Example(String s1, String s2){
        boolean foundDifference = false;
        for (int i=0; i< s1.length();i++){
            if(s1.charAt(i)!= s2.charAt(i)){
                if(foundDifference){
                    return false;

                }
                foundDifference = true;
            }
        }
        return true;
    }
}