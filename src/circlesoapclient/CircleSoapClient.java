/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circlesoapclient;

import java.util.Scanner;

/**
 *
 * @author siriya_s
 */
public class CircleSoapClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(true) {
            System.out.println("Welcome to circle area and circumference calculator!");
            System.out.println("Select the number of operator you want to use.");
            System.out.println("1. Find circle's area");
            System.out.println("2. Find circle's circumference");
            System.out.println("0 for EXIT");
            System.out.print(">> ");
            int choose = input.nextInt();
            if(choose == 0) {
                System.out.println("EXIT!!");
                return;
            }
            System.out.print("Enter circle's radius: ");
            double r = input.nextDouble();
            if(choose == 1) {
                System.out.println("Circle's area is " + findArea(r) + "\n");
            }
            else if(choose == 2) {
                System.out.println("Circle's circumference is " + findCircumference(r) + "\n");
            }
        }
    }

    private static Double findArea(double radius) {
        serviceclient.CircleService_Service service = new serviceclient.CircleService_Service();
        serviceclient.CircleService port = service.getCircleServicePort();
        return port.findArea(radius);
    }

    private static Double findCircumference(double radius) {
        serviceclient.CircleService_Service service = new serviceclient.CircleService_Service();
        serviceclient.CircleService port = service.getCircleServicePort();
        return port.findCircumference(radius);
    }
    
}
