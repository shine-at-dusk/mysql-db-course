package ua.lviv.iot.view;

import ua.lviv.iot.controller.Controller;

import java.sql.SQLException;
import java.util.Scanner;

public class MyView {
    private static final long MILLISECONDS_IN_DAY = 1000 * 60 * 60 * 24;
    private static Controller controller;
    private static String submenu =
            "\t1 - Find all\n\t2 - Find by id\n\t3 - Create\n\t4 - Update\n\t5 - Delete\n\tQ - Go back\n";

    public MyView() {
        controller = new Controller();
    }

    public void show() throws SQLException {
        String menuPoint;
        do {
            System.out.println("Press ENTER key to continue...");
            Scanner scanner = new Scanner(System.in);
            scanner.nextLine();

            outputMenu();
            System.out.print("\nPlease, select menu point: ");
            menuPoint = scanner.nextLine().toUpperCase();

            switch (menuPoint) {
                case "1":
                    workWithAccount();
                    break;
                case "2":
                    workWithCity();
                    break;
                case "3":
                    workWithClient();
                    break;
                case "4":
                    workWithCourier();
                    break;
                case "5":
                    workWithDepartment();
                    break;
                case "6":
                    workWithDepartmentType();
                    break;
                case "7":
                    workWithOperator();
                    break;
                case "8":
                    workWithOrder();
                    break;
                case "Q":
                    System.out.println("\n\nBye!");
                    break;
                default:
                    System.out.println("Menu point does not exist!");
            }
        } while (!menuPoint.equals("Q"));
//            myOrder.update(15, 5, 2, 5, 2, null,
//                    null, 5, 2, new BigDecimal(30), null, 2,
//                    new Date(System.currentTimeMillis()), new Date(System.currentTimeMillis() + MILLISECONDS_IN_DAY),
//                    null);
//            myOrder.delete(13);
//            myOrder.findById(7);
//            controller.updateCourier(5, 5, "Milley", "Rainov", "Solomona, 56",
//                    new BigDecimal("380508875412"), new Date(System.currentTimeMillis()).valueOf("1989-08-24"));
    }

    private void outputMenu() {
        System.out.println("\t\tMenu");
        System.out.println("(Choose Table to work with:)");
        System.out.print("\t1 - Account\n" + "\t2 - City\n" + "\t3 - Client\n" + "\t4 - Courier\n" +
                "\t5 - Department\n" + "\t6 - DepartmentType\n" + "\t7 - Operator\n" + "\t8 - Order\n" +
                "\tQ - Exit\n");
    }

    private void workWithAccount() throws SQLException {
        System.out.println("\tTable 'account'");
        System.out.println(submenu);
        System.out.print("Select point: ");
        switch (new Scanner(System.in).nextLine().toUpperCase()) {
            case "1":
                controller.findAllAccounts();
                break;
            case "2":
                System.out.print("Enter id: ");
                controller.findAccountById(new Scanner(System.in).nextInt());
                break;
            case "3":
                break;
            case "4":
                break;
            case "5":
                System.out.print("Enter id: ");
                controller.deleteAccount(new Scanner(System.in).nextInt());
                break;
            case "Q":
                break;
            default:
                System.out.println("Input is incorrect");
        }
    }

    private void workWithCity() throws SQLException {
        System.out.println("\tTable 'city'");
        System.out.println(submenu);
        System.out.print("Select point: ");
        switch (new Scanner(System.in).nextLine().toUpperCase()) {
            case "1":
                controller.findAllCities();
                break;
            case "2":
                System.out.print("Enter id: ");
                controller.findCityById(new Scanner(System.in).nextLine());
                break;
            case "3":
                break;
            case "4":
                break;
            case "5":
                System.out.print("Enter id: ");
                controller.deleteCity(new Scanner(System.in).nextLine());
                break;
            case "Q":
                break;
            default:
                System.out.println("Input is incorrect");
        }
    }

    private void workWithClient() throws SQLException {
        System.out.println("\tTable 'client'");
        System.out.println(submenu);
        System.out.print("Select point: ");
        switch (new Scanner(System.in).nextLine().toUpperCase()) {
            case "1":
                controller.findAllClients();
                break;
            case "2":
                System.out.print("Enter id: ");
                controller.findClientById(new Scanner(System.in).nextInt());
                break;
            case "3":
                break;
            case "4":
                break;
            case "5":
                System.out.print("Enter id: ");
                controller.deleteClient(new Scanner(System.in).nextInt());
                break;
            case "Q":
                break;
            default:
                System.out.println("Input is incorrect");
        }
    }

    private void workWithCourier() throws SQLException {
        System.out.println("\tTable 'courier'");
        System.out.println(submenu);
        System.out.print("Select point: ");
        switch (new Scanner(System.in).nextLine().toUpperCase()) {
            case "1":
                controller.findAllCouriers();
                break;
            case "2":
                System.out.print("Enter id: ");
                controller.findCourierById(new Scanner(System.in).nextInt());
                break;
            case "3":
                break;
            case "4":
                break;
            case "5":
                System.out.print("Enter id: ");
                controller.deleteCourier(new Scanner(System.in).nextInt());
                break;
            case "Q":
                break;
            default:
                System.out.println("Input is incorrect");
        }
    }

    private void workWithDepartment() throws SQLException {
        System.out.println("\tTable 'department'");
        System.out.println(submenu);
        System.out.print("Select point: ");
        switch (new Scanner(System.in).nextLine().toUpperCase()) {
            case "1":
                controller.findAllDepartments();
                break;
            case "2":
                System.out.print("Enter id: ");
                controller.findDepartmentById(new Scanner(System.in).nextInt());
                break;
            case "3":
                break;
            case "4":
                break;
            case "5":
                System.out.print("Enter id: ");
                controller.deleteDepartment(new Scanner(System.in).nextInt());
                break;
            case "Q":
                break;
            default:
                System.out.println("Input is incorrect");
        }
    }

    private void workWithDepartmentType() throws SQLException {
        System.out.println("\tTable 'department_type'");
        System.out.println(submenu);
        System.out.print("Select point: ");
        switch (new Scanner(System.in).nextLine().toUpperCase()) {
            case "1":
                controller.findAllDepartmentTypes();
                break;
            case "2":
                System.out.print("Enter id: ");
                controller.findDepartmentTypeById(new Scanner(System.in).nextLine());
                break;
            case "3":
                break;
            case "4":
                break;
            case "5":
                System.out.print("Enter id: ");
                controller.deleteDepartmentType(new Scanner(System.in).nextLine());
                break;
            case "Q":
                break;
            default:
                System.out.println("Input is incorrect");
        }
    }

    private void workWithOperator() throws SQLException {
        System.out.println("\tTable 'operator'");
        System.out.println(submenu);
        System.out.print("Select point: ");
        switch (new Scanner(System.in).nextLine().toUpperCase()) {
            case "1":
                controller.findAllOperators();
                break;
            case "2":
                System.out.print("Enter id: ");
                controller.findOperatorById(new Scanner(System.in).nextInt());
                break;
            case "3":
                break;
            case "4":
                break;
            case "5":
                System.out.print("Enter id: ");
                controller.deleteOperator(new Scanner(System.in).nextInt());
                break;
            case "Q":
                break;
            default:
                System.out.println("Input is incorrect");
        }
    }

    private void workWithOrder() throws SQLException {
        System.out.println("\tTable 'order'");
        System.out.println(submenu);
        System.out.print("Select point: ");
        switch (new Scanner(System.in).nextLine().toUpperCase()) {
            case "1":
                controller.findAllOrders();
                break;
            case "2":
                System.out.print("Enter id: ");
                controller.findOrderById(new Scanner(System.in).nextInt());
                break;
            case "3":
                break;
            case "4":
                break;
            case "5":
                System.out.print("Enter id: ");
                controller.deleteOrder(new Scanner(System.in).nextInt());
                break;
            case "Q":
                break;
            default:
                System.out.println("Input is incorrect");
        }
    }
}
