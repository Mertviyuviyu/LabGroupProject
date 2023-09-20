import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Assignment2 {
    public static int[] createArray(int size) {
        int[] arr1 = new int[size];
        Random rr = new Random();
        for (int i = 0; i < size; i++) {
            arr1[i] = rr.nextInt(101);
        }
        return arr1;
    }

    public static int minOfArr(int[] arr) {
        int min;
        min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int maxOfArr(int[] arr) {
        int max;
        max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    public static int sumOfOdd(int[] arr){
        int sum=0;
        for(int i=0; i<arr.length;i++)
        {int num=arr[i];

            if(i%2==1){
            sum=sum+num;
            }
        }
        return sum;
    }
    public static int sumOfEven(int[] arr){
        int sum=0;
        for(int i=0; i<arr.length;i++)
        {int num=arr[i];

            if(i%2==0){
            sum=sum+num;
            }
        }
        return sum;
    }
    public static int[] findAverageArr(int[] arr){
        int sum=0;
        int average;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        average=sum/arr.length;
        System.out.println("Average: "+average);
        for(int i=0;i<arr.length;i++){
            arr[i]=Math.abs(arr[i]-average);
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] test = createArray(6);
        System.out.println(Arrays.toString(test));
        System.out.println(maxOfArr(test));
        System.out.println(minOfArr(test));
        System.out.println(Arrays.toString(findAverageArr(test)));
        
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        do{
        
        
        System.out.println(" 1-) Find the minimum or maximum integer of the array");
        System.out.println(" 2-) Find the average of the array");
        System.out.println(" 3-) Find the sum of elements with odd- and even-numbered indexes");
        System.out.println(" 4-) Exit");
        System.out.println(" Enter the choice :");
        choice = sc.nextInt();
        if (choice != 4){
            if ( choice == 1){
                
    
                System.out.println(" 1-) Find the minimum integer of the array");
                System.out.println(" 2-) Find the maximum integer of the array");
                System.out.println( "Enter the choice :");
                int select = sc.nextInt();
                if (select == 1)
                    System.out.println(minOfArr(test));
                else    
                    System.out.println(maxOfArr(test));
            }
    
           /* *else if (choice == 2)      
               //*  averageArray(choice);
    
            else if (choice == 3){
                //sumOfElements(choice);
            } */
        }
        }while(choice != 4);
        
    

    }
    



}


