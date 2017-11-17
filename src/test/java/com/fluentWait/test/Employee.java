package com.fluentWait.test;


import static com.jayway.restassured.RestAssured.*;
import static com.jayway.restassured.RestAssured.get;
import static com.jayway.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class Employee {
	
	@Test
	public void validateEmployee() {
		given().get("http://localhost:3000/posts").then().statusCode(200).log().all();
	}

}
