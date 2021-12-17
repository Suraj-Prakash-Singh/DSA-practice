import java.util.Scanner;

public class second {
    static void table(int a){

        for(int i=1;i<11;i++){
            System.out.println(a*i);

        }
    }
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number ");

        int number = scan.nextInt();
        table(number);

    }
}
