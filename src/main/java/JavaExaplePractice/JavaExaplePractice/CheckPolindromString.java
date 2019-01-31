package JavaExaplePractice.JavaExaplePractice;

public class CheckPolindromString {
	public static void main(String[] args) {
		String str="testmadam";
		
		
		//Boolean flag=false;
		for(int i=0;i<=str.length()-1;i++)
		{
			int o = 1;
						for (int j = i+1; j <= str.length()-1; j++) {
				
							if(o!=2)
							{

				if(str.charAt(i)==str.charAt(j))
				{
					for (int k = i; k <= j-i; k++) {
						
						System.out.println(str.charAt(k));
						
						if(k==j-i)
						{
							o=2;
							
						}
						
												
					}
					
					//flag= true;
				}
				}
				
				
				//flag=false;	
			}
			
	
		}
		
		/*if(flag==true)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}*/
	}

}
