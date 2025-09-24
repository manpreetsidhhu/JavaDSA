import java.util.Scanner;

public class Main {

    public static void display(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Creation create = new Creation(sc);
            int[] originalArr = create.createArray();
            System.out.print("Original Array : ");
            display(originalArr);

            // Create separate copies for each sorting algorithm
            int[] bubbleArr = originalArr.clone();
            BubbleSort bubble = new BubbleSort(bubbleArr);
            bubble.sort();
            System.out.print("Bubble Sorted Array : ");
            display(bubbleArr);

            int[] selectionArr = originalArr.clone();
            SelectionSort selection = new SelectionSort(selectionArr);
            selection.sort();
            System.out.print("Selection Sorted Array : ");
            display(selectionArr);

            int[] insertionArr = originalArr.clone();
            InsertionSorting insertion = new InsertionSorting(insertionArr);
            insertion.sort();
            System.out.print("Insertion Sorted Array : ");
            display(insertionArr);
        }
    }
}
