package com.restassured.practice;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Example_DELETE {

	public static void main(String[] args) {
	    // Test Steps
		Response resp = RestAssured.delete("https://reqres.in/api/users/2");
		int statuscode = resp.getStatusCode();
		System.out.println(statuscode);
		System.out.println(resp.getTime());
		System.out.println("===============");
		System.out.println(resp.asString());

	}

}
