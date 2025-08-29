package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import java.util.List;

import static tests.GitHubTests.*;

public class RepositorySettingsPage {

    private final SelenideElement deleteButton = Selenide.$x("//button[@id='dialog-show-repo-delete-menu-dialog']");
    private final SelenideElement confirmationOfDeletionButton = Selenide.$x("//button[@id='repo-delete-proceed-button']");
    private final SelenideElement deletionAccept = Selenide.$x("//button[@id='repo-delete-proceed-button']");
    private final SelenideElement selectTheDesiredOne = Selenide.$x("//input[@id='verification_field']");
    private final SelenideElement finalDeleteButton = Selenide.$x("//button[@id='repo-delete-proceed-button']");
    private final ElementsCollection repositories = Selenide.$$x("//li[@class='public source no-description']");
    private final SelenideElement settingsButton = Selenide.$x("//span[@data-content='Settings']");

    public void deleteRepository(String repositoryTitle) {
        repositories.findBy(Condition.text(repositoryTitle)).shouldBe(Condition.visible
                .because("Нужного репозитория нет в списке репозиториев")).click();
        settingsButton.shouldBe(Condition.visible
                .because("Кнопка 'Settings' недоступна для нажатия")).click();
        deleteButton.shouldBe(Condition.visible
                .because("Кнопка 'Delete this repository' недоступна для нажатия")).hover().click();
        confirmationOfDeletionButton.shouldBe(Condition.visible
                .because("Кнопка 'I want to delete this repository' недоступна для нажатия")).click();
        deletionAccept.shouldBe(Condition.visible
                .because("Кнопка 'I have read and understand these effects' недоступна для нажатия")).click();
        selectTheDesiredOne.val("AlexPetrov80/" + repositoryTitle);
        finalDeleteButton.shouldBe(Condition.visible
                .because("Кнопка 'Delete this repository' недоступна для нажатия")).hover().click();
    }
}



