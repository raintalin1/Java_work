package a2017;

import java.io.FileNotFoundException;
import java.io.IOException;

import Parser.InputParser;

public class day_4_part_a {

	public static void main(String[] args) throws IOException {
		InputParser p = new InputParser("input_day_4.txt");//gets the input numbers
		p.parseInput();//parses the input
		//p.printInput();
		
		String[] lineHold ; 
		int safePass=0, crawl=0;
		String scan1="", scan2=""; 
		
		for(int x=0;)
		System.out.print(p.getInputLine(1, "input_day_4.txt"));
		

	}

}
