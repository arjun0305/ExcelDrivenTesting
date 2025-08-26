package excel;

import static io.restassured.RestAssured.given;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class Excelintegration {
	
	@Test
	public void add() throws IOException
	{
		DataDriven d =new DataDriven();
		ArrayList<String> Data = d.GetData("RestAssured", "TestCases", "RestAddBook");
		
		HashMap<String, Object> JsonAsMap = new HashMap<>();
		JsonAsMap.put("name", Data.get(1));
		JsonAsMap.put("isbn", Data.get(2));
		JsonAsMap.put("aisle", Data.get(3));
		JsonAsMap.put("author", Data.get(4));

		RestAssured.baseURI="https://rahulshettyacademy.com";
		
		String resp = given().header("Content-Type", "application/json")
				.body(JsonAsMap)
			.when().log().all().post("Library/Addbook.php").then().extract().response().asString();
		
		JsonPath js = new JsonPath(resp);
		String id = js.get("ID");
		System.out.println(id);
	}

}
