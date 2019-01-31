package JavaExaplePractice.JavaExaplePractice;
//Complete this code or write your own from scratch
import java.util.*;
import java.util.Map.Entry;
import java.io.*;

class Solution{
	public static void main(String []argh)
	{
		 
      HashMap<String,String> phoneRecord = new HashMap<>();
      phoneRecord.put("test", "465465465");
      phoneRecord.put("sunny", "34655555");
      phoneRecord.put("", "" );
      
      Iterator<Map.Entry<String, String>> itr = phoneRecord.entrySet().iterator();
		while(itr.hasNext())
		{
           
          Entry<String, String> entry = itr.next();
          
          if((entry.getKey()!=""))
          {     
          System.out.println( entry.getKey() + " " + entry.getValue());
          }
          else{
              System.out.println("Not Found");
          }
          
		}

	}
}



