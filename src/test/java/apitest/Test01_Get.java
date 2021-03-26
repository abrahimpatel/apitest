package apitest;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
//io.restassured.RestAssured.*
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class Test01_Get {
	
	@Test
	void Test_01()
	{
		Response Res = get("https://reqres.in/api/users?page=2");
		System.out.println("Status code:"+Res.getStatusCode());
		System.out.println("Response Body:"+Res.getBody());
		System.out.println("Response String:"+Res.asString());
		int statuscode = Res.getStatusCode();
		Assert.assertEquals(statuscode, 200);
	}
	@Test
	void Test_02()
	{
		given()
		.get("https://reqres.in/api/users?page=2")
		.then().statusCode(200);
	}
}
