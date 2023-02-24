package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.List;
import java.util.stream.Stream;

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
    @DisplayName("Проверяем, что работает переход на Работу в Додо")
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