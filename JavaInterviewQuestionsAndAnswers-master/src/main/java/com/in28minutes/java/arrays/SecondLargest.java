package com.in28minutes.java.arrays;

public class SecondLargest {
    private SecondLargest(){}
    public static void main(String[] args) {
        int array[] ={9,4,7,6,8,3};
        int result=findSecondLargest(array);
        System.out.println(result);
    }
    public static int findSecondLargest(int[] array){

        if (array ==null || array.length==0){
            throw new IllegalArgumentException("Illegal Argument");
        }

        int secondLargest=Integer.MIN_VALUE;
        int largest=Integer.MIN_VALUE;
        for(int num: array){
            if (largest<num){
                secondLargest=largest;
                largest=num;
            }
            else if (num>secondLargest && largest!=num){
                secondLargest=num;
            }
        }
        return  secondLargest;
    }

}






