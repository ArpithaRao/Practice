package leetcode;

/**
 * Created by ARPITHA RAO on 10-01-2017.
 */
public class ContainerWithMaxWater {

    public static int maxArea(int[] points){
        int left = 0;
        int right = points.length - 1;

        int maxArea = 0;

        while(left < right){
            maxArea = Math.max(maxArea, (Math.min(points[left],points[right])) * (right - left));

            if(points[left] < points[right]){
                left++;
            }
            else{
                right--;
            }
        }

        return maxArea;
    }

    public static void main(String args[]){
        int[] points = {1,2,3,4};
        System.out.println(maxArea(points));
    }
}
