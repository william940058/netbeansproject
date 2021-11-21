import java.util.Arrays;


public class SelectSortStarterCode {
    
    public static void swap(int [] arr, int a, int b){
        int tempSwap = arr[a];
        arr[a] = arr[b];
        arr[b] = tempSwap;
    }
    public static int getMin(int [] arr, int startPos){
        int min = arr[startPos];
        int minPos = startPos;
        for (int i= startPos+1 ; i < arr.length; i++){
            if (arr[i] < min){
                min = arr[i];minPos = i;
            }
        }
        return minPos;
    }
    public static void performSelectionSort(int [] arr){
        for (int i = 0; i < arr.length - 1; i++){
            int min = getMin(arr, i);
            if (arr[min] < arr[i]){
                swap(arr, min, i);
            }
        }
    }
    public static void main(String[] args) {
        int [] arr = { 32, 10, 5, 132, 54, 2, 43, 56, 76, 23, 5, 6, 90, 22 };
        performSelectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
