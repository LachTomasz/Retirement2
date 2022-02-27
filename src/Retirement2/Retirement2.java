package Retirement2;

import java.util.*;

/**
 * Ten program demonstruje sposób użycia pętli <code>do/while</code>.
 * This program demonstrates how to use loops <code>do/while</code>.
 * @author Tomek
 *
 */
public class Retirement2
{

    /**
     * @param args
     */
    public static void main(String[] args)
    {
        //Wczytywanie danych
        //Loading data
        Scanner in = new Scanner(System.in);

        System.out.print("Ile pieniędzy rocznie będziesz wpłacać? ");
        double payment = in.nextDouble();

        System.out.print("Stopa oprocentowania w %: ");
        double interestRate = in.nextDouble();

        double balance = 0;
        int year = 0;

        String input;

        //Aktualizacja stanu konta, kiedy użytkownik nie jest gotowy do przejścia na emeryturę.
        //Update account balance when user are not ready to retire.
        do
        {
            //Dodanie tegorocznych płatności i odsetek.
            //Add this year's payments and interest.
            balance += payment; //inaczej/otherwise => balance = balance + payment
            double interest = balance * interestRate / 100;
            balance += interest; //inaczej/otherwise => balance = balance + interest
            year++;

            //Drukowanie aktualnego stanu konta.
            //Print the current account status.
            System.out.printf("Po upływie %d lat stan twojego konta wyniesie %,.2f%n", year, balance);

            //Zapytanie o gotowość do przejścia na emeryturę i pobieranie danych.
            //Retirement readiness inquiry and data download.
            System.out.print("Chcesz przejść na emeryturę? (T/N)");
            input = in.next();
        }
        while (input.equals("N"));
    }
}
