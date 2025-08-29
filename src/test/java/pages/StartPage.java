package pages;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

public class StartPage {

    private final SelenideElement signInButton = Selenide.$x("//a[@href='/login' and contains(@class, 'HeaderMenu-link--sign-in')]");

    public AuthPage clickOnSignInButton() {
        signInButton.shouldBe(Condition.visible
                .because("Кнопка 'Sign in' недоступна для нажатия")).click();
        return new AuthPage();
    }
}
