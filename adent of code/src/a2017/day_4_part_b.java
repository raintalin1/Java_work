package a2017;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import Parser.InputParser;

public class day_4_part_b {

	static InputParser p = new InputParser("input_day_4.txt");

	public static void main(String[] args) throws IOException {
		p.parseInputLine();
		String hold = "";
		String[] split;
		ArrayList <String> hold2=new ArrayList<String>();
		char[] sort;
		int valid=p.getInputLineLengthAll(), b=0;

		for (int i = 0; i<p.getInputLineLengthAll();i++) {//gets the specific line to remove [ and ] in the string
			split=p.specificReturnInput(i).split(" ");
			for (int x=0; x<split.length; x++) {//loop to put the sorted phrases into a holding array
				sort = split[x].toCharArray();
				Arrays.sort(sort);
				for (int y=0; y<sort.length;y++) {//puts the chars into a string
					hold+=sort[y];
				}//3
				hold2.add(hold);//puts the string into a arraylist so we can parse through and see if anything matches
				hold = "";
			}//2
			for (int x=0; x<hold2.size();x++) {//loop to get the element for the first word
				for (int y=0; y<hold2.size();y++) {//loop to get the element for the second word
					if (hold2.get(x).equals(hold2.get(y)) && x!=y) {//tests to see if its valid
						valid--;
						System.out.println("match: " + i + " " + hold2.get(x) + " " + hold2.get(y));
						b=1;
						break;
					}
				}//3
				if (b==1) {
					b=0;
					break;
				}
			}//2
			hold2.clear();
		}//1
		System.out.println(valid);
	}
}

