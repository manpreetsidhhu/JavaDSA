
import java.util.Scanner;

public class Searching {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter element for index " + i + " : ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the element to search : ");
        int el = sc.nextInt();
        sc.close();
        int j=1;
        boolean found = false;
        System.out.print("Element " + el + " is found at indexes : ");
        for(int i=0;i<n;i++){
            if(arr[i] == el){
                found = true;
                System.out.print(i + " ");
                j++;
            }
        }if(!found){
            System.out.print("null (element is not present in array)");
        } else {
            System.out.println("\nNumber of occurrences is : " + j);
        }
    }
}
