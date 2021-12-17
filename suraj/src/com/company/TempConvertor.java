package com.company;

import java.util.Scanner;

public class TempConvertor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the temperature in celsius");

        float tempC= in.nextFloat();

        float tempF= (float) ((tempC*1.8)+32);

        System.out.println("Temperature in fahrenheit is:- "+tempF);

    }
}
