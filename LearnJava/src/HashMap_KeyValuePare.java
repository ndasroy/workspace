import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Collections;


public class HashMap_KeyValuePare 
{
	public static void main(String[] args) 
	
	{
		// in HashMap,Key can't be duplicate,it overwrites the previous value. Values can be duplicate.
		
		HashMap<String,String> map=new HashMap<String,String>();
		map.put("UserName", "Ajay");
		map.put("Password", "12345");
		//map.put("UserName", "Jay");				// Key's same, It overwrites the previous value
		
		map.put("Username", "Ajay");				// Key's different,so it's allowed
		
		String uName =map.get("UserName");
		System.out.println(uName);
		
		String uName1 =map.get("Username");
		System.out.println(uName1);
		

	}

}
