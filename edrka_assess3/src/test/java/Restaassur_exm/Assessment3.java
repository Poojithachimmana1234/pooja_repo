package Restaassur_exm;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;




public class Assessment3 {
	
	@DataProvider(name="userIds")
	public Object[][] provideUserIds(){
		return new Object[][] {
			{1},{2},{3},
		};
	}
	@Test(dataProvider="userIds")
	
	public void validateUserApi(int userId) {
		
		RestAssured.baseURI="https://reqres.in";
		Response response= RestAssured.
	    given().header("x-api-key","reqres_a2ff53d9acfd4f7dbe00637f2f52e711")
	    .pathParam("https://reqres.in/", userId)
	    .given().pathParam("id",userId)
		.when().get("/api/user/{ids}");
		Assert.assertEquals(response.jsonPath().getInt("data.id"), userId);
		Assert.assertEquals(response.getStatusCode(),200);
	   }
	}

		
	



