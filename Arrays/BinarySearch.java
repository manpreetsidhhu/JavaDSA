import java.util.Scanner;

public class BinarySearch {
    private final int[] arr;
    private final Scanner sc;
    private int el;

    BinarySearch(int[] arr, Scanner sc) {
        this.arr = arr;
        this.sc = sc;
    }

    public int binarySearch(){
        CheckSorted check = new CheckSorted(arr);
        if(!check.isSorted()){
            UpdateArray update = new UpdateArray(arr, sc);
            update.sortArray();
        }
        System.out.print("Enter Element to search : ");
        el = sc.nextInt();
        int n = arr.length;
        int low = 0;
        int high = n-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]==el){
                System.out.print(el + " is present in array at index : ");
                return mid;
            }
            if(arr[mid]>el){
                high = mid-1;
            }
            if(arr[mid]<el){
                low = mid+1;
            }
        }
        System.out.print(el+" element is not present in array : ");
        return -1;
    }
    
}
