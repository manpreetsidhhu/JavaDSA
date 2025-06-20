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

        UpdateArray update = new UpdateArray(arr);
        arr = update.insert();
        for(int i:arr){
            System.out.print(i+" ");
        }
        arr = update.delete();
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
