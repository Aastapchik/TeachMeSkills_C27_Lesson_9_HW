package com.TeachMeSkills.task1.card;
/*
The class is a BelCard map template with implemented map methods
 */
public class BelCard extends BaseCard {

    public BelCard(int currentAmount, int idOfCard) {
        this.currentAmount = currentAmount;
        this.commission = 10;
        //this.serialNum = serialNum;
        this.idOfCard = idOfCard;
        this.currency = "BYN";
        this.nameOfCard = "BelCard";
    }

    @Override
    public boolean check(double transferAmount) {
        if (this.currentAmount < (1 + this.commission / 100) * transferAmount) {
            System.out.println("Перевод невозможен. Недостаточно средств для перевода");
            return false;
        } else if (transferAmount > 999) {
            System.out.println("Перевод невозможен. Введите сумму меньше.");
            return false;
        }
        return true;
    }
}
