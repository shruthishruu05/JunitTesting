package com.bridgelabz.JunitTesing;

public class SquareRoot {
	
	public static void Sqrt(double c)
	{
		double t =c;
		double epsilon = 1*Math.E-15;
		double average = 0.5*((c/t)+t);
		while(Math.abs(t - c/t) < epsilon*t)
		{
			average = Math.abs(t - c/t);
			
		}	
		System.out.println(average);
	}
	public static void main(String[] args)
	{
		double c = 250;
		Sqrt(c);
	}

}
