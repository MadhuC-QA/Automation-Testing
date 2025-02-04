package RestAssured;
import io.restassured.RestAssured;
import io.restassured.RestAssured.*;
import io.restassured.response.Response;
import org.testng.annotations.Test;
//
public class Http_Requests {
	
	
@Test
public void request()
{
	RestAssured.baseURI="https://reqres.in/api/users?page=2";
	
	Response res=RestAssured.get("/");
	
	System.out.println(res.getStatusCode());
}
	
}
