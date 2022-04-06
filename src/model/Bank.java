package model;

import utils.Node;
import utils.Tree;

public class Bank {
    Tree<BankAccount> tree;
    int clientIdsGenerator;

    public Bank() {
        tree = new Tree<>();
        clientIdsGenerator = 1;
    }

    public void insertClient(BankAccount client) {
        tree.insert(client);
        clientIdsGenerator++;
    }

    public void deleteCliente(BankAccount client) {

        tree.deleteKey(client);
    }

    public void generateReport(int type) {
        switch (type) {
            case 1:
                tree.traverse(2);
                break;
            case 2:
                inOrderModify();
                break;

        }
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

    public void inOrderModify() {
        this.inOrderSpecific(tree.getRoot());
    }

    private void inOrderSpecific(Node<BankAccount> auxRoot) {

        if (auxRoot != null) {
            inOrderSpecific(auxRoot.getLeftChild());
            if (auxRoot.getData().getAntiguity() > 5) {
                System.out.println(auxRoot.getData());
            }
            inOrderSpecific(auxRoot.getRightChild());
        }

    }

}
