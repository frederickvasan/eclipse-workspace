package org.jsontest;

//import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;




public class readjson {
	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader("C:\\Users\\fnobl\\eclipse-workspace\\Samplejson"
		  		+ "\\src\\test\\resources\\jsonfile\\jsonsample.json");
		
		JSONParser js = new JSONParser();
//		 js.parse(fr);
		Object ob = js.parse(fr);
		System.out.println(ob);
		JSONObject jo = (JSONObject) ob;
		Object empname = jo.get("empName");
		System.out.println(empname);
		System.out.println(jo.get("empId"));
		System.out.println(jo.get("empSkills"));
		System.out.println(jo.get("companyName"));
		System.out.println(jo.get("empAdd"));
		


	}
	
	
	
}
