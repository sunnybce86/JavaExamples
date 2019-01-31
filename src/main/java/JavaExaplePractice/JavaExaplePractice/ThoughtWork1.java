package JavaExaplePractice.JavaExaplePractice;

public class ThoughtWork1 {

	public static void main(String[] args) {
		int i,j;
		
		int a;
		for(a=1;a<25;a++)
		{
			a=a;
		}
		
		for(i=0;i<7;i++)
		{
			
			for(j=0;j<7;j++)
			{			
				if(j==3)
				{
					System.out.print(a);
					
				}else
				{
					System.out.print("-");
				}
				
				
			}
			System.out.println("  ");
		}
		
	}
}
