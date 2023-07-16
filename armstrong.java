public class armstrong {

	public void armstrongs(int a)
	{
	int r,temp,sum=0;
	temp=a;
	while(a!=0)
	{
		r=a%10;
		sum=sum+(r*r*r);
		a=a/10;
	}
	
	if(temp==sum)
	{
		System.out.print("Armstrong Number ");
	}
	else
	{
		System.out.print("Not an Armstrong Number ");
	}
	
}

	public static void main(String[] args) {
		armstrong a = new armstrong();
		a.armstrongs(371);

	}

}
