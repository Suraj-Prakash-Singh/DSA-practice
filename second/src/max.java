public class max {
    public static void main(String[] args) {
        int [] arr= new int[]{88,34,54,12,90};
         int ans= max(arr);
        System.out.println(ans);
       int inrange= maxrange(arr,1,3);
        System.out.println(inrange);

    }
    static int max(int[] arr){
        int max =arr[0];
        for (int i = 1; i <arr.length ; i++) {
            if(arr[i]>max)
                max=arr[i];

        }
        return max;
    }
    static int maxrange(int[] arr,int inndex1,int index2){
        int max =arr[inndex1];
        for (int i = inndex1+1; i <index2 ; i++) {
            if(arr[i]>max)
                max=arr[i];

        }
        return max;
    }
}
