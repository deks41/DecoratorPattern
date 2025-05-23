package de.szut.decorater;

import de.szut.BonusDecorator;
import de.szut.Bonus;

public class LowAbsenceBonusDecorator extends BonusDecorator {
    int missingDays;
    public LowAbsenceBonusDecorator(Bonus bonus, int daysInAbsence) {
        super(bonus);
        this.missingDays = daysInAbsence;
    }

    @Override
    public double calculate() {
        if(missingDays <= 10) {
            return decoratedBonus.calculate() + 10;
        } else if(missingDays >= 20) {
            return decoratedBonus.calculate() + 5;
        } else {
            return decoratedBonus.calculate();
        }
    }
}
