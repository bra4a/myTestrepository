package Tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

import static com.codeborne.selenide.Browsers.FIREFOX;
import static com.codeborne.selenide.Selenide.open;

public class BaseTest {

    @BeforeAll
    static void beforeAll() {
        open("https://www.raiffeisen.ru/");
        Configuration.pageLoadTimeout = 10000;
        Configuration.timeout = 10000;
        Configuration.browser = FIREFOX;
        Configuration.browserSize = "1920x1080";
    }

    @AfterAll
    public static void quitBrowser() {
        Selenide.closeWebDriver();
    }

}
