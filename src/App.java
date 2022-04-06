import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

import model.Bank;
import model.BankAccount;
import utils.Gui;
import utils.Node;

public class App {
    public static void main(String[] args) {

        Bank bank = new Bank();
        Gui gui = new Gui();

        // BankAccount cliente1 = new BankAccount();
        // cliente1.setName("Juan");
        // cliente1.setPhoneNumber(999320003);
        // cliente1.setClientNumber(30);
        // cliente1.setBalance(2000);
        // cliente1.setAddress("Calle 28 #929 x28 y 18 Colonia ");
        // cliente1.setAntiguity(3);
        // BankAccount cliente2 = new BankAccount();
        // cliente2.setName("Omar");
        // cliente2.setPhoneNumber(999320003);
        // cliente2.setClientNumber(12);
        // cliente2.setBalance(1500);
        // cliente2.setAddress("Calle 88 #659 x98 y 8 Colonia ");
        // cliente2.setAntiguity(6);

        // BankAccount cliente3 = new BankAccount();
        // cliente3.setName("Fredy");
        // cliente3.setPhoneNumber(999320003);
        // cliente3.setClientNumber(1);
        // cliente3.setBalance(100);
        // cliente3.setAddress("Calle 3 #22 x28 y 11 Colonia ");
        // cliente3.setAntiguity(7);

        // bank.getTree().insert(cliente1);
        // bank.getTree().insert(cliente2);
        // bank.getTree().insert(cliente3);

        int menuOption;
        int modifyType;
        int modifyDataType;
        int reportType;
        boolean exitMenu = false;
        Scanner scanner = new Scanner(System.in);

        while (!exitMenu) {
            gui.showHomeView();
            try {
                menuOption = scanner.nextInt();
                switch (menuOption) {

                    case 1:
                        System.out.print("\033[H\033[2J");

                        BankAccount client = new BankAccount();
                        Random rand = new Random();
                        String data;
                        Long dataNum;
                        // int dataNum2;
                        double dataNum3;
                        int upperbound;
                        scanner.nextLine();
                        gui.headerEditableView("Register Client");

                        System.out.println("Name: ");
                        data = scanner.nextLine();
                        client.setName(data);

                        System.out.println("Phone: ");
                        dataNum = scanner.nextLong();
                        client.setPhoneNumber(dataNum);

                        // System.out.println("ClientNumber: ");
                        // dataNum2 = scanner.nextInt();
                        client.setClientNumber(bank.getClientIdsGenerator());

                        // System.out.println("AccountNumber: ");
                        // dataNum = scanner.nextLong();
                        upperbound = 99999;
                        client.setAccountNumber(rand.nextInt(upperbound));

                        System.out.println("Balance: ");
                        dataNum3 = scanner.nextLong();
                        client.setBalance(dataNum3);

                        scanner.nextLine();
                        System.out.println("Address: ");
                        data = scanner.nextLine();
                        client.setAddress(data);

                        upperbound = 10;
                        client.setAntiguity(rand.nextInt(upperbound));
                        bank.insertClient(client);
                        break;

                    case 2:

                        do {
                            System.out.print("\033[H\033[2J");
                            modifyType = gui.showModifyTypeView();
                        } while (modifyType < 1 || modifyType > 2);
                        switch (modifyType) {
                            // Modify Personal information
                            case 1:

                                BankAccount clientValidation = new BankAccount();
                                int clientIdInput;
                                System.out.print("\033[H\033[2J");
                                gui.headerEditableView("Enter the customer ID");
                                clientIdInput = scanner.nextInt();
                                scanner.nextLine();
                                clientValidation.setClientNumber(clientIdInput);
                                Node<BankAccount> nodeValitation = bank.getTree().find(clientValidation);

                                // If the client exists
                                if (nodeValitation != null) {
                                    BankAccount clientModify = new BankAccount();
                                    clientModify = nodeValitation.getData();
                                    do {
                                        System.out.print("\033[H\033[2J");
                                        modifyDataType = gui.showModifyDataTypeView();
                                    } while (modifyDataType < 1 || modifyDataType > 3);
                                    switch (modifyDataType) {
                                        case 1:
                                            System.out.println("New Name:");
                                            data = scanner.nextLine();
                                            clientModify.setName(data);
                                            break;

                                        case 2:
                                            System.out.println("New PhoneNumber:");
                                            dataNum = scanner.nextLong();
                                            clientModify.setPhoneNumber(dataNum);
                                            break;

                                        case 3:
                                            System.out.println("New Address:");
                                            data = scanner.nextLine();
                                            clientModify.setAddress(data);
                                            break;

                                        default:
                                            System.out.println("Select a valid option");

                                    }
                                    break;

                                } else {
                                    System.out.println(">>>>>>>>>>> Client not found <<<<<<<<<<<<<");
                                }

                                // Modify Balance
                            case 2:
                                BankAccount clientValidationBalance = new BankAccount();
                                int clientIdInputBalance;
                                System.out.print("\033[H\033[2J");
                                gui.headerEditableView("Enter the customer ID");
                                clientIdInputBalance = scanner.nextInt();
                                scanner.nextLine();
                                clientValidationBalance.setClientNumber(clientIdInputBalance);
                                Node<BankAccount> nodeValitationBalance = bank.getTree().find(clientValidationBalance);

                                // If the client exists
                                if (nodeValitationBalance != null) {
                                    BankAccount clientModifyBalance = new BankAccount();
                                    clientModifyBalance = nodeValitationBalance.getData();
                                    gui.reportView();
                                    System.out.println("New Balance:");
                                    dataNum3 = scanner.nextLong();
                                    clientModifyBalance.setBalance(dataNum3);
                                    break;

                                } else {
                                    System.out.println(">>>>>>>>>>> Client not found <<<<<<<<<<<<<");
                                }
                                break;
                            default:
                                System.out.println("Select a valid option");
                        }
                        break;

                    case 3:
                        System.out.print("\033[H\033[2J");

                        int clientId;
                        gui.headerEditableView("Delete Client ");
                        System.out.println("Provide the client id");
                        clientId = scanner.nextInt();
                        BankAccount tempAccount = new BankAccount();
                        tempAccount.setClientNumber(clientId);
                        bank.deleteCliente(tempAccount);
                        break;

                    case 4:
                        //
                        do {
                            System.out.print("\033[H\033[2J");
                            reportType = gui.showReportTypeView();
                        } while (reportType < 1 || reportType > 2);
                        switch (reportType) {
                            case 1:
                                gui.reportView();
                                bank.generateReport(1);
                                break;
                            case 2:
                                gui.reportView();
                                bank.generateReport(2);
                                break;
                            default:
                                System.out.println("Select a valid option");
                        }

                        break;

                    case 5:
                        exitMenu = true;
                        break;

                    default:
                        System.out.println("Select a valid option");
                }
            } catch (InputMismatchException e) {
                System.out.println("Select a valid option");
                scanner.next();
            }
        }

    }
}
