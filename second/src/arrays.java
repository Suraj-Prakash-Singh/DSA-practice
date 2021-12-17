import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//        int [] myarray= new int[5];
//        System.out.print("Enter array values: ");
//
//
//        for (int i = 0; i < 5; i++) {
//            myarray[i]= in.nextInt();
//
//        }
//
//        System.out.println(Arrays.toString(myarray));
//        System.out.println();
//        System.out.println("Array size is: "+myarray.length);


        //2d arrays

        System.out.println("Enter no of rows and columns: ");
//        int i = in.nextInt();
//        int j = in.nextInt();

        int [][] multi = new int[3][3];

        for (int k = 0; k < multi.length ; k++) {
            for (int l = 0; l <multi[k].length; l++) {
                multi[k][l]= in.nextInt();
            }

        }

        for (int k = 0; k < multi.length ; k++) {
            for (int l = 0; l <multi[k].length; l++) {
                System.out.print(multi[k][l]+" ");
            }
            System.out.println();

        }
//        for (int i = 0; i < multi.length; i++) {
//
//                System.out.println(Arrays.toString(multi[i]));
//
//
//        }
        for (int[] a:multi
             ) {
            System.out.println(Arrays.toString(a));
            
        }



    }
}
