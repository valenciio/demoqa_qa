import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static com.codeborne.selenide.Selenide.*;

public class ValueSourceTest {
    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy = "eager";
    }

    @ValueSource(strings = {
            "Java 8. Полное руководство",
    }
    )
    @ParameterizedTest(name = "В выдаче поиcка присутствует название введенной книги `{0}`")

    void searchTest(String bookName) {
        open("https://www.labirint.ru");
        $x("//input[@placeholder='Поиск по Лабиринту']").setValue(bookName).pressEnter();
        $x("//div/a[@title='Java 8. Полное руководство']").
                shouldHave(Condition.text(bookName));


    }


}