package builder;

	import org.testng.annotations.Test;
	import static  io.restassured.RestAssured.given;

	import io.restassured.RestAssured;

	public class sample_builderpath {
		@Test
		void build_pre_meth() {
			RestAssured.baseURI = "http://postman-echo.com";
			String response = given()
					.log().all().auth().preemptive().basic("postman","password")
					.when().get("basic-auth").then().log().all().assertThat().statusCode(200).extract().response().asString();
			System.out.println(response);
					
		}
	@Test
	void build_unpre_meth() {
		RestAssured.baseURI = "http://postman-echo.com";
		String response = given()
				.log().all().auth().basic("postman","password")
				.when().get("basic-auth").then().log().all().assertThat().statusCode(200).extract().response().asString();
		System.out.println(response);
	}
	}


