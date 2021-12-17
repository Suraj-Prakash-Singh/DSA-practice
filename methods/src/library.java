import java.util.Scanner;

public class library {

    Scanner scan=new Scanner(System.in);
    int bookid = scan.nextInt();
    String name = scan.next();
    int price = scan.nextInt();
    boolean status = scan.nextBoolean();

    public library(){
        System.out.println(bookid);
        System.out.println(name);
        System.out.println(price);
        System.out.println(status);
    }
    public static void main(String[] args) {
        System.out.println("Enter the details: ");

        library obj = new library();
    }
}
