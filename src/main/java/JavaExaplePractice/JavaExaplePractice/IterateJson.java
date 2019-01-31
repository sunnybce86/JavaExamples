package JavaExaplePractice.JavaExaplePractice;

import java.io.File;
import java.io.IOException;
import java.util.List;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class IterateJson {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		String json="[{\r\n" + 
				"  \"name\": \"sharath\",\r\n" + 
				"  \"id\": 1,\r\n" + 
				"  \"address\": {\r\n" + 
				"    \"street\": \"abc\",\r\n" + 
				"    \"pin\": 507123\r\n" + 
				"  }\r\n" + 
				"}]";
		ObjectMapper mapper1= new ObjectMapper();
		
	  JsonNode json1	= mapper1.createObjectNode();
	   
		//List<Person> person=mapper.readValue(json,mapper.getTypeFactory().constructCollectionLikeType(List.class, Person.class));
		File file=new File("C:\\Users\\sunny.singh\\Desktop\\sample.json");
 
		 //Person  person = mapper.readValue(file ,  Person.class);
		List<Person>  person = null;
		person   = mapper1.readValue(json, new TypeReference<List<Person>>(){});
		
			 for(Person p:person)
			 {
				 System.out.println(p.getAddress().getPin());
			 }
		System.out.println(person);
		System.out.println(mapper1.writeValueAsString(person));
		
		
		
	}
}
