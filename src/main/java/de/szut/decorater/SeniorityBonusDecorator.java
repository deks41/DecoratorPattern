package de.szut.decorater;

import de.szut.BonusDecorator;
import de.szut.Bonus;

public class SeniorityBonusDecorator extends BonusDecorator {
    int years;
    public SeniorityBonusDecorator(Bonus bonus, int years) {
        super(bonus);
        this.years = years;
    }

    @Override
    public double calculate() {
        if (years >= 5) {
            return decoratedBonus.calculate() + 50;
        }
        return decoratedBonus.calculate();
    }
}
