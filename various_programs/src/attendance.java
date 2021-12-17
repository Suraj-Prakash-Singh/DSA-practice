import java.util.Scanner;

public class attendance {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        float total_classes;
        float attended;

        System.out.println("Enter the Number of classes held: ");
        total_classes = scan.nextFloat();

        System.out.println("Enter the Number of Classes attended: ");
        attended = scan.nextFloat();

        float percentage = (attended/total_classes)*100;

        System.out.println("Percentage of classes attended is "+percentage);

        if(percentage<75)
            System.out.println("NOT Allowed to sit in exam");
        else
            System.out.println("Allowed to sit in exam");

    }
}
