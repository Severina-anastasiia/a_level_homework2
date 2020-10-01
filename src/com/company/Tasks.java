package com.company;

public class Tasks {

    public void task1(int[] array){
        System.out.print("Even numbers of the array: ");
        for(int i=0; i< array.length; i++){
            if(array[i] % 2 == 0){
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
    }

    public void task2(int[] array){
        int count = 0;
        for(int i=0; i<array.length; i++){
            if(array[i]>0){
                count++;
            }
        }
        System.out.println("Number of positive elements of array: " + count);
    }

    public void task3(int[] array){
        int count = 0;
        for(int i=1; i< array.length; i++){
            if(array[i-1]<array[i]){
                count++;
            }
        }
        System.out.println("Number of the element which larger than the previous: " + count);
    }

    public void task4(int[] array){
        int count = 0;
        for (int i = 1, j = 0, k = 2; i < array.length; i++) {
            if(k >= array.length)
            {
                break;
            }
            else {
                if(array[j] < array[i] && array[i] > array[k]){
                    count++;
                }
            }
            j++;
            k++;
        }
        System.out.println("Number of the element which larger than their neighbors: " + count);
    }
    public void task5(int[] array){
        int[] arrayTemp = new int[array.length];
        for(int i=0, j = array.length-1; i<array.length; i++){
            arrayTemp[i] = array[j];
            j--;
        }
        System.out.print("New array: ");
        for (int i = 0; i < array.length; i++)
        {
            System.out.print(arrayTemp[i] + " ");
        }
        System.out.println();
    }
    public void task6(int[] array){
        if(array.length % 2 ==0) {
            for (int i = 0, j = 1; i < array.length - 1; i += 2) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                j += 2;
            }
        }
        else{
            for(int i = 0, j = 1; i < array.length; i += 2){
                if(j == array.length){
                    break;
                }
                else{
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                    j += 2;
                }
            }
        }
        System.out.print("New array: ");
        for (int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + " ");
        }
    }
}