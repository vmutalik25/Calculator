//package com.varunmutalik;

//import java.util.Locale;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        float num1, num2;
        System.out.println("Enter first number");
        Scanner scan= new Scanner(System.in);
        num1= scan.nextFloat();

        System.out.println("Enter second number");
        Scanner scan1 = new Scanner(System.in);
        num2= scan.nextFloat();
        System.out.print("You have entered ");
        System.out.print(num1);
        System.out.print(" and ");
        System.out.println(num2);
        String prompt = "Enter 0 for addition, 1 for Subtraction, 2 for multiplication, 3 for division ";
        System.out.println(prompt);
        int input = scan.nextInt();
        switch (input){
            case 0:
                System.out.println("Adding these numbers");
                System.out.println("The result is: ");
                System.out.println(num1+num2);
                break;
            case 1:
                System.out.println("Subtracting these numbers");
                System.out.println("The result is: ");
                System.out.println(num1-num2);
                break;
            case 2:
                System.out.println("Multiplying these numbers");
                System.out.println("The result is: ");
                System.out.println(num1*num2);
                break;
            case 3:
                System.out.println("Dividing these numbers");
                System.out.println("The result is: ");
                System.out.println(num1/num2);
                break;
            default:
                System.out.println("Invalid input");
        }
    }
} 
