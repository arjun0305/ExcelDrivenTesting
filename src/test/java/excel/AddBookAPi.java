package excel;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import static io.restassured.RestAssured.*;

import java.util.HashMap;

import org.testng.annotations.Test;


public class AddBookAPi {

	@Test
	public void addBook() {
		
		
		HashMap<String, Object> JsonAsMap = new HashMap<>();
		JsonAsMap.put("name", "Learn Appium Automation with Java");
		JsonAsMap.put("isbn", "bcds");
		JsonAsMap.put("aisle", "2393");
		JsonAsMap.put("author", "John foer");
		
		RestAssured.baseURI="https://rahulshettyacademy.com";
		
		String resp = given().header("Content-Type", "application/json")
				.body(JsonAsMap)
			.when().log().all().post("Library/Addbook.php").then().extract().response().asString();
		
		JsonPath js = new JsonPath(resp);
		String id = js.get("ID");
		System.out.println(id);
		
	}
}
