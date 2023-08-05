package Pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class MainPage {

    private final SelenideElement onlineBankButton = $(By.xpath("(//span[.='Онлайн-банк'])[3]"));

    public OnlineBankAuth clickOnlineBankButton() {
        onlineBankButton.click();
        Selenide.switchTo().window(1);

        return page(OnlineBankAuth.class);
    }
}
