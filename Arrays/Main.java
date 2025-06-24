
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            Creation creation = new Creation(sc);
            int[] arr = creation.createArray();

            UpdateArray update = new UpdateArray(arr, sc);
            // update.insert();
            // for (int i : arr) {
            //     System.out.print(i + " ");
            // }
            // System.out.println();
            // update.delete();
            // for (int i : arr) {
            //     System.out.print(i + " ");
            // }
            // System.out.println();

            // Elements element = new Elements(arr,sc);
            // element.largestElement();
            // element.smallestElement();
            // int immediateSmaller = element.immediateSmaller();
            // System.out.println(immediateSmaller);
            // int immediateLarger = element.immediateLarger();
            // System.out.println(immediateLarger);

            // Searching search = new Searching(arr,sc);
            // search.searchElement();

            // CheckSorted check = new CheckSorted(arr);
            // check.isSorted();

            // update.sortArray();
            // System.out.print("Sorted Array : ");
            // for (int i : arr) {
            //     System.out.print(i + " ");
            // }
            // System.out.println();
            // check.isSorted();
            // update.reverseArray();
            // System.out.print("Reversed array : ");
            // for(int i : arr){
            //     System.out.print(i+" ");
            // }
            // System.out.println();
            // check.isSorted();

            int n = update.removeDuplicates();
            for(int i=0;i<n;i++){
                System.out.print(arr[i] + " ");
            }
            sc.close();
        }
    }
}
