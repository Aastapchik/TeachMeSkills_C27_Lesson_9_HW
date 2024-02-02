package com.TeachMeSkills.task1.runner;

import com.TeachMeSkills.task1.card.*;
import com.TeachMeSkills.task1.client.*;
import com.TeachMeSkills.task1.util.*;


import java.sql.SQLOutput;
import java.util.Scanner;

/*
The class is required to simulate the operation of the program
 */
public class Runner {
    public static void main(String[] args) {

        Client client = new Client(
                "Alex",
                "Bobikov",
                "1234-5678",
                1234,
                "BY",
                "Minsk",
                "Panchenko",
                "14");

        BaseCard BY1 = new BelCard(10000, 127);
        BaseCard BY2 = new BelCard(500, 261);
        BaseCard Visa1 = new VisaCard(753, 467);
        BaseCard Visa2 = new VisaCard(387, 173);
        BaseCard Visa3 = new VisaCard(837, 764);
        BaseCard MasterCard1 = new MasterCard(1058, 7634);
        BaseCard MasterCard2 = new MasterCard(2470, 3792);
        BaseCard MasterCard3 = new MasterCard(0, 7391);
        BaseCard[] card = new BaseCard[]{BY1, BY2, Visa1, Visa2, Visa3, MasterCard1, MasterCard2, MasterCard3};

        double startBalanceOfTheFirstCard = 0;

        double startBalanceOfTheSecondCard = 0;

        Scanner scanner = new Scanner(System.in);


        System.out.print("Введи id карты, с которой будет осуществлен перевод: ");
        int idTransfer = scanner.nextInt();

        System.out.print("Введи id карты, на которую будет осуществлен перевод: ");
        int idRecipient = scanner.nextInt();

        int indOfCard1 = -1;
        int indOfCard2 = -1;
        for (int i = 0; i < card.length; i++){
            if(idTransfer == card[i].idOfCard) indOfCard1 = i;
            if(idRecipient == card[i].idOfCard) indOfCard2 = i;
        }

        if(indOfCard1 == -1 && indOfCard2 == -1) {
            System.out.println("Таких карт не существует.");
            System.exit(1);
        }

        if(indOfCard1 == -1) {
            System.out.println("Карта, с которой необходимо осуществить перевод, не найдена.");
            System.exit(2);
        }
        if(indOfCard2 == -1) {
            System.out.println("Карта, на которую необходимо осуществить перевод, не найдена.");
            System.exit(3);
        }
        System.out.println("Вы действительно хотите перевести с карты " + card[indOfCard1].nameOfCard + " с ID " + card[indOfCard1].idOfCard + " на карту " + card[indOfCard2].nameOfCard + " с ID " + card[indOfCard2].idOfCard + "?");
        System.out.println("Введите Да для подтвержения и Нет для отказа");

        if(scanner.nextLine().equals("Да")) {
            System.out.println("Подтвержено.");
        }
        if(scanner.nextLine().equals("Нет")){
            System.out.println("Отказано.");
            System.exit(4);
        }


        int flag = 0;
        if(card[indOfCard1].nameOfCard.equals(card[indOfCard2].nameOfCard)) flag = 1;

        if(flag == 1)
        {
            System.out.println("Перевод осуществляется на карту одного типа. Перевод валюты не требуется.");
        }
        else {
            System.out.println("Валюта карты, с которой осуществляется перевод - " + card[indOfCard1].currency + ". Валюта карты, на которую осуществляется перевод - " + card[indOfCard2].currency + ".");
            System.out.println("Коэффициент конвертации: " + Convert.coefficient(card[indOfCard1].currency, card[indOfCard2].currency));
        }

        System.out.print("Введите сумму перевода: ");
        double sumOfTransfer = scanner.nextDouble();
        double correctedSumOfTransfer = sumOfTransfer * Convert.coefficient(card[indOfCard1].currency, card[indOfCard2].currency);
        startBalanceOfTheFirstCard = card[indOfCard1].currentAmount;
        startBalanceOfTheSecondCard = card[indOfCard2].currentAmount;

        if(card[indOfCard1].check(correctedSumOfTransfer)) {
            card[indOfCard1].currentAmount -= (1 + card[indOfCard1].commission/100)*correctedSumOfTransfer;
            card[indOfCard2].currentAmount += correctedSumOfTransfer;
        }

        System.out.println("Клиент: " + client.getName() + " " + client.getSurname());
        System.out.println("Количесто карт клиента: " + card.length);

        System.out.println("Карта " + card[indOfCard1].nameOfCard + ", ID карты " + card[indOfCard1].idOfCard + ". Баланс до перевода: " + startBalanceOfTheFirstCard);
        System.out.println("Карта " + card[indOfCard1].nameOfCard + ", ID карты " + card[indOfCard1].idOfCard + ". Баланс после перевода: " + card[indOfCard1].currentAmount);

        System.out.println("Карта " + card[indOfCard2].nameOfCard + ", ID карты " + card[indOfCard2].idOfCard + ". Баланс до перевода: " + startBalanceOfTheSecondCard);
        System.out.println("Карта " + card[indOfCard2].nameOfCard + ", ID карты " + card[indOfCard2].idOfCard + ". Баланс после перевода: " + card[indOfCard2].currentAmount);

        System.out.println("Комиссия за перевод составила: " + card[indOfCard1].commission/100 * correctedSumOfTransfer + " " + card[indOfCard2].currency);


    }
}
