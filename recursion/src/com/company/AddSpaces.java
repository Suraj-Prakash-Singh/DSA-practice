package com.company;

public class AddSpaces {
    public static void main(String[] args) {
        String s = "icodeinpython";
        int [] spaces = {1,5,7,9};
        System.out.println(addSpaces(s,spaces));
    }
    private static String addSpaces(String s, int[] spaces) {

        int i =0;
        int j = 0;
        int k =0;

        char[] array = s.toCharArray();
        StringBuilder ans = new StringBuilder();

        while(i<s.length() && k<array.length){
            if(i==spaces[j]){
                ans.append(" ");
                if(j< spaces.length-1)
                    j++;
            }
            ans.append(array[k]);
            i++;

            k++;
        }

        return String.valueOf(ans);
    }
}
