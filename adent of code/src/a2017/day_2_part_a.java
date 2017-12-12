package a2017;


import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;

import Parser.InputParser;

public class day_2_part_a {

	public static void main(String[] args) throws FileNotFoundException {
		InputParser p = new InputParser("input.txt");//gets the input numbers
		p.parseInput();//parses the input
		int crawl=0;//num to call when crawling throung parts
		int[][] theSheet=new int[16][16];//array that holds the 2d array
		int[] diff=new int[16];
		
		StringBuilder spread= new StringBuilder();//makes a builder for the array
		spread.append(p.returnInput());//gets the input from file
		spread.deleteCharAt(0);//v
		spread.deleteCharAt(spread.length()-1);//gets rid of the [ ]
		
		String[] parts = spread.toString().split(", ");//gets rid of ", "
		
		for (int y=0; y<16 ; y++)//forloops to make a 2d array
		{
			for (int x=0; x<16 ; x++)
			{
				theSheet[y][x]=Integer.parseInt(parts[crawl]);
				crawl++;
			}
		}
		
		int low=2000000000;//stores lowest
		int high=0;//stores highest
		for(int x1=0,y=0; x1<16; x1++)//finds the differences
		{
			for(int x2=0; x2<16; x2++)
			{
				if (theSheet[x1][x2]>high)
				{
					high=theSheet[x1][x2];
				}
				if (theSheet[x1][x2]<low)
				{
					low=theSheet[x1][x2];
				}
			}
			diff[x1]=high-low;
			System.out.println(high+" - "+low+" = "+diff[x1]);
			high=0;
			low=2000000000;
		}
		
		int added=0;
		
		for(int x=0;x<16; x++)
		{
			added+=diff[x];
		}
		System.out.println(added);
	}
}
