package com.danish.ideationzCalculator;

import java.util.Scanner;

public class Calculator extends CollectData {
	public static void main(String[] args) {

    	CollectData data=new CollectData();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number:");

        data.setNum1(scanner.nextDouble()); 
        System.out.print("Enter second number:");
        data.setNum2(scanner.nextDouble());

        System.out.print("Enter an operator (+, -, *, /): ");
        data.setOperator(scanner.next().charAt(0));

        scanner.close();
        double output;

        switch(data.getOperator())
        {
            case '+':
            	output = data.getNum1() + data.getNum2();
                break;

            case '-':
            	output = data.getNum1() - data.getNum2();
                break;

            case '*':
            	output = data.getNum1() * data.getNum2();
                break;

            case '/':
            	output = data.getNum1() / data.getNum1();
                break;
            default:
                System.out.printf("You have entered wrong operator");
                return;
        }

        System.out.println(data.getNum1()+" "+data.getOperator()+" "+data.getNum2()+": "+output);
    }
}
