package it.cs.unicam.progettomadeinitaly.api.controllers;

import it.cs.unicam.progettomadeinitaly.api.supplychain.ISupplyChainPoint;
import it.cs.unicam.progettomadeinitaly.api.supplychain.businessspecializations.DefaultSpecializationNames;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Represents a controller that handles producer interactions on the system.
 */
public class ProducerController extends SupplyChainOperatorController {

    private final Scanner scanner = new Scanner(System.in);

    public boolean createContent(String author, List<ISupplyChainPoint> supplyChainPoints) {
        if (supplyChainPoints.isEmpty())
            return false;
        int operationChoice = getOperationChoice(author);
        supplyChainPoints = getNecessarySupplyChainPoints(operationChoice, supplyChainPoints);
        int supplyChainPointChoice = getSupplyChainPointChoice(supplyChainPoints);
        ISupplyChainPoint supplyChainPoint = supplyChainPoints.get(supplyChainPointChoice);
        return startCreationProcess(operationChoice, author, supplyChainPoint);
    }

    private int getOperationChoice(String author) {
        int operationChoice = 0;
        do {
            printContentCreationWelcomeMessage(author);
            operationChoice = scanner.nextInt();
        } while (operationChoice != 1 && operationChoice != 2);
        return operationChoice;
    }

    private int getSupplyChainPointChoice(List<ISupplyChainPoint> supplyChainPoints) {
        int supplyChainPointChoice = 0;
        do {
            System.out.println("Please choose the supply chain where to create the new content");
            for (int i = 0; i < supplyChainPoints.size(); i++) {
                System.out.println("Choice: " + i + " Supply Chain Point: " + supplyChainPoints.get(i).getName());
            }
            supplyChainPointChoice = scanner.nextInt();
        } while (supplyChainPointChoice < 0 || supplyChainPointChoice >= supplyChainPoints.size());
        return supplyChainPointChoice;
    }

    private boolean startCreationProcess(int operationChoice, String author, ISupplyChainPoint supplyChainPoint) {
        if (operationChoice == 1)
            return createRawProduct(author, supplyChainPoint);
        else
            return createRawProductOnSale(author, supplyChainPoint);
    }

    private void printContentCreationWelcomeMessage(String author) {
        System.out.println("Welcome to Content Creation, Producer " + author);
        System.out.println("Please choose one of the following options:");
        System.out.println("1. Create a new Raw Product");
        System.out.println("2. Sell a new Raw Product");
    }

    private List<ISupplyChainPoint> getNecessarySupplyChainPoints(int operationChoice, List<ISupplyChainPoint> supplyChainPoints) {
        String specializationName = (operationChoice == 1) ?
                DefaultSpecializationNames.PRODUCTION_SPECIALIZATION.getName() :
                DefaultSpecializationNames.RESALE_SPECIALIZATION.getName();
        return getSupplyChainPointsBySpecialization(supplyChainPoints, specializationName);
    }

    private List<ISupplyChainPoint> getSupplyChainPointsBySpecialization(List<ISupplyChainPoint> supplyChainPoints, String businessSpecializationName) {
        return supplyChainPoints.stream()
                .filter(point -> point.getBusinessSpecializationList().stream()
                        .anyMatch(specialization -> businessSpecializationName.equalsIgnoreCase(specialization.getName())))
                .collect(Collectors.toList());
    }

    private boolean createRawProduct(String author, ISupplyChainPoint supplyChainPoint) {
        // TODO implement
        return true;
    }

    private boolean createRawProductOnSale(String author, ISupplyChainPoint supplyChainPoint) {
        // TODO implement
        return true;
    }

}