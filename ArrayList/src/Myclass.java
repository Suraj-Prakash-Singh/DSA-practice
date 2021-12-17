import java.util.ArrayList;
import java.util.Collections;

public class Myclass {


    public static void main(String[] args) {

        int n=5;

        ArrayList <Integer> mylist = new ArrayList<>(n);

        mylist.add(0,10);
        mylist.add(1,90);
        mylist.add(2,30);
        mylist.add(3,20);
        mylist.add(4,50);

        System.out.println(mylist.get(0));
        System.out.println("Break");


        for(int i=0;i<5;i++)
        {
            System.out.println(mylist.get(i));

        }
        System.out.println("Break");
        ArrayList <Integer> mylist2 = new ArrayList<Integer>(n);
        mylist2=mylist; //copying an array list to another list

        for(int i=0;i<5;i++)
        {
            System.out.println(mylist2.get(i));

        }
        System.out.println("Break");


        //reversing the list

        int x=0,y=n-1;
        while(x<y)
        {
            Collections.swap(mylist2,x,y);
            x++;
            y--;
        }
        for(int i=0;i<5;i++)
        {
            System.out.println(mylist2.get(i));

        }

        //Swapping two elements in the list
        Collections.swap(mylist,2,4);

        System.out.println("Break");


        for(int i=0;i<5;i++)
        {
            System.out.println(mylist.get(i));

        }
        //joining two array lists
        mylist.addAll(mylist2);

        System.out.println("Break");


        for(int i=0;i<10;i++)
        {
            System.out.println(mylist.get(i));

        }

    }
}
