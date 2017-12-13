package Token_based_Formatter;

public class TokenStore {

	private String token;
	
	public TokenStore(){
		token="";
	}
	

	public void tokenParse(int i, String t) {
		String[] words = t.split(" ");//splits it to get the words
		int hight=words.length/i;//gets the num of words in t and divides it by i to get the height of the array
		StringBuilder construct=new StringBuilder();//this constructs the string for output
		int wordsCrawl=0;//int to crawl through words

		if(words.length%i>0)//if the t isnt evenly divided then add 1 to hight
		{
			hight++;
		}

		for(int y=0; y<hight; y++)//constructs the token
		{
			for(int x=0; x<i; x++)
			{
				if(wordsCrawl<words.length)
				{
					construct.append(words[wordsCrawl]);
					construct.append(" ");
					wordsCrawl++;
				}
			}
			construct.append("\r");
		}
		token+=construct.toString();//make the string "token" to be the token
	}

	public void tokenReport() {//prints the output
		System.out.println("the ouput is: "+"\r"+token);
	}
	
}
