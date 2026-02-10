package authorization_sample;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Github_EXP {
	@Test
	public void two() {
		RestAssured.baseURI = "https://api.github.com";
		RestAssured.basePath = "/users/Poojithachimmana1234/repos";
		
		RequestSpecification requestspec = RestAssured.given();
		requestspec.header("Authorization", "Bearer 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");
				
		Response response = requestspec.get();
		
				
		JsonPath jsonpath = response.jsonPath();
		String reposname = jsonpath.getString("name");
		
		System.out.println(reposname);
		
		Assert.assertEquals(response.statusCode(),401);
		
	}

}
