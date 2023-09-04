package mobile.tests;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItems;

import java.io.File;
import java.util.List;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class TC_011_API_UploadFile {

	
	// To print output
	//@Test

	void testJSON1()
	{
File jsonDataInFile = new File(System.getProperty("user.dir")+"//OutputJSON");
		
		    given()
				.baseUri("")
				.contentType(ContentType.JSON)
				.body(jsonDataInFile)
		// WHEN
			.when()
				.post()
				// THEN
			.then()
				.assertThat()
				.statusCode(200)
				.body("token", Matchers.notNullValue())
				.body("token.length()", Matchers.is(15));
				
}
}


