package JavaDSA.Sorting;
public class SelectionSort {

    private int[] arr;

    public SelectionSort(int[] arr) {
        this.arr = arr;
    }

    public void sort() {
        for (int i = 0; i < arr.length; i++) {
            int minIdx = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[minIdx]){
                    minIdx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
        }
    }
}
