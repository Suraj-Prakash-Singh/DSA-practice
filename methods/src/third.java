import java.util.Scanner;

public class third {
    static void oddeven(int a){
        if(a%2==0)
            System.out.println("Number is even");
        else
            System.out.println("Number is odd");


    }
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number: ");

        int element = scan.nextInt();
        oddeven(element);


    }
}
