package RestAssured_samples;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import static  io.restassured.RestAssured.given;

public class sample_put {
@Test
  public void test_put() {
	JSONObject request = new JSONObject();
	request.put("name", "Rashi1");
	request.put("job","trainer1");
	
	given().
	header("Content-Type","application/json").
	header("x-api-key", "reqres_a2ff53d9acfd4f7dbe00637f2f52e711")
	.body(request.toJSONString()).
	when().
	put("https://reqres.in/api/users/2").
	then().
	statusCode(200).log().all();
}

}
