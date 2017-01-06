package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner inputS = new Scanner(System.in);
        Scanner inputD = new Scanner(System.in);
        Scanner inputI = new Scanner(System.in);

        System.out.println("What kind of customer are you? (Regular, Member, or Employee)");
        String cType = inputS.nextLine();
        System.out.println("What is your weight?");
        double weight = inputD.nextDouble();
        System.out.println("What is your social security number?");
        int SSN = inputI.nextInt();
        System.out.println("How many hours was your visit?");
        double hours = inputD.nextDouble();

        if(cType.equalsIgnoreCase("Regular"))
        {
            Regular customer = new Regular(weight, SSN, hours);
            customer.Visits();
            customer.Classes(customer.classCost);
            customer.Retail(customer.retailDiscount);
            customer.PersonalTrainer(customer.trainerRate);
            customer.Membership(customer.memCost, customer.cusType);
            System.out.println("Your total cost is: $" + customer.cRate);
        }
        if(cType.equalsIgnoreCase("Member"))
        {
            Member customer = new Member(weight, SSN, hours);
            customer.Visits();
            customer.Classes(customer.classCost);
            customer.Retail(customer.retailDiscount);
            customer.Aquatics(customer.aquaticCost);
            customer.PersonalTrainer(customer.trainerRate);
            customer.Membership(customer.memCost, customer.cusType);
            System.out.println("Your total cost is: $" + customer.cRate);
        }
        if(cType.equalsIgnoreCase("Employee"))
        {
            Employee customer = new Employee(weight, SSN, hours);
            customer.Visits();
            customer.Classes(customer.classCost);
            customer.Retail(customer.retailDiscount);
            customer.Aquatics(customer.aquaticCost);
            customer.PersonalTrainer(customer.trainerRate);
            customer.Membership(customer.memCost, customer.cusType);
            System.out.println("Your total cost is: $" + customer.cRate);
        }

    }
}
