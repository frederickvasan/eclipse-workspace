package org.apibase;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class apibaseclass {
	
	public static RequestSpecification requestspec;
	public static Response response;
	// URL 
	     public static  void urllocator(String baseURL) {
	    	 RestAssured.baseURI = baseURL;
	    	 requestspec = RestAssured.given();
	    	 }
// Header Add
	     public static void headersadd(String ctname, String cttype) {
	    	 requestspec.header(ctname,cttype);
			}
	     // Query Add
	     public static void addquery(String paraname, String paravalue) {
	    	 requestspec.queryParam(paraname, paravalue);
    	}
	     // Path parameter
	      public static void addpath(String paraname, String paravalue) {
	    	  requestspec.pathParam(paraname, paravalue);
			}
	  //Get, POST, PUT and DELETE
	      public static  Response responseobj(String responsetype, String resource) {
	            switch (responsetype) {
				case "GET": {return requestspec.request(Method.GET, resource);}
				case "POST": {return requestspec.request(Method.POST, resource);}
				case "PUT": {return requestspec.request(Method.PUT, resource);}	
		  	default: {return requestspec.request(Method.DELETE, resource);}	
				}
		}
	      public static void printresponse(Response response) {
				String aspretty = response.body().asPrettyString();
				System.out.println(aspretty);
		}    
	      
	      public static void validateresponsecode(Response response, int expected ) {
				int Stcode = response.getStatusCode();
				System.out.println("Status Code : " + Stcode);
				Assert.assertEquals(expected, Stcode);
				System.out.println("Assertion completed/validation completed >> Status Code : " +Stcode);

		}
	      
	      public static  void setRequestBody(String name, String job, String status) {
	    	  JSONObject jobjects = new JSONObject();
	          jobjects.put("name", name);
	          jobjects.put("job", job);
	          jobjects.put("Status", status);
	          requestspec.body(jobjects.toString());
		}
}
