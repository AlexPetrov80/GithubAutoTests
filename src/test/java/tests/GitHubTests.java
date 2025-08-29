package tests;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.*;

import java.util.ArrayList;
import java.util.List;

public class GitHubTests {

    private static final List<String> REPOSITORIES_FOR_DELETE = new ArrayList<>();

    @BeforeEach
    public void createRepository() {
        BrowserManager.openBrowserWithConfig();
        new StartPage().clickOnSignInButton()
                .signIn("", "");
    }

    @Test
    public void repositoryCheck() {
        var repoName = RepositoryNameGenerator.generateRandomName("repo");
        new HomePage().clickOnNewButton()
                .createNewRepository(repoName);
        REPOSITORIES_FOR_DELETE.add(repoName);
        new RepositoryPage().goToHomePage()
                .checkRepositoryByTitle(repoName);
    }

    @Test
    public void repositoryCheck2() {
        var repoName = RepositoryNameGenerator.generateRandomName("repo");
        new HomePage().clickOnNewButton()
                .createNewRepository(repoName);
        REPOSITORIES_FOR_DELETE.add(repoName);
        new RepositoryPage().goToHomePage()
                .checkRepositoryByTitle(repoName);
    }

    @AfterAll
    public static void delete() {
        REPOSITORIES_FOR_DELETE.forEach(title -> {
            new RepositorySettingsPage().deleteRepository(title);
            new RepositoryPage().goToHomePage();
        });
    }
}









