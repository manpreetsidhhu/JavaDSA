
import java.util.Scanner;

public class UpdateArray {
    
    private final int[] arr;
    private int el;
    private int pos;
    private final Scanner sc;

    UpdateArray(int[] arr,Scanner sc) {
        this.arr = arr;
        this.sc = sc;
        System.out.print("Array Before any updation : ");
        for(int i:arr){
            System.out.print(i+" ");
        } System.out.println();
    }

    public void insert() {
        System.out.print("Enter the element to be inserted : ");
        el = sc.nextInt();
        System.out.print("Enter the position where to insert element : ");
        pos = sc.nextInt();
        if(pos<0 || pos>arr.length){
            System.out.println("Position out of bounds. (java.lang.ArrayIndexOutOfBoundsException)");
            return;
        }
        for (int i = arr.length - 1; i >= pos; i--) {
            arr[i] = arr[i - 1];
        }
        arr[pos-1] = el;
        System.out.print("Array after insertion operation : ");
    }

    public void delete(){
        System.out.print("Enter the position where to delete an element : ");
        pos = sc.nextInt();
        if(pos<0 || pos>arr.length){
            System.out.println("Position out of bounds. (java.lang.ArrayIndexOutOfBoundsException)");
            return;
        }
        for(int i=pos-1;i<arr.length-1;i++){
            arr[i]=arr[i+1];
        }
        arr[arr.length-1] = -1;
        System.out.print("Array after deletion Operation : ");
    }

    public void sortArray(){
        int n = arr.length;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public void reverseArray() {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public int removeDuplicates() {
        sortArray();
        System.out.print("Removing Duplicates elements from array : ");
        int[] temp = new int[arr.length];
        temp[0]=arr[0];
        int j = 1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>temp[j-1]){
                temp[j++] = arr[i];
            }
        }
        System.arraycopy(temp, 0, arr, 0, arr.length);
        return j;
    }
}
