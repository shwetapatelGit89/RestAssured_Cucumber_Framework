package resources;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Properties;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class MyUtil {
	RequestSpecification addPlaceReq;
	
	public io.restassured.specification.RequestSpecification RequestSpecification() throws Exception
	{
		if(addPlaceReq == null)
		{
			
//		Double d = Math.random();
//		String logFileName = d.toString();
		PrintStream stream = new PrintStream(new FileOutputStream(("logging")+".txt"));
		addPlaceReq = new RequestSpecBuilder().setBaseUri(MyUtil.getBaseURL("baseUrl"))
				.setContentType(ContentType.JSON)
				.addFilter(RequestLoggingFilter.logRequestTo(stream))
				.addFilter(ResponseLoggingFilter.logResponseTo(stream))
				.build(); 		
		return addPlaceReq;
		}
		else 
			return addPlaceReq;
	}
	
	public static String getBaseURL(String key) throws Exception {
		Properties pro = new Properties();
		FileInputStream input = new FileInputStream("C:\\Users\\ADITYA PATEL\\eclipse-workspace\\RestAssured_Project_EndToEnd\\src\\test\\java\\resources\\global.property");
		pro.load(input);
		return pro.getProperty(key);
	}
	
}
