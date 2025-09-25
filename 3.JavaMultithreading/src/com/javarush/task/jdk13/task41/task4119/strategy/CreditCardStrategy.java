package com.javarush.task.jdk13.task41.task4119.strategy;

import com.javarush.task.jdk13.task41.task4119.customer.CreditCard;
import com.javarush.task.jdk13.task41.task4119.customer.Customer;

import java.time.LocalDate;

public class CreditCardStrategy implements PaymentStrategy {
    private final String name;
    private final String cardNumber;
    private final int cvv;
    private final LocalDate expireDate;

    public CreditCardStrategy(Customer customer) {
        this.name = customer.getName();
        this.cardNumber = customer.getCardNumber();
        this.cvv = customer.getCardCvv();
        this.expireDate = customer.getCardExpiryDate();
    }

    @Override
    public void pay(int amount) {
        // много важного кода
        System.out.printf("Оплачено товаров на $%d кредитной картой %s.\n", amount, cardNumber);
    }
}