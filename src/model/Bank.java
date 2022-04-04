package model;

import utils.Tree;

public class Bank {
    Tree <BankAccount> tree;


    public Bank(){
        tree = new Tree<>();
    }

    public void insertClient(){
        BankAccount cliente1 = new BankAccount();
        cliente1.setName("Juan");
        cliente1.setPhoneNumber(999320003);
        cliente1.setClientNumber(30);
        cliente1.setBalance(2000);
        cliente1.setAddress("Calle 28 #929 x28 y 18 Colonia ");
        cliente1.setAntiguity(3);
        BankAccount cliente2 = new BankAccount();
        cliente2.setName("Omar");
        cliente2.setPhoneNumber(999320003);
        cliente2.setClientNumber(12);
        cliente2.setBalance(2000);
        cliente2.setAddress("Calle 28 #929 x28 y 18 Colonia ");
        cliente2.setAntiguity(6);

        BankAccount cliente3 = new BankAccount();
        cliente3.setName("Fredy");
        cliente3.setPhoneNumber(999320003);
        cliente3.setClientNumber(1);
        cliente3.setBalance(2000);
        cliente3.setAddress("Calle 28 #929 x28 y 18 Colonia ");
        cliente3.setAntiguity(7);

        tree.insert(cliente1);
        tree.insert(cliente2);
        tree.insert(cliente3);
    }

    public void deleteCliente(long clientNumber){
        BankAccount cliente1 = new BankAccount();
        cliente1.setName("Juan");
        cliente1.setPhoneNumber(999320003);
        cliente1.setClientNumber(30);
        cliente1.setBalance(2000);
        cliente1.setAddress("Calle 28 #929 x28 y 18 Colonia ");
        cliente1.setAntiguity(3);
        tree.deleteKey(cliente1);
    }

    public void generateReport(){
        tree.traverse(2);
    }
}
