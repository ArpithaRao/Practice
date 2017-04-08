package GeeksForGeeks;

/**
 * Created by ARPITHA RAO on 13-03-2017.
 */
public class MaxChocolates {

    public static int getMaxChoc(int money, int price, int wrap){

        int choc = money/price;
        choc = choc + choc-1/wrap-1;
        return choc;

    }

    public void stringReplace(){

        String string = "Arpitha";
        System.out.println(string.substring(3));
        System.out.println(string.replace('a', 'k'));

    }

    public static void main(String args[]){

        System.out.println(getMaxChoc(16,2,2));
        MaxChocolates m = new MaxChocolates();
        m.stringReplace();
    }

}
