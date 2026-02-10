package param_sample;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItems;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class pathquer_exp {
	@Test
	void query_method() {
		baseURI= "https://reqres.in/api";
		given().header("x-api-key","reqres_a2ff53d9acfd4f7dbe00637f2f52e711")
		.pathParam("resource","users")
		.queryParam("page",2)
		.get("/{resource}?page=2")
		.then().statusCode(200)
		.body("data[4].first_name",equalTo("George"))
		.body("data.first_name",hasItems("George","Rachel"));
	}

  
}
