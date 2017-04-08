/**
 * Created by ARPITHA RAO on 01-03-2016.
 */
public class Asterisk
{
    public static void main(String[] args)
    {
        String output="";
        int count=1, input;
        input = 5;

        for(count=1;count <= input;count++)
        {
            output += "*";
            System.out.println(output);
        }

        input -= 1;

        for(count =input;count >0 ;count--)
        {
            output = output.substring(0,count);
            System.out.println(output);

        }
    }
}
