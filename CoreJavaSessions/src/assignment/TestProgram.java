package assignment;

public class TestProgram {

	public static void main(String[] args)
	{
		int i,j,sum=0,ar[]= {2,5,7,4};
		for (i=3;i>0;i--)
		{
			for(j=0;j<4;j++)
			{
				if((ar[i]%2)!=0)
				{
					ar[j]=ar[i]/2;
				}
				else
				{
					ar[j]=ar[j]*2;
				}
			}
		}
		//int k=0;
		sum=sum+ar[0]+ar[2];
		System.out.print(sum);
		}
}