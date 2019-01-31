package JavaExaplePractice.JavaExaplePractice;

public class SingletoneEmployeeClass
{
	private static SingletoneEmployeeClass single_instance_emp=null;
	
	public int empID ;
	
	private SingletoneEmployeeClass()
	{
		empID=12568;
	}
	
	public static SingletoneEmployeeClass SingletoneEmployeeClass()
	{
		if (single_instance_emp == null)
			single_instance_emp=new SingletoneEmployeeClass();
		return single_instance_emp;
	}
	
	public static void main(String[] args) {
		
		SingletoneEmployeeClass o1=SingletoneEmployeeClass.SingletoneEmployeeClass();
		SingletoneEmployeeClass o2=SingletoneEmployeeClass.SingletoneEmployeeClass();
		SingletoneEmployeeClass o3=SingletoneEmployeeClass.SingletoneEmployeeClass();
		
		System.out.println(o1.empID);
		System.out.println(o2.empID);
		System.out.println(o3.empID);
		
		o3.empID=111;
		
		System.out.println(o1.empID);
		System.out.println(o2.empID);
		System.out.println(o3.empID);
		
	}
	
}