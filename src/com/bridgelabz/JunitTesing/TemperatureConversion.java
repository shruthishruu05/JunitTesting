package com.bridgelabz.JunitTesing;
import java.util.*;
public class TemperatureConversion {
	public static int fahrenheit = 0;
	public static int celsius = 0;
	
	public static void FahrenheitToCelsius(double fahrenheit)
	{
		fahrenheit = (fahrenheit-32)*5/9;
		System.out.println("the Temperature in celsius is "+fahrenheit);
		
	}
	public static void CelsiusToFahrenheit(double fahrenheit)
	{
		fahrenheit = (celsius*9/5)+32;
		System.out.println("the Temperature in celsius is "+fahrenheit);
		
	}
	
	
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Fahrenheit tempeature");
		fahrenheit = in.nextInt();
		FahrenheitToCelsius(fahrenheit);
		System.out.println("Enter celsius tempeature");
		celsius = in.nextInt();
		CelsiusToFahrenheit(celsius);		
		
	}

}
