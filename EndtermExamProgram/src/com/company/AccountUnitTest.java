package com.company;

public class AccountUnitTest
{
    public static void main(String[] args)
    {
        Account[] accountArray = new Account[10];

        accountArray[0] = new Checking(3);
        accountArray[1] = new Checking(4);
        accountArray[2] = new Checking(5);
        accountArray[3] = new Checking(6);
        accountArray[4] = new Checking(7);
        accountArray[5] = new Savings(8, 1.2);
        accountArray[6] = new Savings(9, 1.4);
        accountArray[7] = new Savings(10, 1.6);
        accountArray[8] = new Savings(11, 1.8);
        accountArray[9] = new Savings(12, 2.0);

        for(int i = 0; i < accountArray.length; ++i)
            System.out.println(accountArray[i].getAccountInfo() + "\n");
    }
}