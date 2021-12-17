import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        Stack<Integer> gymWeights = new Stack<Integer>();

        //push
        gymWeights.push(25);
        gymWeights.push(20);
        gymWeights.push(15);
        gymWeights.push(10);

        System.out.println(gymWeights);

        //pop
        int weight = gymWeights.pop();


        System.out.println(weight);
        System.out.println(gymWeights);

        //peek
        int num = gymWeights.peek();
        System.out.println(num);
        System.out.println(gymWeights);

        //search
        int pos = gymWeights.search(25);
        System.out.println(pos);


    }
}
