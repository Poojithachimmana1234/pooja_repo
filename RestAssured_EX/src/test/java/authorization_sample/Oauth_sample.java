package authorization_sample;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.ResponseOptions;

public class Oauth_sample {
	
	@Test
	void two() {
		RestAssured.baseURI="https://api.github.com";
		String ep = "/users/Poojithachimmana1234/repos";
		String token = "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";
		
		
		ResponseOptions res2=(ResponseOptions)RestAssured
				.given()
				.auth().oauth2(token)
				.get(ep).getBody();
		System.out.println(res2.toString());
	}

}
