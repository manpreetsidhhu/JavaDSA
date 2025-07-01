
import java.util.Scanner;

public class Palindrome {
    private final Scanner sc;

    Palindrome(Scanner sc){
        this.sc = sc;
    }

    public boolean palindromechecker(String str, int start, int end){
        if(start == end) return true;
        if(str.charAt(start) != str.charAt(end)) return false;
        if(start<end){
            return palindromechecker(str, start+1, end-1);
        }
        return true;
    }

    public void isPalindrome(){
        System.out.print("Enter the string to check palindrome : ");
        String str = sc.nextLine();
        if(palindromechecker(str, 0, str.length()-1)){
            System.out.println("String "+str+" is a palindrome");
            return;
        } System.out.println("String is not a palindrome.");
    }

}