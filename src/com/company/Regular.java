package com.company;

import java.util.Scanner;

public class Regular {

    public int cVisits;
    public double cRate;
    public double avgVisitLength;

    public int classCost = 10;
    public double retailDiscount = 1;
    public double trainerRate = 25;
    public int memCost = 65;
    public boolean cusType = true;

    public double cWeight;
    public int cSSN;
    public double cHours;

    public Regular(double w, int s, double h)
    {
        cWeight = w;
        cSSN = s;
        cHours += h;
    }

    public void Visits()
    {
        cVisits++;
        avgVisitLength = cHours/cVisits;
    }

    Scanner inputI = new Scanner(System.in);
    public void Classes(int c)
    {
        System.out.println("How many classes did you take this visit?");
        int classNum = inputI.nextInt();
        cRate += classNum * c;
    }

    Scanner inputD = new Scanner(System.in);
    public void Retail(double d)
    {
        System.out.println("What was the cost of your retail purchases this visit?");
        double rCost = inputD.nextDouble();
        cRate += rCost * d;
    }

    public void PersonalTrainer(double p)
    {
        System.out.println("Did you hire a personal trainer this visit? (yes or no)");
        String pt = inputS.nextLine();
        if(pt.equalsIgnoreCase("yes"))
        {
            System.out.println("How many hours did you train with him/her?");
            double ptHours = inputD.nextDouble();
            cRate += p * ptHours;
        }
    }

    Scanner inputS = new Scanner(System.in);
    public void Membership(int m, boolean t)
    {
        if(t)
        {
            System.out.println("Would you like a membership? (yes or no)");
            String mem = inputS.nextLine();
            if(mem.equalsIgnoreCase("yes"))
            {
                cRate += m;
            }
        }
        else
        {
            System.out.println("Is this your first visit of the month? (yes or no)");
            String bc = inputS.nextLine();
            if(bc.equalsIgnoreCase("yes"))
            {
                cRate += m;
            }
        }
    }

}
