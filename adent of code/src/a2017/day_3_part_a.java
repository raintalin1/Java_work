package a2017;
public class day_3_part_a {
	public static void main(String[] args) {
		day_3_part_a a = new day_3_part_a();
		a.Spiral(1001,1001);

	}
	public static void Spiral(int X, int Y) {
	    int x=0, y=0, dx = 0, dy = -1;
	    int t = Math.max(X,Y);
	    int maxI = t*t;
	    int num = 1;
	    int[][] aaa= new int[X][Y];
	    int midX = X/2;
	    int midY = Y/2,a,s;
	    int input = 289326;//input goes here
	    
	    for (int i=0; i < maxI; i++){
	        if ((-X/2 <= x) && (x <= X/2) && (-Y/2 <= y) && (y <= Y/2)) {
	            aaa[x+midX][y+midY]=num;
	            num++;
	        }

	        if( (x == y) || ((x < 0) && (x == -y)) || ((x > 0) && (x == 1-y))) {
	            t=dx; dx=-dy; dy=t;
	        }   
	        x+=dx; y+=dy;
	    }
	    
	    for(int loop1 = 0; loop1<aaa.length;loop1++)
	    {
	    	for(int loop2 = 0;loop2<aaa.length;loop2++)
	    	{
	    		if(aaa[loop1][loop2]==input)
	    		{
	    			System.out.println(loop1+" , "+loop2);
	    			a=loop1-midY;
	    			s=loop2-midX;
	    			System.out.println(a+" , "+s);
	    			System.out.println(Math.abs(a)+Math.abs(s));
	    		}
	    	}
	    }
	}
}
