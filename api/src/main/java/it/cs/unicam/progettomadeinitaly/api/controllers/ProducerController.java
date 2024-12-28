package it.cs.unicam.progettomadeinitaly.api.controllers;

import it.cs.unicam.progettomadeinitaly.api.supplychain.ISupplyChainPoint;

import java.util.List;
import java.util.Scanner;

/**
 * Represents a controller that handles producer interactions on the system.
 */
public class ProducerController extends SupplyChainOperatorController {

    private final Scanner scanner = new Scanner(System.in);

    public boolean createContent(String author, List<ISupplyChainPoint> supplyChainPoints) {
        if (supplyChainPoints.isEmpty())
            return false;
        int operationChoice = 0;
        do {
            printContentCreationWelcomeMessage(author);
            operationChoice = scanner.nextInt();
        } while(operationChoice != 1 && operationChoice != 2);            
        return true;
    }

    private void printContentCreationWelcomeMessage(String author) {
        System.out.println("Welcome to Content Creation, Producer " + author);
        System.out.println("Please choose one of the following options:");
        System.out.println("1. Create a new Raw Product");
        System.out.println("2. Sell a new Raw Product");
    }

    // Ipotesi

    private boolean createRawProduct(String author, ISupplyChainPoint supplyChainPoint) {
        return true;
    }

    private boolean createRawProductOnSale(String author, ISupplyChainPoint supplyChainPoint) {
        return true;
    }

}
