
public class CheckSorted {
    private final int[] arr;

    public CheckSorted(int[] arr){
        this.arr = arr;
    }

    public boolean isSorted() {
        boolean isAscending = true;
        boolean isDescending = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                isDescending = false;
            } else if (arr[i] > arr[i + 1]) {
                isAscending = false;
            }
        }
        if (isAscending) {
            System.out.println("Array is sorted in ascending order.");
            return true;
        } else if (isDescending) {
            System.out.println("Array is sorted in descending order.");
            return true;
        } else {
            System.out.println("Array is not sorted.");
        }
        return false;
    }

}
