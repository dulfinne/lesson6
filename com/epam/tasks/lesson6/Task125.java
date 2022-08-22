package com.epam.tasks.lesson6;

import java.util.Scanner;

public class Task125
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		String str = scan.nextLine();
		if (str.length() % 2 == 1)
		{
			str += " ";
		}
		
		String codedText = sandwichCoding(str);
		String decodedText = sandwichDecoding(codedText);
		
		System.out.println(codedText);
		System.out.println(decodedText);

	}
	
	public static String sandwichCoding(String str)
	{
		String first = str.substring(0, str.length() / 2);
		String second = str.substring(str.length() / 2);
		
		String result = "";
		for(int i = 0; i < first.length(); i++)
		{
			result += ("" + first.charAt(i)) + ("" + second.charAt(i));
		}
		
		return result;
	}
	
	public static String sandwichDecoding(String str)
	{
		String first = "";
		String second = "";
		for(int i = 0; i < str.length() - 1; i++)
		{
			first += str.charAt(i);
			second += str.charAt(++i);
		}
		
		return first + second;
	}
}
