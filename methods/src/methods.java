import java.util.Scanner;

public class methods {

    {

    }
    static void area(int a){
        int square = a*a;
        System.out.println("Area of the square is "+square);
    }
    static void area (int x,int y){
        int rect = x*y;
        System.out.println("Area of the rectangle is "+rect);
    }
    static void area (double r){
        double circle = 3.14*(r*r);
        System.out.println("Area of the circle is "+circle);
    }
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("what figure you want to calculate area for?");
        System.out.println("1.Rectangle?");
        System.out.println("2.Circle");
        System.out.println("3.Square");

        int input = scan.nextInt();
        methods obj = new methods();

        if(input==1)
        {
            System.out.println("Enter the length and breadth ");
            int length= scan.nextInt();
            int breadth = scan.nextInt();
            area (length,breadth);
        }
        else if(input ==2)
        {
            System.out.println("Enter the radius of the circle: ");
            double radius = scan.nextDouble();
            area(radius);
        }
        else if(input==3)
        {
            System.out.println("Enter the side of the square ");
            int side = scan.nextInt();
            area(side);
        }
        else
            System.out.println("Invalid input");


    }
}
