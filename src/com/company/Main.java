package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String nameList = "";
        String randNumList = "";

        while (true) {
            System.out.println("Hello! Please enter your name below...");
            String name = scan.nextLine();
            nameList = nameList + name + " ";

            randomGenerator randNum = new randomGenerator(name);
            randNumList = randNumList + randNum.rd + " ";

            System.out.println("Nice to meet you " + name + "! Your lucky number is " + randNum.rd); //Random number
            System.out.println("Enter \"0\" to exit, \"1\" for a listing of names and lucky numbers, or \"2\" " +
                    "to enter another name");
            String secondResponse = scan.nextLine();

            if (secondResponse.equalsIgnoreCase("0"))
            {
                break;
            }
            else if (secondResponse.equalsIgnoreCase("1"))
            {
                System.out.println("Names: " + nameList);
                System.out.println("Lucky Numbers: " + randNumList);
                break;
            }
            else if (secondResponse.equalsIgnoreCase("2"))
            {

            }
            else
            {
                break;
            }

        }


    }
}
