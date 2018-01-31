package a2017;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

import Parser.InputParser;

public class day_4_part_a {

	static InputParser p = new InputParser("input_day_4.txt");
	
	public static void main(String[] args) throws IOException {

		p.parseInputLine();
		String[] hold;
		String hold2 = null;
		int valid=p.getInputLineLengthAll(), b=0;

		for (int x=0;x< p.getInputLineLengthAll(); x++) {//puts line into holder array for looking through
			hold= p.specificReturnInput(x).split(" ");

			for(int y=0; y<hold.length;y++) {//loop to get the word for testing 
				hold2 = hold[y];

				for(int z=0; z<hold.length;z++) {//loop to test the word
					if (hold2.equals(hold[z])&&y!=z) {//tests to see if line has word
						valid--;
						b=1;
						break;
					}
				}//3 loop
				if (b==1) {
					b=0;
					break;
				}
			}//2 loop
		}//1 loop
		System.out.println(valid);
	}
}