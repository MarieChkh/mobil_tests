package helpers;

import static io.restassured.RestAssured.given;

public class Browserstack {

    public static String videoUrl(String sessionId) {
        String url = String.format("https://api.browserstack.com/app-automate/sessions/%s.json", sessionId);
        return given()
                .auth().basic("bsuser_4p3fUw", "KkwWbpftnyuByJ9s7L8d")
                .get(url)
                .then()
                .log().body()
                .log().status()
                .statusCode(200)
                .extract().path("automation_session.video_url");
    }
}