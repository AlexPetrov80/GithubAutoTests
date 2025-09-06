package tests;

import api.models.createRepository.request.CreateRepositoryRequest;
import api.models.getRepository.response.RepositoryResponse;
import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;

public class GitHubApiTests {

    private final static String BASE_URI = "https://api.github.com";
    private CreateRepositoryRequest requestBody = CreateRepositoryRequest.builder()
            .name("repo1")
            .description("Create new repository")
            .jsonMemberPrivate(false)
            .homepage("https://github.com")
            .isTemplate(true)
            .build();

    @Test
    public void createRepository() {
        var response = RestAssured.given()
                .header("Authorization", "Bearer token")
                .header("X-GitHub-Api-Version", "2022-11-28")
                .baseUri(BASE_URI)
                .body(requestBody)
                .post("/user/repos")
                .then()
                .statusCode(201);
    }

    @Test
    public void getRepository() {
        var response = RestAssured.given()
                .header("Authorization", "Bearer token")
                .header("X-GitHub-Api-Version", "2022-11-28")
                .baseUri(BASE_URI)
                .get("/repos/AlexPetrov80/repo_1")
                .as(RepositoryResponse.class);
    }

    @Test
    public void deleteRepository() {
        var response = RestAssured.given()
                .header("Authorization", "Bearer token")
                .header("X-GitHub-Api-Version", "2022-11-28")
                .baseUri(BASE_URI)
                .delete("/repos/AlexPetrov80/Evgeniy_850")
                .then()
                .statusCode(204);
    }
}
