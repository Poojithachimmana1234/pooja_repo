package builder;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
public class different_auth {
	@Test
	void dif_auth_method() {
		given()
		.auth()
		.basic("username","password")
		.when()
		.get("https://reqres.in/api")
		.then()
		.log().all().statusCode(200);
	}

}
