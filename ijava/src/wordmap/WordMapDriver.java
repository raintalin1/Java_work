package wordmap;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class WordMapDriver {

	public static void main(String[] args) {
		String fileName;
		Scanner nameReader = new Scanner(System.in);
		System.out.println("enter a file name: ");
		fileName = nameReader.nextLine();
		
		WordMap p=new WordMap();
		
		try 
		{
			Scanner scan= new Scanner(new FileReader(fileName));
			
			while(scan.hasNext()){p.wordParser(scan.nextLine());}
			
			p.wordReport();
			scan.close();
			
		} 
		catch (FileNotFoundException e){ e.printStackTrace(); }
	}
}
