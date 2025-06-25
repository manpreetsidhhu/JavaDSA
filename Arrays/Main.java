
// import java.util.Scanner;
// public class Main {
//     public static void main(String[] args) {
//         try (Scanner sc = new Scanner(System.in)) {
//             Creation creation = new Creation(sc);
//             int[] arr = creation.createArray();
//             UpdateArray update = new UpdateArray(arr, sc);
//             update.insert();
//             for (int i : arr) {
//                 System.out.print(i + " ");
//             }
//             System.out.println();
//             update.delete();
//             for (int i : arr) {
//                 System.out.print(i + " ");
//             }
//             System.out.println();
//             Elements element = new Elements(arr,sc);
//             element.largestElement();
//             element.smallestElement();
//             int immediateSmaller = element.immediateSmaller();
//             System.out.println(immediateSmaller);
//             int immediateLarger = element.immediateLarger();
//             System.out.println(immediateLarger);
//             Searching search = new Searching(arr,sc);
//             search.searchElement();
//             BinarySearch bSearch = new BinarySearch(arr, sc);
//             int bsearchres = bSearch.binarySearch();
//             System.out.println(bsearchres);
//             CheckSorted check = new CheckSorted(arr);
//             check.isSorted();
//             update.sortArray();
//             System.out.print("Sorted Array : ");
//             for (int i : arr) {
//                 System.out.print(i + " ");
//             }
//             System.out.println();
//             check.isSorted();
//             update.reverseArray();
//             System.out.print("Reversed array : ");
//             for(int i : arr){
//                 System.out.print(i+" ");
//             }
//             System.out.println();
//             check.isSorted();
//             int n = update.removeDuplicates();
//             for(int i=0;i<n;i++){
//                 System.out.print(arr[i] + " ");
//             }
//             System.out.println();
//             sc.close();
//         }
//     }
// }
import java.util.Scanner;

public class Main {

    public static void display(int[] arr) {
        System.out.print("Array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Java Arrays Program");

            Creation creation = new Creation(sc);
            int[] arr = creation.createArray();
            UpdateArray update = new UpdateArray(arr, sc);
            Elements element = new Elements(arr, sc);
            Searching search = new Searching(arr, sc);
            BinarySearch bSearch = new BinarySearch(arr, sc);
            CheckSorted check = new CheckSorted(arr);
            MajorityElement majority = new MajorityElement(arr);

            boolean continueProgram = true;

            while (continueProgram) {
                System.out.println("\nChoose an operation:");
                System.out.println("1. Insert Element");
                System.out.println("2. Delete Element");
                System.out.println("3. Display Array");
                System.out.println("4. Find Largest Element");
                System.out.println("5. Find Smallest Element");
                System.out.println("6. Find Immediate Larger");
                System.out.println("7. Find Immediate Smaller");
                System.out.println("8. Linear Search");
                System.out.println("9. Binary Search");
                System.out.println("10. Check if Sorted");
                System.out.println("11. Sort Array");
                System.out.println("12. Reverse Array");
                System.out.println("13. Remove Duplicates");
                System.out.println("14. Majority Element");
                System.out.println("0. Exit");

                System.out.print("Enter your choice: ");
                int choice = sc.nextInt();

                switch (choice) {
                    case 1 -> { update.insert(); display(arr); }
                    case 2 -> { update.delete(); display(arr); }
                    case 3 -> display(arr);
                    case 4 -> { element.largestElement(); element.secondLargest(); }
                    case 5 -> { element.smallestElement(); element.secondSmallest(); }
                    case 6 -> System.out.println(element.immediateLarger());
                    case 7 -> System.out.println(element.immediateSmaller());
                    case 8 -> search.searchElement();
                    case 9 -> System.out.println(bSearch.binarySearch());
                    case 10 -> check.isSorted();
                    case 11 -> {
                        update.sortArray();
                        System.out.print("Sorted Array: ");
                        display(arr);
                    }
                    case 12 -> {
                        update.reverseArray();
                        System.out.print("Reversed Array: ");
                        display(arr);
                    }
                    case 13 -> {
                        int n = update.removeDuplicates();
                        System.out.print("Array after removing duplicates: ");
                        for (int i = 0; i < n; i++) {
                            System.out.print(arr[i] + " ");
                        }
                        System.out.println();
                    }
                    case 14 -> majority.majorityElement();
                    case 0 -> {
                        System.out.println("Exiting program. Goodbye!");
                        continueProgram = false;
                    }
                    default -> System.out.println("Invalid choice. Please try again.");
                }

                if (choice != 0) {
                    System.out.print("\nDo you want to perform another operation? (y/n): ");
                    String again = sc.next().trim().toLowerCase();
                    if (!again.equals("yes") && !again.equals("y")) {
                        continueProgram = false;
                        System.out.println("Exiting program. Goodbye!");
                    }
                }
            }
        }
    }
}
