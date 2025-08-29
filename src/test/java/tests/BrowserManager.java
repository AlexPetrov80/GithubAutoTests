package tests;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;

public class BrowserManager {

    public static void openBrowserWithConfig() {
        Configuration.timeout = 15000;
        Configuration.baseUrl = ("https://github.com/");
        Selenide.open("/");
    }
}
