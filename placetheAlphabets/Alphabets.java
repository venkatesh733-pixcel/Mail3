package placetheAlphabets;

import java.util.*;
public class Alphabets {
	public static void main(String[] args) {
		int inp[]= {4,5,2,8,-99,67};
		System.out.println(placeTheAlphabets(inp));
	}
static public char[] placeTheAlphabets(int[] input1)
	
	{
		
		int arr[]=new int[input1.length];
		char ret[]=new char[input1.length];
		for(int i=0;i<input1.length;i++)
		{
			arr[i]=input1[i];
			
		}
		Arrays.sort(arr);
		for(int i=0;i<input1.length;i++)
		{for(int j=0;j<input1.length;j++)
		{if(arr[i]==input1[j])
		{
			ret[j]=(char)(97+i);
		}
		}}
	
		return ret;
	}
	}
