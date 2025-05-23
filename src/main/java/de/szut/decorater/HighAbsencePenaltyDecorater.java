package de.szut.decorater;

import de.szut.BonusDecorator;
import de.szut.Bonus;

public class HighAbsencePenaltyDecorater extends BonusDecorator {

    public HighAbsencePenaltyDecorater(Bonus bonus) {
        super(bonus);
    }

    @Override
    public double calculate() {
        return decoratedBonus.calculate() - 5;
    }
}
