package de.szut;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BonusCalculatorTest {
    @Test
    void whenOnlyBaseBonus_thenBonus100() {
        BonusCalculator calculator = new BonusCalculator(
                365,
                0,
                0,
                false
        );
        Assertions.assertEquals(100, calculator.calculate());
    }

    @Test
    void whenMaximumStatsReached_thenBonusDoesNotExceedMaximumBonus() {
        BonusCalculator calculator = new BonusCalculator(
                0,
                365,
                100,
                true
        );
        Assertions.assertEquals(true, calculator.calculate() <= 250);
    }

    @Test
    void whenMinimummStatsGiven_thenBonusIsNotBelowMinimumBonus() {
        BonusCalculator calculator = new BonusCalculator(
                365,
                0,
                1,
                false
        );
        Assertions.assertEquals(true, calculator.calculate() <= 250);
    }

    @Test
    void whenCompletedProjectsOver4_thenBonus200() {
        BonusCalculator calculator = new BonusCalculator(
                25,
                5,
                0,
                false
        );
        Assertions.assertEquals(200, calculator.calculate());
    }

    @Test
    void whenSeniorityOver4_thenBonus150() {
        BonusCalculator calculator = new BonusCalculator(
                25,
                0,
                5,
                false
        );
        Assertions.assertEquals(150, calculator.calculate());
    }

    @Test
    void whenTeamleader_thenBonus110() {
        BonusCalculator calculator = new BonusCalculator(
                25,
                0,
                0,
                true
        );
        Assertions.assertEquals(110, calculator.calculate());
    }

    @Test
    void whenLowAbsenceLevelTwoAndSenior_ThenBonusIs155() {
        BonusCalculator calculator = new BonusCalculator(
                0,
                0,
                5,
                false
        );
        Assertions.assertEquals(160, calculator.calculate());
    }

}
