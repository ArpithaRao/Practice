/**
 * Created by ARPITHA RAO on 06-03-2016.
 */
public class ReverseLine {
    public static void main(String args[]){
       /* String[] givenLine = "Jai Radhe Krsna".split(" ");
        String reverse = "";
         for(int str = givenLine.length-1; str >=0; str-- ){
             reverse += givenLine[str]+" ";
         }
        System.out.println(reverse);
        char[] ch = {'a','b','c','d','e','f'};*/

        String statement = "Jai Radhe Krsna";
        System.out.println(reverseAllWords(statement));
    }

  public static String reverseAllWords(String s) {
    String reversedWords = "";

    if(s.length()<=0) {
        return reversedWords;
    }else if(s.length() == 1){
        if(s == " "){
            return "";
        }
        return s;
    }

    char arr[] = s.toCharArray();
    int j = arr.length-1;
    while(j >= 0 ){
        if( arr[j] == ' '){
            reversedWords+=arr[j];
        }else{
            String temp="";
            while(j>=0 && arr[j] != ' '){
                temp+=arr[j];
                j--;
            }
            j++;
            temp = reverseWord(temp);
            reversedWords+=temp;
        }
        j--;
    }

    String[] chk = reversedWords.split(" ");

    if(chk == null || chk.length == 0){
        return "";
    }

    return reversedWords;
}

    public static String reverseWord(String s){

        char[] arr = s.toCharArray();

        for(int i=0,j=arr.length-1;i<=j;i++,j--){
            char tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
        }
        return String.valueOf(arr);

    }
}
