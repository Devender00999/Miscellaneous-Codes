public class MazePathDiagonalDP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(MPDiagonalRecursion(0, 0, 2, 2));
//		System.out.println(MPDiagonalTD(0, 0, 100, 100, new int[101][101]));
		System.out.println(MPDiagonalBU(100, 100));
	}
	public static int MPDiagonalRecursion(int cr,int cc,int er,int ec) {
		if(cr==er&&cc==ec) {
			return 1;
		}
		if(cc>ec||cr>er) {
			return 0;
		}
		int c=0;
		c+=MPDiagonalRecursion(cr+1, cc, er, ec);
		c+=MPDiagonalRecursion(cr, cc+1, er, ec);
		c+=MPDiagonalRecursion(cr+1, cc+1, er, ec);
		return c;
	}
	public static int MPDiagonalTD(int cr,int cc,int er,int ec,int[][] strg) {
		if(cr==er&&cc==ec) {
			return 1;
		}
		if(cc>ec||cr>er) {
			return 0;
		}
		if(strg[cr][cc]!=0) {
			return strg[cr][cc];
		}
		int c=0;
		c+=MPDiagonalRecursion(cr+1, cc, er, ec);
		c+=MPDiagonalRecursion(cr, cc+1, er, ec);
		c+=MPDiagonalRecursion(cr+1, cc+1, er, ec);
		strg[cr][cc]=c;
		return c;
	}
	public static int MPDiagonalBU(int er,int ec) {
		int[][] strg=new int[er+2][ec+2];
		for(int i=er;i>=0;i--) {
			for(int j=ec;j>=0;j--) {
				if(er==i||ec==j) {
					strg[i][j]=1;
				}else {
					strg[i][j]=strg[i][j+1]+strg[i+1][j]+strg[i+1][j+1];
				}
			}
		}
		return strg[0][0];
	}
}
