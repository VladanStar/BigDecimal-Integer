package com.company;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
	// write your code

        double cent = 74;
        double centSum = cent + cent + cent;
        System.out.println("Sum of cents: " + centSum);

        String strCents = Double.toString(cent); // pretvaramo double u string
        System.out.println("Str value: " + strCents);

        BigDecimal moneyCalculator = new BigDecimal(strCents);
        moneyCalculator = moneyCalculator.add(moneyCalculator).add(moneyCalculator);
        System.out.println("Sum of moneny: "+ moneyCalculator);

    }
}
