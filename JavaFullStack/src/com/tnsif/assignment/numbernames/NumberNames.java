package com.tnsif.assignment.numbernames;

import java.util.Scanner;

public class NumberNames 
{
	public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        String number = sc.nextLine();
        for (int i = 0; i < number.length(); i++) {
            int digit = Character.getNumericValue(number.charAt(i));
            switch (digit) {
                case 0:
                    System.out.print("zero ");
                    break;
                case 1:
                    System.out.print("one ");
                    break;
                case 2:
                    System.out.print("two ");
                    break;
                case 3:
                    System.out.print("three ");
                    break;
                case 4:
                    System.out.print("four ");
                    break;
                case 5:
                    System.out.print("five ");
                    break;
                case 6:
                    System.out.print("six ");
                    break;
                case 7:
                    System.out.print("seven ");
                    break;
                case 8:
                    System.out.print("eight ");
                    break;
                case 9:
                    System.out.print("nine ");
                    break;
                default:
                    System.out.print("invalid ");
                    break;
            }
        }
        sc.close();
    }
}
