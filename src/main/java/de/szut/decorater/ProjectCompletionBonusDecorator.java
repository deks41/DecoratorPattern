package de.szut.decorater;

import de.szut.BonusDecorator;
import de.szut.Bonus;

public class ProjectCompletionBonusDecorator extends BonusDecorator {
    int completedProjects;
    public ProjectCompletionBonusDecorator(Bonus bonus, int completedProjects) {
        super(bonus);
        this.completedProjects = completedProjects;
    }

    @Override
    public double calculate() {
        if(completedProjects >= 5) {
            return decoratedBonus.calculate() + 100;
        }
        return decoratedBonus.calculate();
    }
}
