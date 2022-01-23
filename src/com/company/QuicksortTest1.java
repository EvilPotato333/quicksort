package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class QuicksortTest1 {
    public void printArray(int [] array){
        for(int element : array){
            System.out.print(element);
            System.out.print(" ");
        }
        System.out.println("");
    }

    @Test
    void quicksort() {
        Quicksort quicksort = new Quicksort();
        int [] numbers = new int[10];
        Random rand = new Random();
        for (int i = 0; i<10; i++){
            numbers[i] = rand.nextInt(100);
        }
        int [] correct = numbers.clone();
        Arrays.sort(correct);
        quicksort.quicksort(numbers,0,numbers.length - 1);
        Assertions.assertTrue(Arrays.equals(correct,numbers));
    }

    @Test
    void single(){
        int [] nums = {43, 95, 41, 87, 86, 68, 18, 11, 53, 87};
//        int [] nums = {78, 6 ,68, 17, 63, 37, 91, 65, 52, 64 };
//        int [] nums = {53, 4 ,69, 57, 96, 88, 37, 13, 83, 29 };
        int [] numsog = nums.clone();
        Arrays.sort(numsog);
        Quicksort quicksort = new Quicksort();
        quicksort.quicksort(nums, 0, nums.length-1);
        printArray(nums);
        Assertions.assertTrue(Arrays.equals(numsog,nums));
    }
}