package model;

public class BankAccount implements Comparable<BankAccount> {

    private String name;
    private long phoneNumber;
    private String address;
    private long clientNumber;
    private double balance;

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

    @Override
    public int compareTo(BankAccount o) {
        // TODO Auto-generated method stub
        return 0;
    }


    
    
}
