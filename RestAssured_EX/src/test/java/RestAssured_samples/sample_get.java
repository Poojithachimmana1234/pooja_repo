package RestAssured_samples;

//import org.junit.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class sample_get {
	@Test  
	void test_get(){
		
		baseURI = "http://reqres.in/api";
		given().header("x-api-key", "reqres_a2ff53d9acfd4f7dbe00637f2f52e711")
		.get("/users?page=2")
		.then().statusCode(200).log().all();
	}

@Test(enabled  =false)
  void test_get1() {
	RequestSpecification httpRequest = RestAssured.given();
	httpRequest.header("x-api-key", "reqres_a2ff53d9acfd4f7dbe00637f2f52e711");
	httpRequest.baseUri("http://reqres.in/api");
	Response response = httpRequest.get("/users?page=2");
	 
   System.out.println(response.getBody().asString());
   System.out.println(response.getStatusCode());
   
   System.out.println(response.getStatusLine());
   System.out.println(response.getHeader("content-type"));
   
   int code = response.getStatusCode();
   Assert.assertEquals(code,200);
}

@Test(enabled=false)
void test_get2() {
	baseURI= "https://reqres.in/api";
	given().header("x-api-key", "reqres_a2ff53d9acfd4f7dbe00637f2f52e711")
	.get("/users?page=2")
	.then().statusCode(200)
	.body("data[4].first_name", equalTo("George"))
	.body("data.first_name",hasItems("George","Rache1"));
}
}

