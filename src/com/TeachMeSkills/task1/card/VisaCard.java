package com.TeachMeSkills.task1.card;
/*
The class is a VisaCard map template with implemented map methods
 */
public class VisaCard extends BaseCard{


    public VisaCard(int currentAmount, int idOfCard) {
        this.currentAmount = currentAmount;
        this.commission = 15;
        //this.serialNum = serialNum;
        this.idOfCard = idOfCard;
        this.currency = "USD";
        this.nameOfCard = "VISA";
    }

    @Override
    public boolean check(double transferAmount) {
        if (this.currentAmount < (1 + this.commission / 100) * transferAmount) {
            System.out.println("Перевод невозможен. Недостаточно средств для перевода");
            return false;
        } else if (transferAmount > 1899) {
            System.out.println("Перевод невозможен. Введите сумму меньше.");
            return false;
        }
        return true;
    }
}
