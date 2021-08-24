package com.bridgelabz.JunitTesing;
import java.util.Scanner;
public class VendingMachine 
{
	static int notes[]= {1000,500,50,5,2,1};
	static int money;
	static int changeNotes;
	public static void VendingMachine2(int notes[],int money,int indexVal)
	{
		int index = indexVal;
		int remainder;
		if(money>0) {
			changeNotes = money/notes[index];
			remainder = money%notes[index];
			money = remainder;
			if(changeNotes != 0)
				System.out.println("The " +notes[index]+ " is " +changeNotes);
			VendingMachine2(notes,money,++indexVal);
		}
		else
			return;
	}
	public static void main(String[] args)
	{
		
		Scanner in =new Scanner(System.in);
		System.out.println("Enter the money to know the number of notes");
		money = in.nextInt();
		System.out.println("money entered "+money);
		VendingMachine2(notes,money,0);
	}
	public static void VendingMachine(int notes[],int money)
	{
		int index = 0;
		int remainder;
		while(money>0)
		{
			if(money>=notes[index])
			{
				changeNotes = money/notes[index];
				remainder = money%notes[index];
				money = remainder;
				System.out.println("The " +notes[index]+ " is " +changeNotes);
			}
			index++;
		}	
	}
}
		
		