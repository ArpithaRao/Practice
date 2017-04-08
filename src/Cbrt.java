/**
 * Created by ARPITHA RAO on 27-01-2016.
 */

public class Cbrt {
    static int cubeNumbers(int M, int N) {
        int a=1,b=1;
        double exp=0;
        int valid_pair=0;

     for( a=1; a<=M; a++) {
            for (b= 1; b <= N; b++) {
                exp = (Math.cbrt(a) + Math.cbrt(b));
                exp = Math.pow(exp, 3);

                if (exp%1==0) {
                    System.out.println("Satisfied pair " + a + "," + b);
                    valid_pair += 1;
                }
            }
        }
        return valid_pair ;
  }
    public static void main(String args[]){
       Cbrt cube = new Cbrt();
        System.out.println(cube.cubeNumbers(1,1));
        System.out.println(cube.cubeNumbers(1,8));
        System.out.println(cube.cubeNumbers(1,27));
 }
}



