package com.company;

public class Main {

    public static void main(String[] args) {
	int[] arr ={90,1,24,37,169};


	int ans =linearSearch(arr,169);
        System.out.println(ans);

    }

    private static int linearSearch(int[] arr, int target) {
        if(arr.length==0){
            return -1;
        }
        for(int index=0;index<arr.length;index++){
            int element =arr[index];
            if (element==target){
                return index;
            }
        }
        return -1;

}
}
