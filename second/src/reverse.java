import java.util.Arrays;

public class reverse {
    public static void main(String[] args) {
        int [] arr= new int[]{88,34,54,12,90};
        rev(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void rev(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }

}
