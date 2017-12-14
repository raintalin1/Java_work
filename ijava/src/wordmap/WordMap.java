package wordmap;

import java.text.*;
import java.util.ArrayList;

public class WordMap {
	int[] percent=new int[15], intHold=new int[15];
	int hold;
	DecimalFormat NF = new DecimalFormat("#.00");
	ArrayList<String> tempHold = new ArrayList<String>();
	
	public WordMap(){
		
	}

	public void wordParser(String line)
	{
		String[] split1=line.split(""), split2=line.split(" ");
		StringBuilder splited=new StringBuilder();
		

		for(String s : split1){
			String[] s2 = s.split("");			
			for(String results : s2){
				if (results.matches(" ")){splited.append(" ");}
				else if (results.matches(".")){}
				else if (results.matches("[^a-zA-Z. ]")){}
				else{splited.append(results);}
			}
		}
		//System.out.print(splited.toString());
		split2=splited.toString().split(" ");
		split1=splited.toString().split(" ");
		hold=splited.toString().length();
		
		for(int x=0; x<14;x++){
			for(int y=0; y<split1.length;y++){
				if(split1[y].toString().length()==x+1){ percent[x]++; 
				}
				if(split1[y].toString().length()>=15){ percent[x]++; 
				}
			}
		}
	}

	public void wordReport()
	{
		for(int x= 0; x<=14;x++){
			System.out.print("Percentage of ");
			System.out.print(x+1);
			System.out.print(" length: ");
			System.out.print(NF.format((double) percent[x]*100/hold));
			
			System.out.println();
			
		}
	}
}

