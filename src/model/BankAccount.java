package model;

public class BankAccount implements Comparable<BankAccount> {

    private String name;
    private long phoneNumber;
    private String address;
    private long clientNumber;
    private double balance;
    private int antiguity;

    public BankAccount(String name, long phoneNumber, String address, long clientNumber, double balance) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.clientNumber = clientNumber;
        this.balance = balance;
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
    public long getClientNumber() {
        return clientNumber;
    }
    public void setClientNumber(long clientNumber) {
        this.clientNumber = clientNumber;
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

    @Override
    public int compareTo(BankAccount au) {
        if(au.clientNumber < this.clientNumber){
            return 1;
        }else if( au.clientNumber > this.clientNumber){
            return -1;
        }else{
            return 0;
        }
    }


    @Override
    public String toString() {
        String client =  "Cliente#"+ this.clientNumber + " Nombre: "+ this.name + " Balance:"+ this.balance  + " antiguedad: " + this.antiguity+ "\n";
        return client;
    }
    
}
