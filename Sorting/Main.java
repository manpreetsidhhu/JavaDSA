package JavaDSA.Sorting;

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
            int[] arr = create.createArray();
            System.out.print("Original Array : ");
            display(arr);

            int[] bubbleArr = arr;
            BubbleSort bubble = new BubbleSort(bubbleArr);
            bubble.sort();
            System.out.print("Bubble Sorted Array : ");
            display(bubbleArr);

            int[] selectionArr = arr;
            SelectionSort selection = new SelectionSort(selectionArr);
            selection.sort();
            System.out.print("Selection Sorted Array : ");
            display(selectionArr);

            int[] insertionArr = arr;
            InsertionSorting insertion = new InsertionSorting(insertionArr);
            insertion.sort();
        }
    }

}
