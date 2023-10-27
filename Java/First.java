package Java;
import java.util.Arrays;
import java.util.Random;
public class First {

    public static void randomNumber(int arr[], int n) {
        Random r = new Random();

        for(int i=n-1;i>0;i--) {
            int j = r.nextInt(i+1);

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        System.out.println("Shuffled Array" + Arrays.toString(arr));
    }
    
    public static void main(String args[]) {
        int arr[] = {1,2,3,4,5};
        int n = arr.length;

        randomNumber(arr, n);
    }
}
