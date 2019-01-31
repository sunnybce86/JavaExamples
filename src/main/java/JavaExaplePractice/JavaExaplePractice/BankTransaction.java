package JavaExaplePractice.JavaExaplePractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;

public class BankTransaction {

	enum Department 
	{ 
	    IT,Finacne,HR;
 
	} 
	
	public static  Map<Department,Integer> bankOfBrodaData() {
		Map<Department , Integer> bob = new HashMap<Department, Integer>();
		bob.put(Department.IT, 100);
		bob.put(Department.Finacne, 500);
		return bob;
		 
	}
    public static  Map<Department,Integer> bankOfOfIndiaData() {
		
    	Map<Department , Integer> boi = new HashMap<Department, Integer>();
    	boi.put(Department.IT, 600);
    	boi.put(Department.HR, 400);
    	return boi;
		 
	}
    public static Map<Department,Integer> bankOfAmericaData() {
    	Map<Department , Integer> bos = new HashMap<Department, Integer>();
    	bos.put(Department.HR, 150);
    	bos.put(Department.Finacne, 160);
		 return bos;
	}
	
	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		
		//Map<Department,List<Integer>> map = new HashMap<Department,List<Integer>>(); 
		List<Integer> amtIT= new ArrayList<Integer>();
		List<Integer> amtFinacne= new ArrayList<Integer>();
		List<Integer> amtHR= new ArrayList<Integer>();
		Map<Department,Integer> baroda=bankOfBrodaData();
		Map<Department,Integer> india=bankOfOfIndiaData();
		Map<Department,Integer> america=bankOfAmericaData();
		
		baroda.forEach((k,v) -> {
			 
			// System.out.println(k.equals(Department.IT));
			 if(k.equals(Department.IT))
			 {
				 amtIT.add(v);
				// map.put(Department.IT, amtIT);
			 }
			 if(k.equals(Department.Finacne))
			 {
				 amtFinacne.add(v);
				// map.put(Department.Finacne, amtFinacne);
			 }
			 if(k.equals(Department.HR))
			 {
				 amtHR.add(v);
				// map.put(Department.HR, amtHR);
			 }
		 });
	 
		india.forEach((k,v) -> {
			 
			 //System.out.println(k.equals(Department.IT));
			 if(k.equals(Department.IT))
			 {
				 amtIT.add(v);
				// map.put(Department.IT, amtIT);				 
				    
			 }
			 if(k.equals(Department.Finacne))
			 {
				 amtFinacne.add(v);
				// map.put(Department.Finacne, amtFinacne);
			 }
			 if(k.equals(Department.HR))
			 {
				 amtHR.add(v);
				// map.put(Department.HR, amtHR);
			 }
		 });
		america.forEach((k,v) -> {
			 
			 //System.out.println(k.equals(Department.IT));
			 if(k.equals(Department.IT))
			 {
				 amtIT.add(v);
				// map.put(Department.IT, amtIT);
			 }
			 if(k.equals(Department.Finacne))
			 {
				 amtFinacne.add(v);
				// map.put(Department.Finacne, amtFinacne);
			 }
			 if(k.equals(Department.HR))
			 {
				 amtHR.add(v);
				// map.put(Department.HR, amtHR);
			 }
		 });
		
		
		 System.out.println("IT Department Amount transfer by all banks-->"+amtIT.stream().mapToInt(i->i).sum());
		 System.out.println("Finacne Department Amount transfer by all banks-->"+amtFinacne.stream().mapToInt(i->i).sum());
		 System.out.println("HR Department Amount transfer by all banks-->"+amtHR.stream().mapToInt(i->i).sum());
		 
		 int itSum=0;
		 for(Integer itAmount :amtIT)
		 {
			 itSum=itSum+itAmount;
		 }
		 System.out.println( Department.IT+" Amount transfer by all banks-->"+ itSum);
	}
	
}
