package org.apitestingdemo;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class restapiA {
	
	public static void main(String[] args) {
		RestAssured.baseURI = "https://reqres.in/";
		RequestSpecification request = RestAssured.given();
		request.headers("Content-Type", "application/json" );
		request.pathParam("page", "2");
		Response response = request.request(Method.GET, "/api/users/{page}");
		
		String asPretty = response.body().asPrettyString();
		System.out.println(asPretty);
		
		int stcode = response.getStatusCode();
		System.out.println("Status Code : " +stcode);
		Assert.assertEquals(200, stcode);
		System.out.println("Assertion completed/validation completed >> Status Code : " +stcode);
	}
}
