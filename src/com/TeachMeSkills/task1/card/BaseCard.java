package com.TeachMeSkills.task1.card;
/*
The class represents a basemap template
 */
public abstract class BaseCard {

    public long numOfCard;
    public int CVV;
    public double currentAmount;
    public double transferAmount;
    public double limitOfTransfer;
    public int idOfCard;
    public double commission;
    public String currency;
    public int serialNum;
    public String nameOfCard;

    public abstract boolean check(double transferAmount);
}
