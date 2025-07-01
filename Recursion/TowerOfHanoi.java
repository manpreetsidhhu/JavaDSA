
import java.util.Scanner;

public class TowerOfHanoi {

    private final Scanner sc;

    public TowerOfHanoi(Scanner sc) {
        this.sc = sc;
    }

    public void toh(int n, char a, char b, char c) {
        if (n == 1) {
            System.out.println("Move Disk 1 from " + a + " to " + c);
            return;
        }
        toh(n - 1, a, c, b);
        System.out.println("Move Disk " + n + " from " + a + " to " + c);
        toh(n - 1, b, a, c);
    }

    public void towerOfHanoi() {
        System.out.print("Enter the number of disc for tower of hanoi problem : ");
        int n = sc.nextInt();
        if(n<=0){
            System.out.println("Number of Disks must be greater than Zero");
            return;
        }
        toh(n, 'A', 'B', 'C');
    }
}