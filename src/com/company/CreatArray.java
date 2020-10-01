package com.company;

public class CreatArray {
    private int n;
    private int[] array;

    public CreatArray(int n){
        if(n <= 100 && n >= 1){
            this.n = n;
            int[] array1 = new int[n];
            this.array = array1;
        }
        init();
    }
    private void init(){
        for(int j = 0; j < n; j++) {
            int i = (int)(-100 + Math.random()*201);
            array[j] = i;
        }
    }
    private void printArray(){
        for(int i=0; i<array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("_________");
    }
    public void run(){
        printArray();
        Tasks tasks = new Tasks();
        tasks.task1(this.array);
        tasks.task2(this.array);
        tasks.task3(this.array);
        tasks.task4(this.array);
        tasks.task5(this.array);
        tasks.task6(this.array);
    }
}