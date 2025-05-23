package de.szut;

public abstract class BonusDecorator implements Bonus {
    protected Bonus decoratedBonus;

    public BonusDecorator(Bonus bonus) {
        this.decoratedBonus = bonus;
    }

    @Override
    public double calculate() {
        return decoratedBonus.calculate();
    }

}
