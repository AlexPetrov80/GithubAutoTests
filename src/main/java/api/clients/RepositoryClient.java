package api.clients;

import api.models.createRepository.request.CreateRepositoryRequest;
import io.restassured.RestAssured;

public class RepositoryClient {

    private final static String BASE_URI = "https://api.github.com";
    private CreateRepositoryRequest requestBody = CreateRepositoryRequest.builder()
            .name("repo1")
            .description("Create new repository")
            .jsonMemberPrivate(false)
            .homepage("https://github.com")
            .isTemplate(true)
            .build();

    public void createRepository(String name) {
        requestBody = CreateRepositoryRequest.builder()
                .name(name)
                .description("Create new repository")
                .jsonMemberPrivate(false)
                .homepage("https://github.com")
                .isTemplate(true)
                .build();

        var response = RestAssured.given()
                .header("Authorization", "Bearer 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")
                .header("X-GitHub-Api-Version", "2022-11-28")
                .baseUri(BASE_URI)
                .body(requestBody)
                .post("/user/repos")
                .then()
                .statusCode(201);
    }

    public void deleteRepositoryApi(String name) {
        var response = RestAssured.given()
                .header("Authorization", "Bearer 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")
                .header("X-GitHub-Api-Version", "2022-11-28")
                .baseUri(BASE_URI)
                .delete("/repos/AlexPetrov80/" + name)
                .then()
                .statusCode(204);
    }
}


