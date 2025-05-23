package de.szut;

import de.szut.decorater.*;

public class BonusService {
   double minBonus = 100;
   double maxBonus = 250;

   double calculateBonus(int daysInAbsence, int completedProjects, int yearsInCompany, boolean teamLeader) {
      Bonus bonus = new BaseBonus();
      if(daysInAbsence >= 30) {
         bonus = new HighAbsencePenaltyDecorater(bonus);
      }
      if(daysInAbsence <= 20) {
         bonus = new LowAbsenceBonusDecorator(bonus, daysInAbsence);
      }
      bonus = new ProjectCompletionBonusDecorator(bonus, completedProjects);
      bonus = new SeniorityBonusDecorator(bonus, yearsInCompany);
      if(teamLeader) {
         bonus = new TeamLeaderBonusDecorater(bonus);
      }
      return checkBonusLimits(bonus.calculate());
   }

   private double checkBonusLimits(double bonus) {
      if(bonus > maxBonus) {
         return maxBonus;
      }
      if(bonus < minBonus) {
         return minBonus;
      }
      return bonus;
   }

}
