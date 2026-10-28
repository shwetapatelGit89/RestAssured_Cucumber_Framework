package stepDefinations;

import io.cucumber.java.en.*;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import pojo.AddPlace;
import resources.APITestResources;
import resources.MyUtil;
import resources.TestData;
import static io.restassured.RestAssured.*;
import static org.junit.Assert.assertEquals;
import io.restassured.specification.RequestSpecification;
public class ValidatePlace extends MyUtil {
	RequestSpecification res;
	TestData data = new TestData();
	 MyUtil util = new MyUtil();
	 String Reponse; 
//	 Response reponse;
	@Given("Add place payload {string} {string}")
	public void add_place_payload(String name, String address) throws Exception{
        
		 res= given().spec(util.RequestSpecification()).body(data.AddPlaceData(name,address));
        
	}
	@When("user calls {string} api with {string} http requet")
	public void user_calls_api_with_post_http_requet(String s1, String s2) {
		APITestResources resources = APITestResources.valueOf(s1);
	Reponse =res.when().post(resources.getResource())
		 .then().extract().response().asString();
	System.out.println(Reponse);
	}
	@Then("Api got the success {string} is {string}")
	public void api_got_the_status_of(String s1, String s2) {
	  
	  
	}
	@Then("{string} response body is {string}")
	public void response_body_is(String s1, String s2) {
		JsonPath js = new JsonPath(Reponse);
		  assertEquals(js.get(s1), s2);
	}
}
