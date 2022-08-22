package com.epam.tasks.lesson6;

import java.util.Scanner;

public class Task131
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		String[] camelNames = new String[] {"firstPart", "getElement", "isTwoDigitNumber", "checkInput"};
		String[] snakeNames = toSnakeCase(camelNames);
		
		for(String el : snakeNames)
		{
			System.out.println(el.substring(4) + " ");
		}
	}
	
	public static String[] toSnakeCase(String[] camelNames)
	{
		String[] snakeNames = new String[camelNames.length];
		
		for(int i = 0; i < camelNames.length; i++)
		{
			for(int j = 0; j < camelNames[i].length(); j++)
			{
				if(Character.isUpperCase(camelNames[i].charAt(j)))
				{
					snakeNames[i] += "_" + (camelNames[i].charAt(j) + "").toLowerCase();
				}
				else
				{
					snakeNames[i] += camelNames[i].charAt(j);
				}
			}
		}
		return snakeNames;
	}
}
