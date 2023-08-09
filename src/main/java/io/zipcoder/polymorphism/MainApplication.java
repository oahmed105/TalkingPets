package io.zipcoder.polymorphism;

import java.util.ArrayList;
import java.util.Scanner;

public class MainApplication {

    public static void main(String[] args) {
        System.out.println("How many pets do you have?");

        petType(petAmount());


    }

    public static int petAmount() {
        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();

        return input;
    }

    public static String[][] petType(int input) {
        String[][] typeAndName = new String[2][input];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < input; i++) {

            System.out.println("What kind of pet is each one?");

            String input1 = scanner.nextLine();
            typeAndName[0][i] = input1;
        }
        ArrayList<String> names = new ArrayList<>();

        for (int i = 0; i < input; i++) {
            System.out.println("What is each pets name?");

            String input1 = scanner.nextLine();
            typeAndName[1][i] = input1;
        }
        System.out.println(typeAndName[0][3]);
        return typeAndName;
    }
}
