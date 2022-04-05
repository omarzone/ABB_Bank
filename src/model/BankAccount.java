package model;

public class BankAccount implements Comparable<BankAccount> {

    private String name;
    private long phoneNumber;
    private String address;
    private long accountNumber;
    private double balance;
    private int antiguity;
    private int clientNumber;

    public BankAccount(String name, long phoneNumber, String address, long clientNumber, double balance) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.accountNumber = clientNumber;
        this.balance = balance;
        this.clientNumber = 0;
    }

    public BankAccount(){

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getAntiguity() {
        return antiguity;
    }

    public void setAntiguity(int antiguity) {
        this.antiguity = antiguity;
    }

    public int getClientNumber() {
        return clientNumber;
    }

    public void setClientNumber(int clientNumber) {
        this.clientNumber = clientNumber;
    }

    @Override
    public int compareTo(BankAccount au) {
        if(au.accountNumber < this.accountNumber){
            return 1;
        }else if( au.accountNumber > this.accountNumber){
            return -1;
        }else{
            return 0;
        }
    }


    @Override
    public String toString() {
        String client =  
        "ClientID#"+ this.clientNumber +
        " Name: "+ this.name + 
        " Balance:"+ this.balance + 
        " AccountNumber: " + this.accountNumber+ 
        " Antiguity: " + this.antiguity+ 
        " PhoneNumber: " + this.phoneNumber+ 
        " Address: " + this.address+ 
        "\n";
        return client;
    }
    
}
