package ru.netology.unit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BonusServiceTest {
    @Test
    void shouldCalculateBonusIfSum2000() {
        // подготовка
        BonusService service = new BonusService();
        int amount = 2000;

        //выполнение целевого действия
        int actual = service.calculateBonus(amount);
        int expected = 10;

        //сравнение результатов (ожидаемого и фактического)
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateBonusIfSum999() {
        BonusService service = new BonusService();

        int actualResult = service.calculateBonus(999);
        int expectedResult = 0;
        assertEquals(expectedResult, actualResult);
    }
}