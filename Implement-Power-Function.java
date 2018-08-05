public class Solution {
	public int pow(int x, int n, int d) {
		int temp=n;
	    if(temp==0)
        {
            return 1;
        }
		else if(x==0)
		{
			return 0;
		}	
        else if(temp==1)
        {
			if(x<0)
			{
				x = abs(x);
				return (x%d);
			}
            return(x%d);
        }
		else
		{
			long long rem= x%d;
			long mul= 1;
			while(temp!=0)
			{
				int m =temp/2;
				int r1 =temp%2;
				if(r1==1)
					{
						mul= (mul*rem)%d;
					}
				temp=m;
				rem=(rem*rem)%d;
			}
			long s1=mul+d;
	    return(int)(s1%d);
		}
	}
}
