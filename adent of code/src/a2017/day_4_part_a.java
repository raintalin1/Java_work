package a2017;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

import Parser.InputParser;

public class day_4_part_a {

	static InputParser p = new InputParser("input_day_4.txt");

	public static void main(String[] args) throws IOException {
		//gets the input numbers
		p.parseInput();//parses the input
		//p.printInput();
		int x=0, y=0, z=0;
		String hold=p.getInputLine(x);
		String[] hold1=hold.split(" ");

		for(int x1=0; x1<p.getInputLineLengthAll();x1++) {
			hold=p.getInputLine(x1);
			hold1=hold.split(" ");			
			for(int a=0; a<hold1.length;a++) {
				for(int b=0; b<hold1.length;b++) {
					if(Arrays.asList(hold1).indexOf(hold1[a])==Arrays.asList(hold1).indexOf(hold1[b])) {}
					else if(hold1[a]==hold1[b]) {
						y++;
						
					}
				}
			}
		}
		System.out.println(p.getInputLineLengthAll() + " - " + y + " = ");
		System.out.print(p.getInputLineLengthAll()-y);
	}

}
