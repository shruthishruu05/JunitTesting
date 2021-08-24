package com.bridgelabz.JunitTesing;
public class BinaryToDecimal {
		static int binaryToDecimal(int n)
		{
			int number = n;
			int decValue = 0;
			int base = 1;

			int temp = number;
			while (temp > 0) {
				int lastDigit = temp % 10;
				temp = temp / 10;
				decValue += lastDigit * base;
				base = base * 2;
			}

			return decValue;
		}
		public static void main(String[] args)
		{
			int number = 10111;
			System.out.println(binaryToDecimal(number));
		}
	}
