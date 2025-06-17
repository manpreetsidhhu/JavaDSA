
public class Elements {
    public int[] arr;

    Elements(int[] arr){
        this.arr = arr;
    }

    public void largestElement(){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("Largest Element : " + max);
    }
    public void smallestElement(){
        int min = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("Smallest Element : " + min);
    }
    
}