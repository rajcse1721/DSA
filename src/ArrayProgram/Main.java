package com.data_structure;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome");

        int intArray[] = new int[4];
        intArray[0] = 1;
        intArray[1] = 2;
        intArray[2] = 3;
        intArray[3] = 4;
        System.out.println(Arrays.toString(intArray));

        // all together
        String name[] = { "sonu", "ekta", "sudheer", "riya" };
        System.out.println(Arrays.toString(name));
        System.out.println();

        // insertion
        SingleDimensionArray sd = new SingleDimensionArray(5);
        sd.insert(0, 12);
        sd.insert(1, 22);
        sd.insert(2, 32);
        sd.insert(3, 42);
        sd.insert(4, 52);

        // accessing the element
        System.out.println("\nAccessing the element in the array");
        int firstElement = sd.arr[0];
        System.out.println("First Element: " + firstElement);
        int lastElement = sd.arr[4];
        System.out.println("First Element: " + lastElement);

        // traversing the array
        System.out.println("\nTraversing the array");
        sd.traverseArray();

        // find/search element in the array
        System.out.println("\n\nSearching....");
        sd.searchInArray(22);

        // Delete element from the array
        System.out.println("\nDeleted");
        sd.deletedValue(0);

        // Object obj = "sonu";
        // switch(obj) {
        // case String s -> System.out.println(s.repeat(3));
        // case Integer i -> System.out.println(i*3);
        // default System.out.println("unknown");
        // }

        // Write a program to parse inputs into categories like “Valid Email” or “Phone
        // Number”. A valid email must have ‘@’ character and a valid phone number must
        // have 10 digits
        // public static String parseInput(Object input){
        // return switch(input){
        // case String s when s.contains("@") && s.contains(".") -> "valid Email";
        // case String s when s.matches("\\d{10}") ->"valid phone number";
        // default -> "Invalid Email and Phone Number";
        // };
        // }
        // parseInput("user@example.com");

        // Validate user credentials where a username must start with admin_, and
        // passwords must be at least 8 characters long.
        // u.startsWith(admin_") && password.length.length() >=8 -> valid
        // default ->envalid
        // System.out.println(validateCredentials("admin_user", "strongPass"));
        // System.out.println(validateCredentials("admin_user", "weak"));
        // System.out.println(validateCredentials("user", "validPassword"));

        // Create a sealed class hierarchy for transportation modes (Car, Bike, and
        // Train). Add an enum for fuel types (PETROL, CNG, ELECTRIC, UNKNOWN). Write a
        // program that prints the fuel type based on the transportation mode using a
        // switch expression.
        // sealed class Transport permits Car, Bike, Train {}

        // final class Car extends Transport {}
        // final class Bike extends Transport {}
        // final class Train extends Transport {}

        // enum FuelType {
        // PETROL, CNG, DIESEL, ELECTRIC, UNKNOWN;
        // }

        // public class MyClass {
        // public static FuelType getFuelType(Transport transport) {
        // return switch (transport) {
        // case Car c -> FuelType.CNG;
        // case Bike b -> FuelType.PETROL;
        // case Train t -> FuelType.DIESEL;
        // default -> FuelType.UNKNOWN;
        // };
        // }

        // public static void main(String[] args) {
        // Transport car = new Car();
        // Transport bike = new Bike();
        // Transport train = new Train();

        // System.out.println("car fuel = " + getFuelType(car));
        // System.out.println("bike fuel = " + getFuelType(bike));
        // System.out.println("train fuel = " + getFuelType(train));
        // }
        // }

    }
}