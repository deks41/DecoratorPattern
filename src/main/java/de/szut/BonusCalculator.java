package de.szut;

public class BonusCalculator {

    private BonusService bonusService = new BonusService();

    int daysInAbsence;
    int completedProjects;
    int yearsInCompany;
    boolean teamLeader;

    public BonusCalculator(int daysInAbsence, int completedProjects, int yearsInCompany, boolean teamLeader) {
        this.daysInAbsence = daysInAbsence;
        this.completedProjects = completedProjects;
        this.yearsInCompany = yearsInCompany;
        this.teamLeader = teamLeader;
    };

    public double calculate() {
        return bonusService.calculateBonus(daysInAbsence, completedProjects, yearsInCompany, teamLeader);
    }

}
