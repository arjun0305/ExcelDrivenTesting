package arrays;

public class MultidimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][] = new int[2][3];
		a[0][0]=2;
		a[0][1]=4;
		a[0][2]=6;
		a[1][0]=8;
		a[1][1]=10;	
		a[1][2]=12;
		
		System.out.println(a[1][1]);
		
		for (int i=0;i<2;i++)
		{
			for (int j=0;j<3;j++)
			{
				System.out.println(a[i][j]);
			}
		}
			System.out.println();
		int b[][] = {{14,16,18},{20,22,24}};
		System.out.println(b[1][2]+"\n");
		
		for (int i=0;i<2;i++)
		{
			for (int j=0;j<3;j++)
			{
				System.out.println(b[i][j]);
			}
		}
		
		
	}

}
