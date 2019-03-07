package com.danish.ideationzCalculator;

import java.util.Scanner;

public class Calculator extends CollectData {
	public static void main(String[] args) {
		double output;
    	CollectData data=new CollectData();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number:");
        try {
        data.setNum1(scanner.nextDouble());
        	
        }
        catch(Exception e) {
        	System.out.println("Please enter number only");
        	System.exit(0);
        }
        System.out.print("Enter second number:");
        try {
        data.setNum2(scanner.nextDouble());
        }
        catch(Exception e) {
        	System.out.println("Please enter number only");
        	System.exit(0);
        }

        System.out.print("Enter an operator (+, -, *, /): ");
        data.setOperator(scanner.next().charAt(0));

        scanner.close();
        if(data.getOperator()=='/' && data.getNum2()==0) {
        	System.out.println("can not divid by 0");
        	
        }
        
        else {
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
}
