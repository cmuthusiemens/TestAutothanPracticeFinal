package web.tests;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItems;
import java.util.List;

//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

public class TC_005_API_GetVideoName {

	//public static Logger log= LogManager.getLogger(TC_005_API_GetVideoName.class.getName());
	
	// To print output
	@Test

	void APItestJSON1()
	{
		given()
		.get("https://reqres.in/api/users?page=2")
		.then()
		//.statusCode(200)
		//.body("data.id[0]", equalTo(7))
		//.body("data.first_name.", hasItems("Michael"))
		.log().all();
		//log.info("******************************************");
		
	}
	
	//To fetch a data(JSON)
	
	@Test
	void testJSON2()
	{
		String ids=given()
		.get("https://reqres.in/api/users?page=2")
		.then()
		.extract()
		.body()
		.jsonPath().getJsonObject("data.email[0]");
		System.out.println(ids);
	}
}


