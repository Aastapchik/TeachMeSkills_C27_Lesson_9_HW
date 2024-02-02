package com.TeachMeSkills.task1.util;
/*
Contains a static method for finding the required currency conversion ratio
 */
public class Convert {

    public static double coefficient(String name1, String name2) {

        if (name1.equals("EUR") && name2.equals("BYN")) {
            return Const.EUR_TO_BYN;
        }
        if (name1.equals("BYN") && name2.equals("EUR")) {
            return Const.BYN_TO_EUR;
        }

        if (name1.equals("USD") && name2.equals("BYN")) {
            return Const.USD_TO_BYN;
        }
        if (name1.equals("BYN") && name2.equals("USD")) {
            return Const.BYN_TO_USD;
        }

        if (name1.equals("EUR") && name2.equals("USD")) {
            return Const.EUR_TO_USD;
        }
        if (name1.equals("USD") && name2.equals("EUR")) {
            return Const.USD_TO_EUR;
        }
        return 1;
    }
}
