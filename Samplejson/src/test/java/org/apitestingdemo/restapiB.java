package org.apitestingdemo;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class restapiB {

	public static void main(String[] args) {
		
		RestAssured.baseURI = "https://reqres.in/";
		RequestSpecification request = RestAssured.given();
		request.headers("Content-Type", "application/json" );
		 
		JSONObject jobjects  = new JSONObject();
		jobjects.put("name", "Gerold");
		jobjects.put("job", "Testing");
		request.body(jobjects.toString());
		request.pathParam("page", "2");
		Response response = request.request(Method.PUT, "/api/users/{page}");
		String aspretty = response.body().asPrettyString();
		System.out.println(aspretty);
		
		int Stcode = response.getStatusCode();
		System.out.println("Status Code : " + Stcode);
		Assert.assertEquals(200, Stcode);
		System.out.println("Assertion completed/validation completed >> Status Code : " +Stcode);
		}
}
