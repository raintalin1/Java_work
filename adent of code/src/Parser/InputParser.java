package Parser;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class InputParser {


	private ArrayList<String> input;
	private File fileName;
	private String file;
	public InputParser(String fileName)
	{
		file=fileName;
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
	public String getInputLine(int x) throws IOException {
		String line = Files.readAllLines(Paths.get(file)).get(x);		
		return line;
	}
	public int getInputLineLengthAll() throws IOException {
		int line = Files.readAllLines(Paths.get(file)).size();	
		return line;
	}
	public ArrayList<String> getInput(){
		return input;
		
	}
}
