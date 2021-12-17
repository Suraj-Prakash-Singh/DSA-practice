import java.util.Scanner;

public class positive {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
        int number;
        number = scan.nextInt();
        if(number>0)
            System.out.println("Positive number");
        else if(number<0)
            System.out.println("Negative number");
    }
}
