package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.visible;

public class HomePage {

    private final ElementsCollection repositories = Selenide.$$x("//ul[@class='list-style-none js-dashboard-repos-list']");
    private final SelenideElement repository = Selenide.$x("//*[@href='/AlexPetrov80/repo2']");
    private final SelenideElement newButton = Selenide.$x("//a[@href='/new']");
    private final SelenideElement homeButton = Selenide.$x("//a[@class='AppHeader-logo ml-1 ']");

    public void clickOnRepository() {
        repository.shouldBe(Condition.visible
                .because("Нужного репозитория нет в списке репозиториев")).click();
    }

    public void deletionCheck(String expectedText) {
        repositories.find(Condition.text(expectedText)).shouldNot(exist
                .because("В списке репозиторев не должно быть репозитория с названием: %s".formatted(expectedText)));
    }

    public RepositoryCreationPage clickOnNewButton() {
        newButton.shouldBe(visible.because("Кнопка 'New' не отображается")).click();
        return new RepositoryCreationPage();
    }

    public void checkRepositoryByTitle(String repositoryTitle) {
        homeButton.shouldBe(Condition.visible
                .because("Картинка кота, возвращающая на главную страницу недоступна для нажатия")).click();
        repositories.findBy(Condition.text(repositoryTitle))
                .shouldBe(Condition.visible
                        .because("В списке репозиториев должен быть репозиторий с названием: %s".formatted(repositoryTitle)));
    }
}
