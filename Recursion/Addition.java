
import java.util.Scanner;

public class Addition {
    private Scanner sc;

    Addition(Scanner sc) {
        this.sc = sc;
    }

    public int nNaturalSum(int n){
        if(n<=1){
            return n;
        }
        return n + nNaturalSum(n-1);
    }

    public int sumDigits(int n){
        if(n<=9){
            return n;
        }
        return sumDigits(n/10) + n%10;
    }
    
    public void addition(){
        System.out.print("Enter a number (N) of get sum of first N natural numbers : ");
        int n = sc.nextInt();
        System.out.println("Sum of first " + n + " natural numbers is : " + nNaturalSum(n));
        System.out.print("Enter a number to get sum of its digits : ");
        int d = sc.nextInt();
        System.out.println("Sum of digits of "+d+" is : "+ sumDigits(d));
    }
}
