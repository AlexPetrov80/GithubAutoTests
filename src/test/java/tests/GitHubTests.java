package tests;

import api.clients.RepositoryClient;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.HomePage;
import pages.RepositoryNameGenerator;
import pages.StartPage;

import java.util.ArrayList;
import java.util.List;

public class GitHubTests {

    private static final List<String> REPOSITORIES_FOR_DELETE = new ArrayList<>();

    @BeforeEach
    public void signIn() {
        BrowserManager.openBrowserWithConfig();
        new StartPage().clickOnSignInButton()
                .signIn("", "");
    }

    @Test
    public void createAndCheckRepositoryApi() {
        var repoName = RepositoryNameGenerator.generateRandomName();
        new RepositoryClient().createRepository(repoName);
        REPOSITORIES_FOR_DELETE.add(repoName);
        new HomePage().checkRepositoryByTitle(repoName);
    }

    @AfterAll
    public static void deleteRepository() {
        REPOSITORIES_FOR_DELETE.forEach(title -> {
            new RepositoryClient().deleteRepositoryApi(title);
        });
    }
}








