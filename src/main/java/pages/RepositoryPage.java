package pages;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

public class RepositoryPage {

    private final SelenideElement settingsButton = Selenide.$x("//span[@data-content='Settings']");
    private final SelenideElement homeButton = Selenide.$x("//a[@class='AppHeader-logo ml-1 ']");

    public void clickOnSettingsButton() {
        settingsButton.shouldBe(Condition.visible
                .because("Кнопка 'Settings' недоступна для нажатия")).click();
    }

    public HomePage goToHomePage() {
        homeButton.shouldBe(Condition.visible
                .because("Картинка кота, возвращающая на главную страницу недоступна для нажатия")).click();
        return new HomePage();
    }
}
