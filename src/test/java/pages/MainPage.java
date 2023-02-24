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

    public MainPage verifyProduct(String productForm) {
        $x("(//div[@class='product-catalog-container'])[2]").shouldHave(text(productForm));
        return this;
    }

    public MainPage clickPassTest() {
        $x("//div[@class='note-item -desktop']/span[@class='note-link']").click();
        return this;
    }

    public MainPage setPurposeAndLevel(String purpose, String level) {
        $$x("//home-quiz-selection-item").findBy(text(purpose)).click();
        $$x("//home-quiz-selection-item").findBy(text(level)).click();
        return this;
    }

    public MainPage verifyProgressBarAppears() {
        $x("//home-quiz-progress-circle[@class='loader']").should(appear);
        return this;
    }

    public MainPage verifySuitableCourses() {
        $x("//div[@class='courses-list']").should(exist);
        return this;
    }
}
