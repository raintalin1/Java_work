package a2017;

public class day_3_part_b {
	
	public static void main(String[] args) {
		int X=11, Y=11;
		int x=0, y = 0, b=0,out =0, input=289326,t = Math.max(X,Y), maxI = t*t, midX = X/2, midY = Y/2, num = 1, dx = 0, dy = -1;
		int[][] aaa= new int[X][Y];
		String[][] xy = new String[X][Y];

		//aaa[x+midX][y+midY]=num;//init middle value with 1
		xy[x+midX][y+midY]="("+x+", "+ y+")";

		//x=2;y=2;

		for (int i=0; i < maxI; i++){
			if ((-X/2 <= x) && (x <= X/2) && (-Y/2 <= y) && (y <= Y/2)) {
				xy[x+midX][y+midY]="("+x+", "+ y+")";
				try {

					//corners
					if((x==y&&b!=0)&&(x>0||y>0)) //lower right pos, pos
					{
						aaa[x+midX][y+midY]+=aaa[x+midX-1][y+midY-1]+aaa[x+midX][y+midY-1];
					}

					if((x==-y&&b!=0)&&(-x>0||y>0)) {//upper right neg, pos
						aaa[x+midX][y+midY]+=aaa[x+midX+1][y+midY-1]+aaa[x+midX+1][y+midY];
					}

					if((x==y&&b!=0)&&(-x>0||-y>0)) {//upper left neg, neg
						aaa[x+midX][y+midY]+=aaa[x+midX][y+midY+1]+aaa[x+midX+1][y+midY+1];
					}

					if((-x==y&&b!=0)&&(x>0||-y>0)) {//lower left pos, neg
						aaa[x+midX][y+midY]+=aaa[x+midX-1][y+midY+1]+aaa[x+midX-1][y+midY]+aaa[x+midX][y+midY+1];
					}

					if((x>y&&-x>y)&&(x!=y||x!=-y)) {//left
						if(x==0&&y+1==0) {aaa[x+midX][y+midY]+=aaa[x+midX-1][y+midY]+aaa[x+midX-1][y+midY+1]+aaa[x+midX][y+midY+1]+aaa[x+midX+1][y+midY+1];}
						else if(x-1==y) {aaa[x+midX][y+midY]+=aaa[x+midX-1][y+midY]+aaa[x+midX-1][y+midY+1]+aaa[x+midX][y+midY+1]+aaa[x+midX+1][y+midY+1];}
						else if(x+1==-y) {aaa[x+midX][y+midY]+=aaa[x+midX-1][y+midY]+aaa[x+midX-1][y+midY+1]+aaa[x+midX][y+midY+1]+aaa[x+midX+1][y+midY+1];}
						else {aaa[x+midX][y+midY]+=aaa[x+midX-1][y+midY]+aaa[x+midX-1][y+midY+1]+aaa[x+midX][y+midY+1]+aaa[x+midX+1][y+midY+1];}
					}

					if((x>-y&&-x>-y)&&(x!=y||x!=-y)) {//right
						if(x==0&&y-1==0) {aaa[x+midX][y+midY]+=aaa[x+midX][y+midY-1]+aaa[x+midX+1][y+midY-1]+aaa[x+midX+1][y+midY];}
						else if(x+1==y) {aaa[x+midX][y+midY]+=aaa[x+midX+1][y+midY]+aaa[x+midX+1][y+midY-1]+aaa[x+midX][y+midY-1]+aaa[x+midX-1][y+midY-1];}
						else if(x-1==-y) {aaa[x+midX][y+midY]+=aaa[x+midX+1][y+midY]+aaa[x+midX+1][y+midY-1]+aaa[x+midX][y+midY-1];}
						else {aaa[x+midX][y+midY]+=aaa[x+midX+1][y+midY]+aaa[x+midX+1][y+midY-1]+aaa[x+midX][y+midY-1]+aaa[x+midX-1][y+midY-1];}
					}

					if((x<y&&x<-y)&&(x!=y||-x!=y)) {//up
						if(x+1==0&&y==0) {aaa[x+midX][y+midY]+=aaa[x+midX+1][y+midY]+aaa[x+midX+1][y+midY+1]+aaa[x+midX][y+midY+1];}
						else if(y+1==-x) {aaa[x+midX][y+midY]+=aaa[x+midX][y+midY+1]+aaa[x+midX+1][y+midY+1]+aaa[x+midX+1][y+midY]+aaa[x+midX+1][y+midY-1];}
						else if(y-1==x) {aaa[x+midX][y+midY]+=aaa[x+midX][y+midY+1]+aaa[x+midX+1][y+midY+1]+aaa[x+midX+1][y+midY]+aaa[x+midX+1][y+midY-1];}
						else {aaa[x+midX][y+midY]+=aaa[x+midX][y+midY+1]+aaa[x+midX+1][y+midY+1]+aaa[x+midX+1][y+midY]+aaa[x+midX+1][y+midY-1];}
					}
					if((-x<y&&-x<-y)&&(x!=y||-x!=y)) {//down
						if(x-1==0&&y==0) {aaa[x+midX][y+midY]+=aaa[x+midX-1][y+midY];}
						else if(y-1==-x) {aaa[x+midX][y+midY]+=aaa[x+midX-1][y+midY]+aaa[x+midX-1][y+midY+1];}
						else if(y+1==x) {aaa[x+midX][y+midY]+=aaa[x+midX-1][y+midY]+aaa[x+midX-1][y+midY-1]+aaa[x+midX][y+midY-1];}
						else {aaa[x+midX][y+midY]+=aaa[x+midX-1][y+midY]+aaa[x+midX-1][y+midY-1]+aaa[x+midX][y+midY-1]+aaa[x+midX-1][y+midY+1];}
					}

					if(b==0) {aaa[x+midX][y+midY]=1; b=1;}
				}
				catch(Exception e) 
				{
					System.out.println(e);
					break;
				}
				out++;
				if(aaa[x+midX][y+midY]>input) {
					break;
				}
			}

			if( (x == y) || ((x < 0) && (x == -y)) || ((x > 0) && (x == 1-y))) {
				t=dx; dx=-dy; dy=t;
			}   
			x+=dx; y+=dy;

		}
		System.out.println(out);
		
		for(int p=0; p<X; p++) {
			for(int l=0; l<Y; l++) {
				System.out.print(aaa[p][l]+"	");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int p=0; p<X; p++) {
			for(int l=0; l<Y; l++) {
				System.out.print(xy[p][l]+"|");
			}
			System.out.println();
		}

	}

}
