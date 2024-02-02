package com.TeachMeSkills.task1.card;
/*
The class is a MasterCard map template with implemented map methods
 */
public class MasterCard extends BaseCard{

    public MasterCard(int currentAmount, int idOfCard) {
        this.currentAmount = currentAmount;
        this.commission = 25;
        //this.serialNum = serialNum;
        this.idOfCard = idOfCard;
        this.currency = "EUR";
        this.nameOfCard = "MasterCard";
    }
    @Override
    public boolean check(double transferAmount) {
        if (this.currentAmount < (1 + this.commission / 100) * transferAmount) {
            System.out.println("Перевод невозможен. Недостаточно средств для перевода");
            return false;
        } else if (transferAmount > 1999) {
            System.out.println("Перевод невозможен. Введите сумму меньше.");
            return false;
        }
        return true;
    }
}
