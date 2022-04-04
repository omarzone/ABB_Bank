import model.BankAccount;
import utils.Tree;

public class App {
    public static void main(String[] args){
        Tree <BankAccount> tree = new Tree<>();

        BankAccount cliente1 = new BankAccount();

        cliente1.setName("Juan");
        cliente1.setPhoneNumber(999320003);
        cliente1.setClientNumber(30);
        cliente1.setBalance(2000);
        cliente1.setAddress("Calle 28 #929 x28 y 18 Colonia ");

        tree.insert(cliente1);

    }
}
