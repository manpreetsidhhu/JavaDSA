public class MajorityElement {
    private int[] arr;

    MajorityElement(int[] arr) {
        this.arr = arr;
    }

    // This is MOORE's Voting Algorithm

    public void majorityElement() {
        int count = 0, candidate = -1;
        int n = arr.length;
        for(int i:arr){
            if(count == 0){
                candidate = i;
                count = 1;
            } else if (i==candidate){
                count++;
            } else {
                count--;
            }
        }
        count = 0;
        for(int i : arr){
            if(i==candidate){
                count++;
            }
        }
        int majority = (count>(n/2)) ? candidate : -1;
        System.out.println("Majority Element is : "+majority);
    }

}