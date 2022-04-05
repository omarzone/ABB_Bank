package model;

import utils.Tree;

public class Bank {
    Tree <BankAccount> tree;
    int clientIdsGenerator;


    public Bank(){
        tree = new Tree<>();
        clientIdsGenerator = 1;
    }

    public void insertClient(BankAccount client){
        tree.insert(client);
        clientIdsGenerator++;
    }

    public void deleteCliente(BankAccount client){

        tree.deleteKey(client);
    }

    public void generateReport(){
        tree.traverse(2);
    }

    public int getClientIdsGenerator() {
        return clientIdsGenerator;
    }

    public void setClientIdsGenerator(int clientIdsGenerator) {
        this.clientIdsGenerator = clientIdsGenerator;
    }

    public Tree<BankAccount> getTree() {
        return tree;
    }

    public void setTree(Tree<BankAccount> tree) {
        this.tree = tree;
    }

    
}
