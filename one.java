package Java;

import java.util.Arrays;
import java.util.Random;

public class one{
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        Random random = new Random();
        //to shuffle array elements
        for(int i=0;i<arr.length;i++){
            //to generate random index
            int index = random.nextInt(i+1);
            //swap 
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
        //print an array
        System.out.println(Arrays.toString(arr));
    }
}