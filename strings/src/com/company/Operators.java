package com.company;

import java.util.ArrayList;

public class Operators {

    public static void main(String[] args) {
	// write your code here
        System.out.println('a' + 'b');
        System.out.println("a" + "b");
        System.out.println('a' + 3);
        System.out.println((char)('a'+1));

        System.out.println("a" + 1);
        // this is same as after a few steps : "a" + "1"
        // integer will be converted to Integer that will call toString()

        System.out.println("Suraj" + new ArrayList<>());
    }
}
