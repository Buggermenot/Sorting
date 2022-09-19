import java.util.Arrays;

public class BubbleSort {
    static int[] swap(int arr[], int start, int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        return arr;
    }

    static int[] sortBubble(int[] arr, int n){
        boolean swapFlag = true;
        while (swapFlag){
//            System.out.println(Arrays.toString(arr));
            n--;
            swapFlag = false;
            for (int i = 0; i < n; i++){
                if (arr[i] > arr[i+1]){
                    swap(arr, i, i+1);
//                    System.out.println(Arrays.toString(arr));
                    swapFlag = true;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = {5,25,6,74,9,6,1};					// Test Array
        int sortedArr[] = sortBubble(arr, 7);
        System.out.println(Arrays.toString(sortedArr));
    }
}
