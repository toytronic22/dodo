package pages;

import org.openqa.selenium.By;

import java.util.List;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.CollectionCondition.texts;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class MainPage {

    public MainPage openPage() {
        open("https://dodopizza.ru/moscow");
        return this;
    }

    public MainPage verifyLocality() {
        $(byClassName("header__about-slogan-text_locality")).shouldHave(text("Москва"));
        return this;
    }

    public MainPage hoverMenuItem() {
        $(By.linkText("Работа в Додо")).hover().click();
        return this;
    }
}
