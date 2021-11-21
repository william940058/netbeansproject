/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car.dealership.management.program;

/**
 *
 * @author Weilun Hung
 */
public class CarDealershipManagementProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Car car1 = new Car("Honda", "Accord", 2019);
        Car car2 = new Car("Toyota", "Camry", 2017);
        Car car3 = new Car("Saab", "9-3", 2005);
        CarDealership carDealership = new CarDealership(car1, car2, car3);
        carDealership.menu();

    }

}
