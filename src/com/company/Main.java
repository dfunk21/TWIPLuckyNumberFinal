package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Hello! Please enter your name below...");
        String name = scan.nextLine();
        randomGenerator randNum = new randomGenerator(name);
        System.out.print("Nice to meet you " + name + "! Your lucky number is " + randNum.rd); //Random number


    }
}
