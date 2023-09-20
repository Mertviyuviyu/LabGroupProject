import java.util.Arrays;
import java.util.Random;

public class Assignment2 {
    public static int[] createArray(int size){
        int[] arr1 = new int[size];
        Random rr = new Random();
        for(int i = 0; i < size; i++){
            arr1[i] = rr.nextInt(101);
        }
        return arr1;
    }
    public static int minOfArr(int[] arr){
        int min;
        min = arr[0];
        for(int i = 0; i<arr.length ;  i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }
    public static int maxOfArr(int[] arr){
        int max;
        max = arr[0];
        for(int i = 0; i<arr.length ;  i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
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
        
    }
    
}
    

