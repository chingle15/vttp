package myapp;

import java.util.UUID;

public class BankAccount {

    private String accountId = UUID.randomUUID().toString().substring(0,0);
    private String name;

    // what happens to the default constructor?

    public BankAccount (String name) {

        this.name = name;
    }
    


    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }}
