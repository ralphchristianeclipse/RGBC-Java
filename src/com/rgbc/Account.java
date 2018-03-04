package com.rgbc;

public class Account {
    private static Account[] _accounts = {
            new Account("0123-4567-8901", 1111, "Roel Richard", 5000.0),
            new Account("2345-6789-0123", 2222, "Dorie Marie", 0.0),
            new Account("3456-7890-1234", 3333, "Railee Darrel", 1000.0),
            new Account("4567-8901-2345", 4444, "Railynne Dessirei", 2500.0),
            new Account("5678-9012-3456", 5555, "Raine Dessirei", 10000.0)
    };

    private String _number;
    private int _pin;
    private String _name;
    private double _balance;

    public Account(String number, int pin, String name, double balance) {
        this.setName(name);
        this.setNumber(number);
        this.setPin(pin);
        this.setBalance(balance);
    }

    public static Account[] getAccounts() {
        return Account._accounts;
    }

    public static Account getAccount(int pin) {
        for(Account account : Account._accounts) {
            if(account.validatePin(pin)) {
                return account;
            }
        }
        return null;
    }

    public boolean validatePin(int pin) {
        return this._pin == pin;
    }

    public String getNumber() {
        return this._number;
    }

    public void setNumber(String number) {
        this._number = number;
    }
    public int getPin() {
        return this._pin;
    }

    public void setPin(int pin) {
        this._pin = pin;
    }

    public double getBalance() {
        return this._balance;
    }

    public void setBalance(double balance) {
        this._balance = balance;
    }

    public String getName() {
        return this._name;
    }

    public void setName(String name) {
        this._name = name;
    }

    public static class Main {

        public static void main(String[] args) {
            System.out.println("FUCK");

        }
    }
}