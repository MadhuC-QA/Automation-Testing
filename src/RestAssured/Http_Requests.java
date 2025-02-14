//https://reqres.in/
package RestAssured;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

import static org.hamcrest.Matcher.*;
import io.restassured.matcher.ResponseAwareMatcher;
import io.restassured.response.Response;
import org.testng.annotations.Test;
//
public class Http_Requests {
	
	
@Test
public void getUsers()
{
	//RestAssured.baseURI="https://reqres.in/api/users/2";
    given()
     .when()
	   .get("https://reqres.in/api/users?page=2")
	.then()
	  .statusCode(200)
	  .body("page",equalTo(2))
	  .log().all();
	}
@Test(enabled=true)
public void createUser() 
{
	HashMap data=new HashMap(); // accept the values in key and value method
	data.put("name","Jhon");
	data.put("job","Manager");
	
	
	given()
	  .contentType("application.json")
	  .body(data)
	
	.when()
	  .post("https://reqres.in/api/users")
	
	 .then()
	   .statusCode(201)
	   .log().all();
}

}
	

