package com.company;

public class findmin {
    public static void main(String[] args) {
        int[] array={69,32,8,43,12};
        System.out.println(min(array,1,3)); //min(array,1,3);
    }

    static int min(int[]array,int index1,int index2){
        int value = array[index1];
        for (int i = index1; i <=index2 ; i++) {
            int ans =array[i];
            if(ans<value){
                value=array[i];
            }
        }
        return value;

    }
}
