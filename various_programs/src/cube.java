import java.util.Scanner;

public class cube {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.println("enter the number");
        n=scan.nextInt();
        System.out.println("Square= "+n*n);
        System.out.println("Cube= "+n*n*n);
        System.out.println("Fourth power= "+n*n*n*n);
    }
}
