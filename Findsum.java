class Findsum
{
	public static void main(String args[])
	{
		int no,temp,sum=0;
		for(int i=101;i<200;++i)
		{
			temp=i%7;
			if(temp==0)
			{
				sum=sum+i;
			}
		}
		System.out.print("Sum div by 7 between 100 & 200 is:-"+sum);
	}
}