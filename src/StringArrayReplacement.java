import java.util.Arrays;

/**
 * Created by ARPITHA RAO on 16-12-2016.
 */
public class StringArrayReplacement {

    public static void main(String args[]){
        int n = 36;

            System.out.println(Arrays.toString(codeFight(n)));
        }


    static String[] codeFight(int n) {

        String [] newArray = new String[n];
        for(int i=0; i<n; i++){


            if((i+1)%5 ==0   && (i+1)%7 ==0 ){
                newArray[i] = "CodeFight";
            }
            else if( (i+1)%5 ==0 ){
                newArray[i] = "Code";
            }
            else if((i+1)%7 ==0){
                newArray[i] = "Fight";
            }

            else{
                newArray[i] = String.valueOf((i+1));
            }

        }

        return newArray;

    }

}
