package Algorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by ARPITHA RAO on 01-02-2016.
 */
public class MergeSort {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        for(int i=0; i< 6;i++){
            list.add(scan.nextInt());
        }
        System.out.print(MergeSort(list));
    }

    public static List<Integer> MergeSort(final List<Integer> list){
        if (list.size() < 2) {
            return list;
        }
        final List<Integer> leftHalf = list.subList(0, list.size()/2);
        final List<Integer> rightHalf = list.subList(list.size()/2, list.size());
        return merge(MergeSort(leftHalf), MergeSort(rightHalf));
    }

    public static List<Integer> merge(final List<Integer> left,final List<Integer> right){
        int leftptr = 0;
        int rightptr = 0;

        final List<Integer> outputList = new ArrayList<>(left.size()+right.size());
        while(leftptr < left.size() && rightptr < right.size()) {
            if (left.get(leftptr) < right.get(rightptr)) {
                outputList.add(left.get(leftptr));
                leftptr++;
            } else {
                outputList.add(right.get(rightptr));
                rightptr++;
            }
        }
            while (leftptr < left.size()){
                outputList.add(left.get(leftptr));
                leftptr++;
            }
            while(rightptr < right.size()){
                outputList.add(right.get(rightptr));
                rightptr++;
            }
        return outputList;
    }
}
