package com.company;

public class Quicksort {
    public static void printArray(int [] array){
        for(int element : array){
            System.out.print(element);
            System.out.print(" ");
        }
        System.out.println("");
    }


    public void quicksort(int[] numbers, int start, int end) {
        if(start >= end)
            return;
        int pivot = numbers[end];
        // partitioning
        int p = partition(numbers, pivot, start, end);
        quicksort(numbers,start,p-1);
        quicksort(numbers,p+1,end);
    }

    private void swap(int[] numbers, int lp, int rp) {
        int t = numbers[lp];
        numbers[lp] = numbers[rp];
        numbers[rp] = t;
    }

    private int partition(int[] numbers, int pivot, int lp, int rp) {
        int lo = lp;
        int hi = rp-1;
        if(rp - lp == 1){
            if(numbers[lp] > numbers[rp]){
                swap(numbers,lp,rp);
                return lp;
            }
            return rp;
        }
        while(lo<hi){
            while (numbers[lo] <= pivot && lo < hi){
                lo++;
            }
            while(numbers[hi] > pivot  && lo < hi){
                hi--;
            }
            // swap
            swap(numbers,lo,hi);
        }
        if(numbers[lo] > numbers[rp]){

            swap(numbers, lo, rp);
            return lo;
        }
        return rp;
    }
}
