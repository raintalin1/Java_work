package Parser;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class InputParser {


	private ArrayList<String> input;
	private File fileName;
	public InputParser(String fileName)
	{
		this.fileName = new File(fileName);
		input = new ArrayList<String>();
	}
	public void parseInput() throws FileNotFoundException {
		Scanner in = new Scanner(new FileReader(fileName));

		while(in.hasNext())
		{
			input.add(in.next());
		}
		in.close();
		
	}
	public void printInput() {
		System.out.println(input.toString());
	}
	public String returnInput() {
		return input.toString();
	}
	public String make2d() {
		//TODO make a 2d array maker
		return null;
	}
	public ArrayList<String> getInput(){
		return input;
		
	}
}
