package RestAssured;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Sample {
	@Test
	public void get()
	{
		
		 //RestAssured.baseURI = "http://example.com";

	        // Get the response from the URL
	        Response response = RestAssured.get("http://example.com");

	        // Get the status code from the response
	        int statusCode = response.getStatusCode();

	        // Print the status code
	        System.out.println("Response Code: " + statusCode);
	}

}
