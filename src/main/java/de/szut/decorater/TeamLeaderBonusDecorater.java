package de.szut.decorater;

import de.szut.BonusDecorator;
import de.szut.Bonus;

public class TeamLeaderBonusDecorater extends BonusDecorator {
    public TeamLeaderBonusDecorater(Bonus bonus) {
        super(bonus);
    }

    @Override
    public double calculate() {
        return decoratedBonus.calculate() + 10;
    }
}
