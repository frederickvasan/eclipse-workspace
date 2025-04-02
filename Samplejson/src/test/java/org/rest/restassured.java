package org.rest;

import org.json.simple.JSONObject;
import static org.hamcrest.Matchers.equalTo;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class restassured {
	
	public static void main(String[] args) {
		
	//1
	Response response1 = RestAssured.given().baseUri("https://reqres.in").get("/api/users?page=2");
	System.out.println(response1.getBody().asPrettyString());
	System.out.println(" <<<<<<<<<<<<< Rest assured logic 1 >>>>>>>>>>>>>>>>>>");
	
	//2
	Response response2 = RestAssured.given().baseUri("https://reqres.in").queryParam("page", "2").when().get("/api/users");
	System.out.println(response2.getBody().asPrettyString());
	System.out.println(" <<<<<<<<<<<<< Rest assured logic 2 >>>>>>>>>>>>>>>>>>");

	//3
	RestAssured.given()
	.accept(ContentType. JSON)
	.log().all()
	.queryParam("page", "2")
	.baseUri("https://reqres.in")
	.when()
	.get("/api/users")
	.then()
	.statusCode(200)
	.log().all();
	System.out.println(" <<<<<<<<<<<<< Rest assured logic 3 >>>>>>>>>>>>>>>>>>");
	
	
	//4
	// post req
	JSONObject jsonObject = new JSONObject();
	jsonObject.put("name", "Frederick");
	jsonObject.put("job", "QA");

	RestAssured.given()
	.accept(ContentType. JSON)
	.log().all()
	.baseUri("https://reqres.in")
	.when()
	.body(jsonObject)
	.post("/api/users")
	.then()
	.statusCode(201)
	.log().all();
	System.out.println(" <<<<<<<<<<<<< Rest assured logic 4 >>>>>>>>>>>>>>>>>>");

		 
     JSONObject jsonObjects = new JSONObject();
     jsonObjects.put("name", "John Doe");
     jsonObjects.put("job", "Senior QA Engineer");

     RestAssured.given()
        .baseUri("https://reqres.in/api")
         .header("Content-Type", "application/json")
         .body(jsonObjects.toString())
         .when()
         .put("/users/2")  // Updating user with ID 2
         .then()
         .statusCode(200)
         .log().all();
     
 	System.out.println(" <<<<<<<<<<<<< Rest assured logic 5 >>>>>>>>>>>>>>>>>>");
 	
 	
 	RestAssured.given()
	.accept(ContentType. JSON)
	.log().all()
	.baseUri("https://reqres.in/api")
	.when()
	.delete("/users/2")
	.then()
	.statusCode(204)
	.log().all();
 	System.out.println(" <<<<<<<<<<<<< Rest assured logic 6 >>>>>>>>>>>>>>>>>>");
 	
	}
}
