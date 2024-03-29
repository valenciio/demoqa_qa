import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.codeborne.selenide.Configuration;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
public class Test2Test {
    private Map<String, Object> vars;
    @BeforeEach
    public void setUp() {
        Configuration.browser = "chrome";
        vars = new HashMap<>();
    }
    @AfterEach
    public void tearDown() {
    }
    @Test
    public void test2() {
        open("https://www.mvideo.ru/");
        actions().moveToElement($(byLinkText("Работа в М.Видео"))).perform();
        actions().moveToElement($(byTagName("body")), 0, 0).perform();
        $(".bottom-navbar-link:nth-child(4) > .ng-tns-c1227156494-1").click();
        actions().moveToElement($(byLinkText("Ноутбук игровой Thunderobot 911 X Wild Hunter G2 L JT009500ERU"))).perform();
        actions().moveToElement($(byTagName("body")), 0, 0).perform();
        $(".product-cards-layout__item:nth-child(1) .product-title").click();
        actions().moveToElement($(byLinkText("Ноутбук игровой Thunderobot 911 X Wild Hunter G2 L JT009500ERU"))).perform();
        $(byLinkText("Ноутбук игровой Thunderobot 911 X Wild Hunter G2 L JT009500ERU")).click();
        executeJavaScript("window.scrollTo(0,0)");
        executeJavaScript("window.scrollTo(0,200)");
        executeJavaScript("window.scrollTo(0,700)");
        $(".cart-button > .mv-main-button--content").click();
        actions().moveToElement($(".cart-button")).perform();
        actions().moveToElement($(".zoomable-image__image")).perform();
        actions().moveToElement($(byTagName("body")), 0, 0).perform();
    }
}
