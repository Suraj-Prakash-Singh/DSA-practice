import java.util.Scanner;

public class average {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter 5 numbers: ");
        int num[];
        num = new int [5];
        for(int i =0;i<5;i++)
        {
            num[i]= scan.nextInt();
        }

        int sum=0;
        for(int i=0;i<5;i++)
        {
           // sum=sum+sum[i];
        }
        int average = sum/5;
        System.out.println("Sum of the numbers is "+sum);
        System.out.println("average of the numbers is "+average);
    }
}
