import java.util.Scanner;

public class oddeven {
    public static void main(String[] args) {
        int number;
        //oddeven obj= new oddeven();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number ");
        number = sc.nextInt();
        if(number%2==0)
            System.out.println("Number is even ");
        else
            System.out.println("Number is odd");
    }
}
