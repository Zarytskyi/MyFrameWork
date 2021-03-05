package ptestoreApiTests;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import models.Pet;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class PetStoreTests {
@Test
    public void getPetById(){
    Response response =
            given()
                .baseUri("https://petstore.swagger.io/v2/") // base url of website goes here
                .basePath("pet/100") //part that goes after base
            .when()
                .get()
            .then()
            .statusCode(200)
            .extract().response();
    JsonPath jsonPath = response.jsonPath(); /* we cate a variable 'response' and extract it as Json body in jsonPath
    variable. */
    Pet petResponce = jsonPath.getObject("$", Pet.class); // here we get objects from a string. deserialization

}
}
