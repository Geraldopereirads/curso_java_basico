package entities;

import java.util.Date;

public class Account {
    private Integer number;
    private String holder;
    private Double balance;
    private Date withdrawLimit;


    public Account() {

    }

    public Account(Double balance, String holder, Integer number, Date withdrawLimit) {
        this.balance = balance;
        this.holder = holder;
        this.number = number;
        this.withdrawLimit = withdrawLimit;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Date getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(Date withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    public void deposit(Double amount) {
        this.balance += amount;
    }

    public void withdraw(Double amount) {
        this.balance -= amount;
    }

}
