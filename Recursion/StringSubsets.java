
import java.util.Scanner;

class StringSubsets {
    private Scanner sc;

    public StringSubsets(Scanner sc){
        this.sc = sc;
    }

    public void subsetsOfString(String str, String curr, int i){
        if(i==str.length()){
            System.out.print(curr + " ");
            return;
        }
        subsetsOfString(str, curr + str.charAt(i), i+1);
        subsetsOfString(str, curr, i+1);
    }

    public void stringSubsets(){
        System.out.print("Enter the String to get subsets : ");
        String str = sc.nextLine();
        int index = 0;
        String curr = "";
        subsetsOfString(str,curr,index);
    }
}
