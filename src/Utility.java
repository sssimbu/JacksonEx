import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class Utility{

	static ObjectMapper mapper= new ObjectMapper();
	
	
	public static String JavatoJson(Object data)
	{
		String jsonresult="";
		try {
			jsonresult=mapper.writeValueAsString(data);
		} catch (JsonGenerationException e) {
			System.out.println("json generation exception");
		} catch (JsonMappingException e) {
			System.out.println("json Mapping exception");
		} catch (IOException e) {
			System.out.println("json io exception");
		}
		return jsonresult;

	}
	
public static <T>T JsontoJava(String jsondata, Class <T> cls)
{
	T result=null;
	try {
		result=mapper.readValue(jsondata, cls);
	} catch (JsonParseException e) {
		System.out.println("jsonParse Exception");
	} catch (JsonMappingException e) {
		System.out.println("JsonMappingException Exception");
	} catch (IOException e) {
		System.out.println("IOException Exception");

	}
	return result;
}
	
	
	
}
