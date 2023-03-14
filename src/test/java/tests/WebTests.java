package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

public class WebTests extends TestBase {

    @Tag("ui")
    @DisplayName("Проверяем, что попали в Москву")
    @Test
    public void positiveTest1() {
        step("Перейти на главную страницу", () -> {
            mainPage.openPage();
        });
        step("Проверить, что находимся в меню Москвы", () -> {
            mainPage.verifyLocality();
        });
    }


    @Tag("ui")
    @DisplayName("Проверяем, что ссылка Работа в Додо кликабельна")
    @Test
    public void positiveTest2() {
        step("Перейти на главную страницу", () -> {
            mainPage.openPage();
        });
        step("Навести курсор и кликнуть на раздел Работа в Додо", () -> {
            mainPage.hoverMenuItem();
        });
    }
}