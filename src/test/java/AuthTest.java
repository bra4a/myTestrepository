import Pages.MainPage;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Browsers.FIREFOX;
import static com.codeborne.selenide.Selenide.open;

public class AuthTest {

    @BeforeAll
    static void beforeAll() {
        open("https://www.raiffeisen.ru/");
        Configuration.pageLoadTimeout = 10000;
        Configuration.timeout = 10000;
        Configuration.browser = FIREFOX;
        Configuration.browserSize = "1920x1080";
    }

    @Test
    void unsuccessfulAuth() {

        new MainPage()
                .clickOnlineBankButton()
                .loginEntranceButtonClick()
                .setLogin("login")
                .entranceButtonClick()
                .setPassword("1234")
                .checkErrorMessage();
    }
}
