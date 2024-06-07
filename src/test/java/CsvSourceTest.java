
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class CsvSourceTest {

    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy = "eager";
    }

    @CsvSource({
            "Ноутбуки, тонкие"
    })
    @ParameterizedTest(name = "В результате выбора категории {0} должен появиться бренд {1}")

    void checkLaptop(String productCategory, String productName) {
        open("https://www.mvideo.ru/");
        $$x("//div/a[.='Ноутбуки']").findBy(text(productCategory)).click();
        $$x("//div/a[.='тонкие']").first().findElements(byText(productName));
    }
}