package Token_based_Formatter;
import java.util.Scanner;

public class TokenDriver{
	public static void main(String[] args){
		
		System.out.println("enter number of words to display per line");
		Scanner scan = new Scanner(System.in);
		int i=scan.nextInt();
		
		System.out.println("Enter lines of text, type two returns in a row to end");
		Scanner scan1 = new Scanner(System.in);
		String t = " ";
		TokenStore p = new TokenStore();
		while(t.length() > 0){
			t = scan1.nextLine();
			p.tokenParse(i,t);
		}
		p.tokenReport();
	}
} 