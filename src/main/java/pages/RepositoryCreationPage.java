package pages;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

public class RepositoryCreationPage {

    private final SelenideElement repositoryNameInput = Selenide.$x("//input[@type='text' and @aria-required='true']");
    private final SelenideElement createButton = Selenide.$x("//span[text()='Create repository']//parent::*//parent::button[@type='submit']");
    private final SelenideElement nameLocator = Selenide.$x("//span[@id='RepoNameInput-is-available']");

    public RepositoryCreationPage createNewRepository(String Title) {
        repositoryNameInput.val(Title);
        nameLocator.shouldBe(Condition.text(" is available."));
        createButton.shouldBe(Condition.enabled
                .because("Кнопка 'Create repository' недоступна для нажатия")).click();
        return this;
    }
}

