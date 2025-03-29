package org.testngapi;

import org.apibase.apibaseclass;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class testngapi  extends apibaseclass{
	
	@Test
	      private void test1() {
			urllocator("https://reqres.in/");
			headersadd("Content-Type", "application/json");
			addquery("page", "2");
			Response response = responseobj("GET", "/api/users");
			printresponse(response);
			validateresponsecode(response, 200);
		}

	   @Test
	   private void test2() {
		   urllocator("https://reqres.in/");
		   headersadd("Content-Type", "application/json");
		   addpath("page", "2");
		   Response response = responseobj("GET",  "/api/users/{page}");
			printresponse(response);
			validateresponsecode(response, 200);
	}
	   @Test
	   private void testpost() {
		   urllocator("https://reqres.in/");
		   headersadd("Content-Type", "application/json");
            setRequestBody("Mani", "Dev", "Active");
			   Response response = responseobj("POST",  "/api/users");
				printresponse(response);
				validateresponsecode(response, 201);
	}
	   @Test
	   private void testput() {
		   urllocator("https://reqres.in/");
		   headersadd("Content-Type", "application/json");
		     setRequestBody("Frederick", "Testing", "Active");
		     addpath("page", "2");
		   Response response = responseobj("PUT",  "/api/users/{page}");
			printresponse(response);
			validateresponsecode(response, 200);
	}
	   @Test
	   private void testdelete() {
		   urllocator("https://reqres.in/");
		   headersadd("Content-Type", "application/json");
		   addquery("page", "2");
		   Response response = responseobj("DELETE", "/api/users");
			printresponse(response);
			validateresponsecode(response, 204);
	}
}
