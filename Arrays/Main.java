

public class Main {
    public static void main(String[] args) {
        Creation creation = new Creation();
        int[] arr = creation.createArray();
        
        Elements element = new Elements(arr);
        element.largestElement();
        element.smallestElement();

        Searching search = new Searching(arr);
        search.searchElement();

        CheckSorted check = new CheckSorted(arr);
        check.isSorted();
    }
}
