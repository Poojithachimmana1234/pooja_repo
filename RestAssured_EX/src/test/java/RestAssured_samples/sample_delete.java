package RestAssured_samples;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import static  io.restassured.RestAssured.given;
import static io.restassured.RestAssured.*;

public class sample_delete {
	@Test
	void test_delete() {
		JSONObject request = new JSONObject();
		request.put("name", "Rashi1");
		request.put("job","trainer1");

		given()
		.header("Content-Type","application/json")
		.header("x-api-key", "reqres_a2ff53d9acfd4f7dbe00637f2f52e711")
		.body(request.toJSONString())
		.when()
		.delete("http://reqres.in/api/users/2")
		.then()
		.statusCode(301).log().all();
	}

}
