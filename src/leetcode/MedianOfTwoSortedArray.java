package leetcode;

import junit.framework.Assert;

/**
 * Created by ARPITHA RAO on 13-01-2017.
 */
public class MedianOfTwoSortedArray {

    public static double medianOfTwoSortedArrays(int[] array1, int[] array2){

        double median1 = 0.0;
        double median2 = 0.0;
        double medianActual = 0.0;
        System.out.println(array2.length);
        System.out.println(array2.length - 1);
        //if first array is null
        if(array1.length == 0 && array2.length > 0){
                if(array2.length % 2 != 0){
                    medianActual = array2[(array2.length)/2];
                }
                else if(array2.length % 2 == 0){
                    medianActual = array2[(array2.length)/2];
                }
            }
        //if second array is null
       else if(array2.length == 0 && array1.length > 0){
                if(array1.length % 2 != 0){
                    medianActual = array1[array1.length/2];
                }
                else if(array1.length % 2 == 0){
                    medianActual = array1[array1.length/2];
                }
            }

        else {
            if (array1.length %  2 != 0) {
                median1 = array1[array1.length / 2];
            } else if (array1.length % 2 == 0) {
                median1 = array1[array1.length / 2];
            }

            if (array2.length % 2 != 0) {
                median2 = array2[array2.length / 2];
            } else if (array2.length % 2 == 0) {
                median2 = array2[array2.length / 2];
            }

            medianActual = (median1 + median2) / 2;
        }

        return medianActual;
    }

    public static void main(String args[]){
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3, 4};
        int[] array3 = {};
        int[] array4 = {0, 1};
        int[] array5 = {0, 1, 2};
        int[] array6 = {};/*
        System.out.println(medianOfTwoSortedArrays(array1,array2));
        System.out.println(medianOfTwoSortedArrays(array3,array4));
        System.out.println(medianOfTwoSortedArrays(array5,array6));*/
//        Assert.assertEquals(medianOfTwoSortedArrays(array1, array2), 2.5);
        Assert.assertEquals(medianOfTwoSortedArrays(array3, array4), 0.5);
//        Assert.assertEquals(medianOfTwoSortedArrays(array5, array6), 1);
    }

}
