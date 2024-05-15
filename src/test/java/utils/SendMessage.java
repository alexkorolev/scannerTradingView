package utils;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;

public class SendMessage {
    public void sendTelegram(String message){
        RestAssured.baseURI = "https://api.telegram.org/bot6057207350:AAG8BaCSQHH5atMllcOTEqgy-k3YzXbWpgM";
        String bodyData = "{\"chat_id\": \"-4148631293\", \"text\": \"" + message + "\", \"disable_notification\": false}";
        given()
                .body(bodyData)
                .contentType(ContentType.JSON)
                .post("/sendMessage");

    }
}
