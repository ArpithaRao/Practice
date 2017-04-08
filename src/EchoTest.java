/**
 * Created by ARPITHA RAO on 14-01-2016.
 */
public class EchoTest {

    public static void main( String args[] ){
        Echo e1 = new Echo();
        Echo e2=e1;
        int x=0;
        while(x<4){
            e1.hello();

            e1.count =  e1.count +1;
            System.out.println("E1 is "+e1.count);
            System.out.println("X is "+x);
            if(x==3){
                e2.count =  e2.count +1;
                System.out.println("E2 is "+e2.count);
            }
           x= x+1;
        }
        System.out.println("Final "+e2.count);
    }
}
class Echo{
    int count = 0;
    void hello(){
        System.out.println("Hello");
    }

}