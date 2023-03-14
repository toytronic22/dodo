package pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.CollectionCondition.texts;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class MainPage {

    public void openPage() {
        open("https://dodopizza.ru/moscow");
    }

    public void verifyLocality() {
        $(byClassName("header__about-slogan-text_locality")).shouldHave(text("Москва"));
    }

    public void hoverMenuItem() {
        $(By.linkText("Работа в Додо")).hover().click();
    }
}
