/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car.dealership.management.program;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author macbookpro
 */
public class CarDealership {

    private Car carOne;
    private Car carTwo;
    private Car carThree;
    private double dailyTransactions = 0;
    private int status = 0;
    ArrayList<Car> cars = new ArrayList();

    public CarDealership(Car carOne, Car carTwo, Car carThree) {
        this.carOne = carOne;
        this.carTwo = carTwo;
        this.carThree = carThree;
    }

    public void performMaintenance(Scanner sc) throws Exception {
        System.out.println("Welcome to the Maintenance Menu!");
        while (true) {
            System.out.println("Please select the service you wish to record:");
            System.out.println("1. Oil Change ($50)\n"
                    + "2. Tire Rotation ($30)\n"
                    + "3. Detailing ($100)\n"
                    + "4. Tune-up ($200)");
            int ans = sc.nextInt();
            if (ans < 1 || ans > 4) {
                throw new Exception();
            }
            switch (ans) {
                case 1:
                    dailyTransactions += 50;
                    break;
                case 2:
                    dailyTransactions += 30;
                    break;
                case 3:
                    dailyTransactions += 100;
                    break;
                case 4:
                    dailyTransactions += 200;
                    break;
            }
            System.out.println("Your selection has been recorded!");
            System.out.println("Did you sell another service?");
            System.out.println("1. Yes\n"
                    + "2. No");
            int num = sc.nextInt();
            if (num < 1 || num > 2) {
                throw new Exception();
            }
            if (num == 2) {
                break;
            }
        }
        System.out.println("Thank you! Now returning to the Main Menu...");
        menu();

    }

    public void sellCar(Scanner sc) throws Exception {
        int sold = 0;
        System.out.println("Welcome to the Sales Menu!");
        if (status == 0) {
            cars.add(carOne);
            cars.add(carTwo);
            cars.add(carThree);
            status = 1;
        }
        while (!cars.isEmpty()) {
            ArrayList<Car> newCars = new ArrayList();
            System.out.println("Current Inventory is Listed Below:");

            for (Car c : cars) {
                System.out.println(c.toString());
            }
            switch (sold) {
                case 0:
                    System.out.println("Did you sell a vehicle?");
                    break;
                case 1:
                    System.out.println("Did you sell another vehicle?");
                    break;
            }
            System.out.println("1. Yes\n" + "2. No");
            int num = sc.nextInt();
            if (num < 1 || num > 2) {
                throw new Exception();
            }
            if (num == 1) {
                System.out.println("Which vehicle was sold? Please enter the Make, Model, and Year separated by commas.");
                String answer = sc.next();

                for (Car c : cars) {
                    if ((c.getMake() + "," + c.getModel() + "," + c.getYear()).equalsIgnoreCase(answer)) {
                        continue;
                    } else {
                        newCars.add(c);
                    }
                }

                sold = 1;
                cars = newCars;
                dailyTransactions += 15000;
                System.out.println("The vehicle list has been updated!");

            } else {
                break;
            }
        }
        if (cars.isEmpty()) {
            System.out.println("No vehicles currently available.");
        }
        System.out.println("Thank you! Now returning to the Main Menu...");
        menu();
    }

    public void buyCar(Scanner sc) throws Exception {
        int bought = 0;
        System.out.println("Welcome to the Purchasing Menu!");
        if (status == 0) {
//                cars.add(carOne);         
//                cars.add(carTwo);           
            cars.add(carThree);
            status = 1;
        }
        while (true) {
            System.out.println("Current Inventory is Listed Below:");
            for (Car c : cars) {
                System.out.println(c.toString());
            }
            if (cars.size() < 3) {
                switch (bought) {
                    case 0:
                        System.out.println("Did you purchase a vehicle?");
                        break;
                    case 1:
                        System.out.println("Did you purchase another vehicle?");
                        break;
                }
                System.out.println("1. Yes\n" + "2. No");
                int num = sc.nextInt();
                if (num < 1 || num > 2) {
                    throw new Exception();
                }
                if (num == 1) {
                    System.out.println("Please enter the Vehicle Details!");
                    System.out.println("Make:");
                    String make = sc.next();
                    System.out.println("Model:");
                    String model = sc.next();
                    System.out.println("Year:");
                    int year = sc.nextInt();
                    cars.add(new Car(make, model, year));
                    bought = 1;
                    dailyTransactions -= 10000;
                } else {
                    break;
                }
            } else {
                System.out.println("The Vehicle Inventory is now full.");
                break;
            }
        }
        System.out.println("Thank you! Now returning to the Main Menu...");
        menu();
    }

    public void printInventory() {
        System.out.println("Current Inventory is Listed Below:");
        if (status == 0) {
            cars.add(carOne);
            cars.add(carTwo);
            cars.add(carThree);
        }
        for (Car c : cars) {
            System.out.println(c.toString());
        }

    }

    public void menu() {
        try {
            System.out.println("Welcome to the Main Menu!");
            System.out.printf("The Daily Transactions value is currently: $%.2f\n", dailyTransactions);
            System.out.println("Please select an Option:");
            System.out.println("1. Perform Maintenance\n"
                    + "2. Sell Car\n"
                    + "3. Buy Car\n"
                    + "4. Print Inventory\n"
                    + "5. Quit");
            Scanner scan = new Scanner(System.in);
            int answer = scan.nextInt();
            switch (answer) {
                case 1:
                    performMaintenance(scan);
                    break;
                case 2:
                    sellCar(scan);
                    break;
                case 3:
                    buyCar(scan);
                    break;
                case 4:
                    printInventory();
                    break;
                case 5:
                    System.out.println("Thank you for using the Car Dealership program!");
                    break;
            }
        } catch (Exception e) {
            System.out.println("An error occurred!");
            menu();
        }
    }
}
