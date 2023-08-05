package Tests;
import Pages.MainPage;
import org.junit.jupiter.api.Test;

public class AuthTest extends BaseTest{

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
