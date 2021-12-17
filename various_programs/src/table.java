import java.util.Scanner;

public class table {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.println("Enter the number");
        n = scan.nextInt();
        for(int i =1;i<11;i++)
        {
            System.out.println(n*i);
        }
    }
}
