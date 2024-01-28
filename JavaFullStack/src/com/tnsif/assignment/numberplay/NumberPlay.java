package com.tnsif.assignment.numberplay;
import java.util.Scanner;

public class NumberPlay {
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.println("Enter the number");
	        int userInput = sc.nextInt();

	        if (isValidNumber(userInput)) {
	            int result = solvePuzzle(userInput);
	            System.out.println(result);
	        } else {
	            System.out.println("Invalid number");
	        }

	        sc.close();
	    }

	    public static boolean isValidNumber(int number) {
	        return number >= 10 && number <= 99;
	    }

	    public static int solvePuzzle(int number) {
	        if (number > 50) {
	            return calculateDifference(number);
	        } else {
	            int reversedNumber = reverseNumber(number);
	            return calculateDifference(reversedNumber);
	        }
	    }

	    public static int calculateDifference(int number) {
	        int tensDigit = number / 10;
	        int onesDigit = number % 10;
	        return tensDigit - onesDigit;
	    }

	    public static int reverseNumber(int number) {
	        return (number % 10) * 10 + (number / 10);
	    }
	}


