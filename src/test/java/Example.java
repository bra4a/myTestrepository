import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class Example {

    @Test
    void exampleTest() {

        open("https://github.com/");
        $(".HeaderMenu-link--sign-in").shouldBe(visible);

    }
}
