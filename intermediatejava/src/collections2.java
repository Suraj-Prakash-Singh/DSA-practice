import java.util.ArrayList;
import java.util.Scanner;

public class collections2 {
    public static void main(String[] args) {
        ArrayList <Integer> mylist = new ArrayList<Integer>();
        //Scanner scan = new Scanner(System.in);
        //int numbers =10;
        for(int i=0;i<11;i++)
        {
            mylist.add(i);
        }
        mylist.removeIf(n->(n%2==0));

        for(int i=0;i<11;i++)
        {
            System.out.println(mylist.get(i));
        }
    }
}
