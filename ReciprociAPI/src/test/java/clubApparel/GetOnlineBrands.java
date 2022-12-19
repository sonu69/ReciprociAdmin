package clubApparel;

import org.testng.annotations.Test;
import org.testng.Assert;
import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

class GetOnlineBrands {


	@Test
	public void getDetails() {
		
		given().header("Content-Type","application/json").
		param("Authorization", "bearer 671c465a-2336-4e22-bbbd-4f4c105657b3").get("http://14.142.204.101:7070/api/ads/master/brand/v1/get/OnlineTxnBrandsList").
		then().
		statusCode(200);
		
		

	}

}
