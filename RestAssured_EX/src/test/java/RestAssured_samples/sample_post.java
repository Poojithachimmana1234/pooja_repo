package RestAssured_samples;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class sample_post {
	@Test
	public void test_post() {
		JSONObject request = new JSONObject();
		request.put("name", "Rashi1");
		request.put("job","trainer1");
		
		given().
		header("Content-Type","application/json").
		header("x-api-key", "reqres_a2ff53d9acfd4f7dbe00637f2f52e711")
		.body(request.toJSONString()).
		when().
		post("https://reqres.in/api/users/2").
		then().
		statusCode(201).log().all();
}
	}



