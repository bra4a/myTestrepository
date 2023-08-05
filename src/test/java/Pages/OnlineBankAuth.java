package Pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class OnlineBankAuth {

    private final SelenideElement loginEntranceButton = $(By.xpath("//button[.=' Войти по логину ']"));
    private final SelenideElement loginInput = $(By.xpath("//input[@name='username']"));
    private final SelenideElement entranceButton = $(By.xpath("//span[.='Войти']"));
    private final SelenideElement passwordInput = $(By.xpath("//input[@name='otp']"));

    public OnlineBankAuth loginEntranceButtonClick() {
        loginEntranceButton.click();

        return this;
    }

    public OnlineBankAuth setLogin(String login) {
        loginInput.setValue(login);

        return this;
    }

    public OnlineBankAuth entranceButtonClick() {
        entranceButton.click();

        return this;
    }

    public OnlineBankAuth setPassword(String password) {
        passwordInput.setValue(password);

        return this;
    }

    public void checkErrorMessage() {
        $(".error").shouldBe(visible);
    }
}


