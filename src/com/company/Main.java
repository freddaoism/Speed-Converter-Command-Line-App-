package com.company;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        //asks user for distance
	System.out.println("What is your distance in kilometers?");

	    //declares the kmPerHour as the user input
	    Double kmPerHour = scanner.nextDouble();
        scanner.nextLine();

        //method call to calculate the conversion from km/h to mi/h
        toMilesPerHour(kmPerHour);

        //method call that prints the conversion to the console
        printConversion(kmPerHour);
    }

    //method that calculates the speed conversion
    public static long toMilesPerHour(double kmPerHour){
        if (kmPerHour <0) {
            return -1;
        }
        return Math.round(kmPerHour/1.609);
    }

    //method that prints the conversion to the console
    public static void printConversion (double kmPerHour) {

        if (kmPerHour <0) {
            System.out.println("Invalid Value");
        } else {
            long mPH = toMilesPerHour(kmPerHour);
            System.out.println(kmPerHour + " km/h = " + mPH + " mi/h");
        }
    }
}
