import java.util.Arrays;

public class NewSort {
    static int[] swap(int arr[], int i){
        int temp = arr[0];
        arr[0] = arr[i];
        arr[i] = temp;
        return arr;
    }
    static void selectionSort(int arr[], int n){
        if (n == 1) {
            System.out.print(arr[0] + " ");
            return;
        }
        int j, min_index = 0;
        for (j = 1; j < n; j++){
            if (arr[min_index] > arr[j])
                min_index = j;
        }
        arr = swap(arr, min_index);
        System.out.print(arr[0] + " ");
        arr = Arrays.copyOfRange(arr,1, n);
        selectionSort(arr, n-1);
    }

    public static void main(String[] args) {
        int arr[] = {5,25,6,74,9,6,1};
        selectionSort(arr, 7);
    }
}
