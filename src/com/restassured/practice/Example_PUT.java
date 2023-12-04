package com.restassured.practice;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Example_PUT {

	public static void main(String[] args) {
	
	    //Test Steps
		JSONObject data = new JSONObject();
		data.put("empid", "103");
		data.put("empname", "ksuresh");

		Response resp = RestAssured.given().
		                contentType(ContentType.JSON).
		                body(data.toJSONString())
		                .put("https://reqres.in/api/users/2");
		System.out.println(resp.getStatusCode());
		System.out.println(resp.getTime());
		System.out.println("=========================");
		System.out.println(resp.asString());

	}

}
