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

    public static void main(String[] args) {
        int[] test = createArray(6);
        System.out.println(Arrays.toString(test));
        
    }
}
