import java.util.ArrayList;
import java.util.Iterator;

public class collections {
    public static void main(String[] args) {

        //ARRAY LISTS
            ArrayList<String> nameList = new ArrayList<String>(); //syntax

        nameList.add("Ravi");
        nameList.add("Vijay");
        nameList.add("sarthak");
        nameList.add("shiv");
        nameList.add("lasst");

        /*Iterator itr = nameList.iterator(); //iterator class usage

        //while(itr.hasNext()){
            System.out.println(itr.next());
        }*/

        //nameList.set(4,"jod");//will replace the index value
        //nameList.add(4,"zodd");//will add a new index and value at it

        nameList.remove(3);
        //nameList.remove("shiv");
        //nameList.removeAll()
        for(int i=0;i< nameList.size();i++)
        {
            System.out.println(nameList.get(i));
        }

    }
}
