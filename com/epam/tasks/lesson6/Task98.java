package com.epam.tasks.lesson6;

import java.util.Scanner;

public class Task98
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		String[] input = scan.nextLine().split(" ");
		int maxCount = 0;
		int iFreq = 0;
		for(int i = 0; i < input.length; i++)
		{
			int count = 0;
			for(int j = 0; j < input.length; j++)
			{
				if(input[i].equals(input[j]))
				{
					count++;
				}
			}
			if (count > maxCount)
			{
				maxCount = count;
				iFreq = i;
			}
		}
		System.out.println("The most frequent word is " + input[iFreq]);
		
		for(String el : input)
		{
			if(inOrder(el))
			{
				System.out.print(el + " ");
			}
		}
	}
	
	public static boolean inOrder(String el)
	{
		if(el.length() == 0)
			return false;
		
		for(int i = 0; i < el.length() - 1; i++)
		{
			if(el.charAt(i) > el.charAt(i + 1))
			{
				return false;
			}
		}
		
		return true;
	}
}
