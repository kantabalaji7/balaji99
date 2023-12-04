package com.restassured.practice;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Example_GET {

	public static void main(String[] args) {
	    // Test Steps
		Response resp = RestAssured.get("https://reqres.in/api/users/200");
		int statuscode = resp.getStatusCode();
		System.out.println(statuscode);
		System.out.println(resp.getTime());
		System.out.println("===============");
		System.out.println(resp.asString());

	}

}
