package com.company;

import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        HashMap<Integer,Integer> myMap = new HashMap<>();
        int[]arr={1,4,1,3,6,7,8,2,2,4,10};
        for (int i = 0; i < arr.length ; i++) {
            int y =1;
            if(myMap.containsKey(arr[i]))
                y++;
            myMap.put(arr[i],y);
        }
        if(myMap.isEmpty())


        System.out.println(myMap);

        for(Map.Entry<Integer,Integer> entry : myMap.entrySet()){
            if(entry.getValue()==2){
                System.out.println(entry.getKey());

            }

        }
    }
}
