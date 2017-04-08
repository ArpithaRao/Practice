/**
 * Created by ARPITHA RAO on 26-01-2016.
 */
public class RightTriangle {

    // right right angled triangle//
//    public static void main(String args[]){
//        for(int i = 0; i < 9; i++)
//        {
//            for(int j = 9; j > 0 ; j--)
//            {
//                if(i > j)
//                    System.out.print("*");
//                else
//                    System.out.print(" ");
//            }
//            System.out.println();
//        }
//    }
// left right angled triangle//
    public static void main(String args[]){
        for(int i=0; i< 9; i++){
            for(int j=0; j<9; j++){
                if(i<j)
                System.out.print(" ");
                else
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}
