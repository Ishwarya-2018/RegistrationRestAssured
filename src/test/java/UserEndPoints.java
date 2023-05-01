import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

//create request of user api
public class UserEndPoints {
    // payload is request body of user type

    public static Response createUser(User payload)
    {
        Response response =given()
//                .contentType(ContentType.JSON)
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(payload)
                .when()
                .post(Route.post_url);
        return response;
    }

//    public static Response readUser(String userName){
//        Response response=given()
//                .pathParam("username", userName)
//                .when()
//                .get(Route.get_url);
//
//        return response;
//    }
}
