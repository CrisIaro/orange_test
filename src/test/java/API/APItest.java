package API;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public  class APItest {
    public static void ApiTest()
    {
        RestAssured.baseURI ="https://petstore.swagger.io/v2";
        RequestSpecification request = RestAssured.given();
        request.contentType("application/json");

        ObjectMapper mapper = new ObjectMapper();
        String payload = null;
        try {
            payload = mapper.writeValueAsString( mapper.readValue(Files.readString(Paths.get("src/test/resources/newpet.json")), Pet.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        request.body(payload);

        Response response = request.put("/pet");
        ResponseBody body = response.getBody();
        System.out.println(response.getStatusLine());
        System.out.println(body.asString());

        Assert.assertEquals(body.asString(),payload);

    }
}