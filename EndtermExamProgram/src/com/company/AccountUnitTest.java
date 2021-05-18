package com.company;

public class AccountUnitTest
{
    public static void main(String[] args)
    {
        Checking aCheckingAccount = new Checking(1);
        Savings aSavingsAccount = new Savings(2, 2.5);

        System.out.println(aCheckingAccount.getAccountInfo());
        System.out.println(aSavingsAccount.getAccountInfo());
    }
}