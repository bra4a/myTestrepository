package Pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class MainPage {

    // локатор для кнопки Онлайн-банк
    private final SelenideElement onlineBankButton = $(By.xpath("(//span[.='Онлайн-банк'])[3]"));

    //метод для клика на кнопку Онлайн-банк
    public OnlineBankAuth clickOnlineBankButton() {
        onlineBankButton.click();
        Selenide.switchTo().window(1);

        return page(OnlineBankAuth.class);
    }
}
