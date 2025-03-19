package org.serialization;

import java.io.File;
import java.util.ArrayList;
import com.fasterxml.jackson.databind.ObjectMapper;

public class serializationex {

	public static void main(String[] args) throws Exception {
		
	
	File fs = new File("C:\\Users\\fnobl\\eclipse-workspace\\Samplejson"
	  		+ "\\src\\test\\resources\\jsonfile\\jsonsampletest1.json");
	
	ObjectMapper map = new ObjectMapper();
	Catagory catagory = new Catagory(0, "name");
	ArrayList<String> photoUrls = new ArrayList<String>();
	photoUrls.add("String");
	
	Tags t1 = new Tags(0, "String");
	ArrayList<Tags> tags = new ArrayList<Tags>();
	tags.add(t1);
	
	petstore petstore = new petstore(0, catagory, "doggie", photoUrls, tags, "available");
	
	map.writeValue(fs, petstore);
	
	System.out.println("Writing happened !!!!!!");
		
	}
}
