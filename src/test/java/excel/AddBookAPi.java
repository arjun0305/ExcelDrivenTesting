package excel;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;


public class AddBookAPi {

	@Test
	public void addBook() {
		
		RestAssured.baseURI="https://rahulshettyacademy.com";
		
		String resp = given().body("{\r\n"
				+ "\"name\":\"Learn Appium Automation with Java\",\r\n"
				+ "\"isbn\":\"bcd\",\r\n"
				+ "\"aisle\":\"2926\",\r\n"
				+ "\"author\":\"John foer\"\r\n"
				+ "}\r\n"
				+ "")
			.when().log().all().post("Library/Addbook.php").then().extract().response().asString();
		
		JsonPath js = new JsonPath(resp);
		String id = js.get("ID");
		System.out.println(id);
		
	}
}
