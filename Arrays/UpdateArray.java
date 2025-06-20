
import java.util.Scanner;

public class UpdateArray {

    private int[] arr;
    private int el;
    private int pos;

    UpdateArray(int[] arr) {
        this.arr = arr;
        System.out.print("Array Before any updation : ");
        for(int i:arr){
            System.out.print(i+" ");
        } System.out.println();
    }

    Scanner sc = new Scanner(System.in);
    public int[] insert() {
        System.out.print("Enter the element to be inserted : ");
        el = sc.nextInt();
        System.out.print("Enter the position where to insert element : ");
        pos = sc.nextInt();
        if(pos<0 || pos>=arr.length){
            System.out.println("Position out of bounds. (java.lang.ArrayIndexOutOfBoundsException)");
            return arr;
        }
        for (int i = arr.length - 1; i >= pos; i--) {
            arr[i] = arr[i - 1];
        }
        arr[pos-1] = el;
        System.out.print("Array after insertion operation : ");
        return arr;
    }
    public int[] delete(){
        System.out.println();
        System.out.print("Enter the position where to delete an element : ");
        pos = sc.nextInt();
        if(pos<0 || pos>=arr.length){
            System.out.println("Position out of bounds. (java.lang.ArrayIndexOutOfBoundsException)");
        }
        for(int i=pos-1;i<arr.length-1;i++){
            arr[i]=arr[i+1];
        }
        arr[arr.length-1] = 0;
        System.out.print("Array after deletion Operation : ");
        return arr;
    }
}
