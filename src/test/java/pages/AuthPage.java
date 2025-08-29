package pages;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

public class AuthPage {

    private final SelenideElement login = Selenide.$x("//input[@type='text' and @name='login']");
    private final SelenideElement password = Selenide.$x("//input[@type='password' and @name='password']");
    private final SelenideElement signInButton = Selenide.$x("//input[@type='submit' and @name='commit']");

    public void signIn(String username, String pass) {
        login.val(username);
        password.val(pass);
        signInButton.shouldBe(Condition.visible
                .because("Кнопка 'Sign in' недоступна для нажатия")).click();
    }
}
